package com.neu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.neu.pojo.Bvowallet;
import com.neu.service.BvoWalletService;

@Controller
public class BvoWalletController {
	@Autowired
	private BvoWalletService bvoWalletService;
	
	@RequestMapping("/gotoWallet")
	public String gotoBvoWallet(Bvowallet bvowallet) {
		return bvoWalletService.queryBvoWallet(bvowallet);
	}
	
	@RequestMapping("/registWallet")
	public String registBvoWallet(Bvowallet bvowallet) {
		return bvoWalletService.addBvoWallet(bvowallet);
	}
	
	
	

}
