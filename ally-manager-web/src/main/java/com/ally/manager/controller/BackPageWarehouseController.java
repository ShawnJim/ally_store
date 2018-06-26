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
import com.ally.manager.pojo.TWarehouse;
import com.ally.manager.service.BackPageWarehouseService;
import com.ally.manager.utils.MSG;

@Controller
@RequestMapping("/back")
public class BackPageWarehouseController {
	@Resource
	private BackPageWarehouseService backPageWarehouseService;
	
	//分页查询仓库管理
	@RequestMapping(value="warehousePage",method=RequestMethod.GET)
	@ResponseBody
	public PageResult getTWarehouseList(Integer page,Integer rows) {
		PageResult result = backPageWarehouseService.getTWarehouseList(page, rows);
		return result;
	}
	
/*	//根据条件查询仓库管理
	@RequestMapping(value="selectWarehouse",method=RequestMethod.POST)
	@ResponseBody
	public MSG selectWarehouse(String name) {
		 List<TWarehouse> list = backPageWarehouseService.selectTWarehouse(name);
		 if(list == null || list.size() == 0) {
			 return MSG.fail();
		 }
		return MSG.success().add("list", list);
	}
	
	//修改仓库信息
	@RequestMapping(value="updateWarehouse",method=RequestMethod.POST)
	@ResponseBody
	public MSG updateWarehouse(TWarehouse warehouse) {
		warehouse.setUpdatetime(new Date());
		//admin.setRegisterTime(new Date());
		int i = backPageWarehouseService.updateTWarehouse(warehouse);
		if(i>0) {
			return MSG.success();
		}
		return MSG.fail();
	}
	
	//删除仓库信息
	@RequestMapping(value="deleteWarehouse",method=RequestMethod.DELETE)
	@ResponseBody
	public MSG deleteWarehouse(String ids) {
		
		System.out.println("delete"+ids);
		if(ids.contains("-")) {
			List<Integer> del_ids = new ArrayList<>();
			String[] str_ids = ids.split("-");
			//组装id集合
			for (String string : str_ids) {
				del_ids.add(Integer.parseInt(string));
			}
			backPageWarehouseService.deleteBatchTWarehouse(del_ids);
		}else {
			Integer id = Integer.parseInt(ids);
			backPageWarehouseService.deleteTWarehouse(id);
		}
		return MSG.success();
	}*/
}
