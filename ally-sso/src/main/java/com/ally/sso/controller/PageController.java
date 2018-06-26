package com.ally.sso.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 页面跳转Controller
 */
@Controller
@RequestMapping("/page")
public class PageController {

	@RequestMapping("/register")
	public String showRegister() {
		return "register";
	}
	
	@RequestMapping("/forget")
	public String showForget() {
		return "forget";
	}
	
	@RequestMapping("/contract")
	public String showContract() {
		return "contract";
	}
	
	@RequestMapping("/login")
	public String showLogin(String redirect, Model model) {
		model.addAttribute("redirect", redirect);
		return "login";
	}
}
