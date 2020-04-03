package com.neu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.neu.pojo.Bvowallet;
import com.neu.service.BvoWalletService;

@Controller
public class BvoWalletController {
	@Autowired
	private BvoWalletService bvoWalletService;

	@RequestMapping(value = "/gotobvoWallet")

	public String gotoBvoWallet(Bvowallet bvowallet, Model model) {

		return bvoWalletService.queryBvoWallet(bvowallet, model);
	}

	@RequestMapping("/registBvoWallet")
	public String registBvoWallet(Bvowallet bvowallet, Model model) {
		return bvoWalletService.addBvoWallet(bvowallet, model);
	}

}
