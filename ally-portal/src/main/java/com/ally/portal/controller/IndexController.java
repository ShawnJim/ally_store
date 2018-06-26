package com.ally.portal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	@RequestMapping("/index")
	public String showIndex() {
		return "index";
	}
	
	@RequestMapping("/bra_index")
	public String showBra_Index() {
		return "bra_index";
	}
	
	@RequestMapping("/bra_additem")
	public String showBra_AddItem() {
		return "bra_additem";
	}
	
	@RequestMapping("/bra_seleitem")
	public String showBra_SeleItem() {
		return "bra_seleitem";
	}
	
	@RequestMapping("/bra_edititem")
	public String showBra_EditItem() {
		return "bra_edititem";
	}
	
	@RequestMapping("/bra_actionedit")
	public String showBra_actionEdit() {
		return "bra_actionedit";
	}
	
	@RequestMapping("/bra_select_order")
	public String showBra_select_order() {
		return "bra_select_order";
	}
	
	@RequestMapping("/bra_error_order")
	public String bra_error_order() {
		return "bra_error_order";
	}
	
	@RequestMapping("/bra_timeout_order")
	public String bra_timeout_order() {
		return "bra_timeout_order";
	}
}
