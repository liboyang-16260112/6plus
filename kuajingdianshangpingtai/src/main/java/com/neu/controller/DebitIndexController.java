package com.neu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DebitIndexController {
	@RequestMapping("/debitIndex")
	public String debitIndex() {
		return "debit-index";
	}
	@RequestMapping("/myinfo")
	public String myInfo() {
		return "bvo-myInfo";
	}

	@RequestMapping("/goodsstoreAdd")
	public String goodsStoreAdd() {
		return "bvo-goodsstoreAdd";
	}

	@RequestMapping("/bvo-index")
	public String bvoIndex() {
		return "bvo-index";
	}

	@RequestMapping("/wishlist")
	public String wishList() {
		return "bvo-wishlist";
	}

	@RequestMapping("/orderlist")
	public String orderList() {
		return "bvo-orderlist";
	}

	@RequestMapping("/gmcwallerAcount")
	public String gmcWallerAcount() {
		return "bvo-gmcwallerAcount";
	}

}
