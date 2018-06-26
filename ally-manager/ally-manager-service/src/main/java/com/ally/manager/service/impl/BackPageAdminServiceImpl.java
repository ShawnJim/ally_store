package com.ally.manager.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ally.common.pojo.PageResult;
import com.ally.manager.mapper.TAdminMapper;
import com.ally.manager.pojo.TAdmin;
import com.ally.manager.pojo.TAdminExample;
import com.ally.manager.service.BackPageAdminService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
@Service
public class BackPageAdminServiceImpl implements BackPageAdminService{
	@Autowired
	private TAdminMapper adminMapper;//管理员mapper
	
	@Override
	public PageResult getTAdminList(int page, int rows) {
		TAdminExample example = new TAdminExample();
		PageHelper.startPage(page, rows);
		List<TAdmin> list = adminMapper.selectByExample(example);
		//创建一个返回值对象
		PageResult result = new PageResult();
		result.setRows(list);
		//取记录总条数
		PageInfo<TAdmin> pageInfo = new PageInfo<>(list);
		//总页数
		result.setTotal(pageInfo.getTotal());
		//当前页
		result.setPageNum(pageInfo.getPageNum());
		//总页数
		result.setPages(pageInfo.getPages());
		//下一页
		result.setNextPage(pageInfo.getNextPage());
		//前一页
		result.setPrePage(pageInfo.getPrePage());
		//第一页
		result.setFirstPage(pageInfo.getFirstPage());
		//最后一页
		result.setLastPage(pageInfo.getLastPage());
		
		return result;
	}

	@Override
	public int insertTAmind(TAdmin admin) {
		return adminMapper.insert(admin);
	}

	@Override
	public boolean checkTAdmin(String username) {
		TAdminExample example = new TAdminExample();
		TAdminExample.Criteria criteria = example.createCriteria();
		criteria.andUsernameEqualTo(username);
		List<TAdmin> list = adminMapper.selectByExample(example);
		if(list !=null && list.size()>0) {
    		return false;
    	}
    	
    	return true;
	}

	@Override
	public void deleteTAdmin(int id) {
		adminMapper.deleteByPrimaryKey(id);
	}

	@Override
	public void deleteBatchTAdmin(List<Integer> ids) {
		TAdminExample example = new TAdminExample();
		TAdminExample.Criteria criteria = example.createCriteria();
		criteria.andIdIn(ids);
		adminMapper.deleteByExample(example);
	}

	@Override
	public int updateTAdmin(TAdmin  admin) {
		TAdminExample example = new TAdminExample();
		TAdminExample.Criteria criteria = example.createCriteria();
		criteria.andIdEqualTo(admin.getId());
		TAdmin result = adminMapper.selectByPrimaryKey(admin.getId());
		admin.setRegisterTime(result.getRegisterTime());
		int i = adminMapper.updateByPrimaryKey(admin);
		return i;
	}
	
	@Override
	public List<TAdmin> selectTAdmin(String username) {
		TAdminExample example = new TAdminExample();
		TAdminExample.Criteria criteria = example.createCriteria();
		criteria.andUsernameEqualTo(username);
		return adminMapper.selectByExample(example);
	}
}
