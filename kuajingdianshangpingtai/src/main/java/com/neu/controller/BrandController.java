package com.neu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.neu.service.BrandService;

@Controller
public class BrandController {
	@Autowired
	private BrandService brandService;

	@RequestMapping("/brandIndex")
	public String adminIndex() {
		return "brand-index";
	}

	@RequestMapping("/addbrand")
	public String add() {
		return "brand-addbrand";
	}

	@RequestMapping("/productInput-attr")
	public String productInputAttr() {
		return "brand-productInput-attr";
	}

	@RequestMapping("/productInput-pic")
	public String productInputPic() {
		return "brand-productInput-pic";
	}

	@RequestMapping("/brandorderlist")
	public String borderlist() {
		return "brand-orderlist";
	}

	@RequestMapping("/wallerAcountRegister")
	public String wallerAcountRegister() {
		return "brand-wallerAcountRegister";
	}

}
