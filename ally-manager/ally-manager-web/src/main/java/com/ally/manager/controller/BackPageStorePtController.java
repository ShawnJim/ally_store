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
import com.ally.manager.pojo.my.MyTStorePt;
import com.ally.manager.service.BackPageStorePtService;
import com.ally.manager.utils.MSG;

@Controller
@RequestMapping("/back")
public class BackPageStorePtController {
	@Resource
	private BackPageStorePtService backPageStorePtService;
	
	//分页查询分销商-平台
	@RequestMapping(value="MyStorePtPage",method=RequestMethod.GET)
	@ResponseBody
	public PageResult MyStorePtPage(Integer page,Integer rows) {
		PageResult result = backPageStorePtService.getMyStorePt(page, rows);
		return result;
	}
	
	//查询根据条件查询分销商-平台
	@RequestMapping(value="selectMyStorePt",method=RequestMethod.POST)
	@ResponseBody
	public MSG selectMyStorePt(String wwwName) {
		System.out.println(wwwName);
		List<MyTStorePt> list = backPageStorePtService.selectMyStorePt(wwwName);
		if(list == null || list.size() == 0) {
		return MSG.fail();
		 }
		return MSG.success().add("list", list);
	}
	
	//删除分销商-平台信息
	@RequestMapping(value="deleteMyStorePt",method=RequestMethod.DELETE)
	@ResponseBody
	public MSG deleteMyStorePt(String ids) {
		System.out.println("delete:"+ids);
		if(ids.contains("-")) {
			List<Integer> del_ids = new ArrayList<>();
			String[] str_ids = ids.split("-");
			//组装id集合
			for (String string : str_ids) {
				System.out.println(string);
				del_ids.add(Integer.parseInt(string));
			}
			backPageStorePtService.deleteBatchMyStorePt(del_ids);
		}else {
			Integer id = Integer.parseInt(ids);
			backPageStorePtService.deleteMyStorePt(id);
		}
		
		return MSG.success();
	}	
	
	//修改分销商-平台信息
	@RequestMapping(value="updateStorePt",method=RequestMethod.POST)
	@ResponseBody
	public MSG updateStorePt(MyTStorePt myTStorePt) {
		myTStorePt.setUpdateTime(new Date());
		//admin.setRegisterTime(new Date());
		int i = backPageStorePtService.updateMyTStorePt(myTStorePt);
		if(i>0) {
			return MSG.success();
		}
		return MSG.fail();
	}
}
