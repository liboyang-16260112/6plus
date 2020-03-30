package com.neu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.neu.pojo.Brand;
import com.neu.service.BrandService;

@Controller
public class BrandController {
	@Autowired
	private BrandService brandService;
	@RequestMapping("/brandregtister")
	public String brandRegister(Brand brand) {
		System.out.println(brand.getCname());
		return brandService.brandRegister(brand);
	}

}
