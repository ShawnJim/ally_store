package com.ally.sso.service.impl;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import com.ally.common.pojo.AllyResult;
import com.ally.common.utils.CookieUtils;
import com.ally.common.utils.JsonUtils;
import com.ally.manager.mapper.TUserMapper;
import com.ally.manager.mapper.my.MyTMoneyDetailMapper;
import com.ally.manager.pojo.TUser;
import com.ally.manager.pojo.TUserExample;
import com.ally.manager.pojo.my.MyTMoneyDetail;
import com.ally.sso.dao.JedisClient;
import com.ally.sso.service.UserService;


/**
 * 用户管理Service
 */
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private TUserMapper userMapper;
	
	@Autowired
	private MyTMoneyDetailMapper myTMoneyDetailMapper;
	
	@Autowired
	private JedisClient jedisClient;
	
	@Value("${REDIS_USER_SESSION_KEY}")
	private String REDIS_USER_SESSION_KEY;
	@Value("${SSO_SESSION_EXPIRE}")
	private Integer SSO_SESSION_EXPIRE;
	
	@Override
	public AllyResult checkData(String content, Integer type) {
		//创建查询条件
		TUserExample example = new TUserExample();
		TUserExample.Criteria criteria = example.createCriteria();
		//对数据进行校验：1,2,3,4分别代表username、phone、email,compellation
		//用户名校验
		if (1 == type) {
			criteria.andUsernameEqualTo(content);
		//电话校验
		} else if ( 2 == type) {
			criteria.andPhoneEqualTo(content);
		//email校验
		} else if(3 == type){
			criteria.andEmailEqualTo(content);
		}else if(4 == type) {
			criteria.andCompellationEqualTo(content);
		}
		//执行查询
		List<TUser> list = userMapper.selectByExample(example);
		if (list == null || list.size() == 0) {
			return AllyResult.ok(true);
		}
		return AllyResult.ok(false);
	}

	@Override
	public AllyResult createUser(TUser user) {
//		user.setUpdated(new Date());
//		user.setCreated(new Date());

		
		//创建用户
		user.setState(0);
		user.setUpdateTime(new Date());
		user.setRegisterTime(new Date());
		//md5加密
		user.setPassword(DigestUtils.md5DigestAsHex(user.getPassword().getBytes()));
		userMapper.insert(user);
		
		System.out.println("-======="+user.getUsername());
		TUserExample example = new TUserExample();
		TUserExample.Criteria criteria = example.createCriteria();
		criteria.andUsernameEqualTo(user.getUsername());
		List<TUser> list = userMapper.selectByExample(example);
		for (TUser tUser : list) {
			int i = myTMoneyDetailMapper.insert(tUser.getId());
			if(i > 0) {
				System.out.println("创建钱包成功");
				
			}else {
				System.out.println("创建钱包失败");
			}
		}
		return AllyResult.ok();
	}

	/**
	 * 用户登录
	 * <p>Title: userLogin</p>
	 * <p>Description: </p>
	 * @param username
	 * @param password
	 * @return
	 * @see com.ally.sso.service.UserService#userLogin(java.lang.String, java.lang.String)
	 */
	@Override
	public AllyResult userLogin(String username, String password,
			HttpServletRequest request, HttpServletResponse response) {
		
		TUserExample example = new TUserExample();
		TUserExample.Criteria criteria = example.createCriteria();
		criteria.andUsernameEqualTo(username);
		List<TUser> list = userMapper.selectByExample(example);
		//如果没有此用户名
		if (null == list || list.size() == 0) {
			return AllyResult.build(400, "用户名或密码错误");
		}
		TUser user = list.get(0);
		//比对密码
		if (!DigestUtils.md5DigestAsHex(password.getBytes()).equals(user.getPassword())) {
			return AllyResult.build(400, "用户名或密码错误");
		}
		//生成token
		String token = UUID.randomUUID().toString();
		//保存用户之前，把用户对象中的密码清空。
		user.setPassword(null);
		//把用户信息写入redis
		jedisClient.set(REDIS_USER_SESSION_KEY + ":" + token, JsonUtils.objectToJson(user));
		//设置session的过期时间
		jedisClient.expire(REDIS_USER_SESSION_KEY + ":" + token, SSO_SESSION_EXPIRE);
		
		//添加写cookie的逻辑，cookie的有效期是关闭浏览器就失效。
		CookieUtils.setCookie(request, response, "TT_TOKEN", token);
		
		String json = jedisClient.get(REDIS_USER_SESSION_KEY + ":" + token);
		//返回token
		return AllyResult.ok(token).add("user", list);
	}

	@Override
	public AllyResult getUserByToken(String token) {
		
		//根据token从redis中查询用户信息
		String json = jedisClient.get(REDIS_USER_SESSION_KEY + ":" + token);
		//判断是否为空
		if (StringUtils.isBlank(json)) {
			return AllyResult.build(400, "此session已经过期，请重新登录");
		}
		//更新过期时间
		jedisClient.expire(REDIS_USER_SESSION_KEY + ":" + token, SSO_SESSION_EXPIRE);
		//返回用户信息
		return AllyResult.ok(JsonUtils.jsonToPojo(json, TUser.class));
	}

}
