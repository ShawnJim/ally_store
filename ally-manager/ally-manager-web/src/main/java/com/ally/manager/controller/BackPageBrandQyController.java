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
import com.ally.manager.pojo.my.MyTBrandQy;
import com.ally.manager.service.BackPageBrandQyService;
import com.ally.manager.utils.MSG;

@Controller
@RequestMapping("/back")
public class BackPageBrandQyController {
	@Resource
	private BackPageBrandQyService backPageBrandQyService;
	
	
	//分页查询品牌商-企业
	@RequestMapping(value="MyBrandQyPage",method=RequestMethod.GET)
	@ResponseBody
	public PageResult MyBrandQyPage(Integer page,Integer rows) {
		PageResult result = backPageBrandQyService.getMyBrandQy(page, rows);
		return result;
	}
	
	//查询根据条件查询品牌商-企业信息
	@RequestMapping(value="selectMyBrandQy",method=RequestMethod.POST)
	@ResponseBody
	public MSG selectMyBrandQy(String companyName) {
		System.out.println(companyName);
		List<MyTBrandQy> list = backPageBrandQyService.selectMyBrandQy(companyName);
		if(list == null || list.size() == 0) {
		return MSG.fail();
		 }
		return MSG.success().add("list", list);
	}
	
	//删除品牌商-企业信息
	@RequestMapping(value="deleteMyBrandQy",method=RequestMethod.DELETE)
	@ResponseBody
	public MSG deleteMyBrandQy(String ids) {
		System.out.println("delete:"+ids);
		if(ids.contains("-")) {
			List<Integer> del_ids = new ArrayList<>();
			String[] str_ids = ids.split("-");
			//组装id集合
			for (String string : str_ids) {
				System.out.println(string);
				del_ids.add(Integer.parseInt(string));
			}
			backPageBrandQyService.deleteBatchMyBrandQy(del_ids);
		}else {
			Integer id = Integer.parseInt(ids);
			backPageBrandQyService.deleteMyBrandQy(id);
		}
		
		return MSG.success();
	}
	
	//修改品牌商-企业信息
	@RequestMapping(value="updateBrandQy",method=RequestMethod.POST)
	@ResponseBody
	public MSG updateBrandQy(MyTBrandQy myTBrandQy) {
		myTBrandQy.setUpdateTime(new Date());
		//admin.setRegisterTime(new Date());
		int i = backPageBrandQyService.updateMyTBrandQy(myTBrandQy);
		if(i>0) {
			return MSG.success();
		}
		return MSG.fail();
	}
}
