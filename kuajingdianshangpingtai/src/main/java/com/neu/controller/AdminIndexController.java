package com.neu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdminIndexController {

	@RequestMapping("/adminIndex")
	public String adminIndex() {
		return "admin-index";
	}

	@RequestMapping("/withdraw")
	public String withdraw() {
		return "admin-withdraw-audit";
	}

}
