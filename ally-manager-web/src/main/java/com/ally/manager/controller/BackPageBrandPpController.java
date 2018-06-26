package com.ally.manager.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ally.common.pojo.PageResult;
import com.ally.manager.pojo.my.MyTBrandPp;
import com.ally.manager.service.BackPageBrandPpService;
import com.ally.manager.utils.MSG;

@Controller
@RequestMapping("/back")
public class BackPageBrandPpController {
	@Resource
	private BackPageBrandPpService backPageBrandPpService;
	
	
	//分页查询品牌商-品牌
	@RequestMapping(value="MyBrandPpPage",method=RequestMethod.GET)
	@ResponseBody
	public PageResult MyBrandPpPage(Integer page,Integer rows) {
		PageResult result = backPageBrandPpService.getMyBrandPp(page, rows);
		return result;
	}
	
	//查询根据条件查询品牌商-品牌信息
		@RequestMapping(value="selectMyBrandPp",method=RequestMethod.POST,
				produces=MediaType.TEXT_PLAIN_VALUE+";charset=utf-8")
		@ResponseBody
		public MSG selectMyBrandPp(String username) {
			System.out.println(username);
			 List<MyTBrandPp> list = backPageBrandPpService.selectMyBrandPp(username);
			 if(list == null || list.size() == 0) {
				 return MSG.fail();
			 }
			return MSG.success().add("list", list);
		}
	
		//删除品牌商-品牌信息
		@RequestMapping(value="deleteMyBrandPp",method=RequestMethod.DELETE)
		@ResponseBody
		public MSG deleteMyBrandPp(String ids) {
			System.out.println("delete:"+ids);
			if(ids.contains("-")) {
				List<Integer> del_ids = new ArrayList<>();
				String[] str_ids = ids.split("-");
				//组装id集合
				for (String string : str_ids) {
					System.out.println(string);
					del_ids.add(Integer.parseInt(string));
				}
				backPageBrandPpService.deleteBatchMyBrandPp(del_ids);
			}else {
				Integer id = Integer.parseInt(ids);
				backPageBrandPpService.deleteMyBrandPp(id);
			}
			
			return MSG.success();
		}
	
		//修改品牌商-品牌信息
		@RequestMapping(value="updateBrandPp",method=RequestMethod.POST)
		@ResponseBody
		public MSG updateBrandPp(MyTBrandPp myTBrandPp) {
			System.out.println("当前时间:"+new Date());
			myTBrandPp.setUpdateTime(new Date());
			// myTBrandPp.setRegisterTime(new Date());
			int i = backPageBrandPpService.updateMyTBrandPp(myTBrandPp);
			if(i>0) {
				return MSG.success();
			}
			return MSG.fail();
		}
}
