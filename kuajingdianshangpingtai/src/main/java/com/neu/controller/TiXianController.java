package com.neu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.neu.service.TiXianService;

@Controller
public class TiXianController {
	@Autowired
	private TiXianService tiXianService;
	
	public String tiXian() {
		return null;
	}

}
