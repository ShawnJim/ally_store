package com.ally.search.contorller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ally.search.po.Msg;
import com.ally.search.service.ItemService;

/**
 * 维护索引库
 * @author Administrator
 *
 */
@Controller
@RequestMapping("/manager")
public class ItemController {

	@Autowired
	ItemService itemService;
	
	/**
	 * 维护索引库
	 */
	@RequestMapping("/importall")
	@ResponseBody
	public Msg importAllItems() {
		System.out.println("11");
		Msg msg = itemService.importAllItems();
		return msg;
	}
	
}
