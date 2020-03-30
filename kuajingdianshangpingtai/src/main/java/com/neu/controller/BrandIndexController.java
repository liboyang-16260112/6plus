package com.neu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BrandIndexController {

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

	@RequestMapping("/bwallerAcountRegister")
	public String wallerAcountRegister() {
		return "brand-wallerAcountRegister";
	}

}
