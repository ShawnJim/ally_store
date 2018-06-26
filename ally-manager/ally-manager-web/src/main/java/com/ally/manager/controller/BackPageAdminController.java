package com.ally.manager.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ally.common.pojo.PageResult;
import com.ally.manager.pojo.TAdmin;
import com.ally.manager.service.BackPageAdminService;
import com.ally.manager.utils.MSG;

@Controller
@RequestMapping("/back")
public class BackPageAdminController {
	@Resource
	private BackPageAdminService backPageAdminService;
	
	
	//分页查询管理员信息
	@RequestMapping(value="adminPage",method=RequestMethod.GET)
	@ResponseBody
	public PageResult getTAdminList(Integer page,Integer rows) {
		PageResult result = backPageAdminService.getTAdminList(page, rows);
		return result;
	}
	
	//增加管理员
	@RequestMapping(value="insertAdmin",method=RequestMethod.POST)
	@ResponseBody
	public MSG insertAdmin(TAdmin admin){
		admin.setRegisterTime(new Date());
		admin.setUpdateTime(new Date());
		int i = backPageAdminService.insertTAmind(admin);
		if(i>0) {
			return MSG.success();
		}
		return MSG.fail();
		
	}
	
	
	//验证添加的管理员是否存在
	@RequestMapping(value="checkInsertAdmin",method=RequestMethod.POST)
	@ResponseBody
	public MSG checkInsertAdmin(String username) {
		boolean flag = backPageAdminService.checkTAdmin(username);
		if(flag==true) {
			return MSG.success();
		}
		return MSG.fail();
	}
	
	//删除管理员
	@RequestMapping(value="deleteAdmin",method=RequestMethod.DELETE)
	@ResponseBody
	public MSG deleteAdmin(String ids) {
		
		System.out.println("delete"+ids);
		if(ids.contains("-")) {
			List<Integer> del_ids = new ArrayList<>();
			String[] str_ids = ids.split("-");
			//组装id集合
			for (String string : str_ids) {
				del_ids.add(Integer.parseInt(string));
			}
			backPageAdminService.deleteBatchTAdmin(del_ids);
		}else {
			Integer id = Integer.parseInt(ids);
			backPageAdminService.deleteTAdmin(id);
		}
		
		return MSG.success();
	}
	
	//修改admin
	@RequestMapping(value="updateAdmin",method=RequestMethod.POST)
	@ResponseBody
	public MSG updateAdmin(TAdmin admin) {
		admin.setUpdateTime(new Date());
		//admin.setRegisterTime(new Date());
		int i = backPageAdminService.updateTAdmin(admin);
		if(i>0) {
			return MSG.success();
		}
		return MSG.fail();
	}
	//查询admin
	@RequestMapping(value="selectAdmin",method=RequestMethod.POST)
	@ResponseBody
	public MSG selectAdmin(String username) {
		 List<TAdmin> list = backPageAdminService.selectTAdmin(username);
		 if(list == null || list.size() == 0) {
			 return MSG.fail();
		 }
		return MSG.success().add("list", list);
	}
}
