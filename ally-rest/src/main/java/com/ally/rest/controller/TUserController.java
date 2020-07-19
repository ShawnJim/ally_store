package com.ally.rest.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ally.rest.po.Msg;
import com.ally.rest.po.TUser;
import com.ally.rest.service.TUserService;

/**
 * 用户数据控制层
 * @author Administrator
 *
 */
@Controller
public class TUserController {
	
	@Autowired
	TUserService tUserService;
	
	/**
	 * ����ǰ̨�������û�id�����û����ݵĻ�ȡ
	 * @param id
	 * @return
	 */
	@RequestMapping(value="/getUser/{id}",method=RequestMethod.GET)
	@ResponseBody
	public Msg getUser(@PathVariable("id")Integer id,HttpServletResponse response) {
		//������
		allowCrossDomain(response);
		System.out.println(id);
		try {
			TUser user = tUserService.getUser(id);
			return Msg.success().add("User", user);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return Msg.flia();
		}
		
	}
	
	public void allowCrossDomain(HttpServletResponse response) {
		//���ûش�����,�����������
		response.addHeader("Access-Control-Allow-Origin", "*");
		response.setCharacterEncoding("utf-8");
	}
	

}
