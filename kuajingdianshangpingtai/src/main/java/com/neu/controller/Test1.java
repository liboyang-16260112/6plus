package com.neu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Test1 {
	@RequestMapping("/index")
	public String hi() {
		return "index";
	}

}
