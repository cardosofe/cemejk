package com.cemejk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cemejk.service.AdminServiceImpl;

import lombok.extern.slf4j.Slf4j;

@Controller
public class CEMEJKController {
	
	@Autowired
	AdminServiceImpl adminService;
	
	@GetMapping("/login")
	public String showLogin() {
		return "login";
	}

	
	@GetMapping("/poslogin")
	public String login() {
		return "/poslogin";
	}
	
	

}
