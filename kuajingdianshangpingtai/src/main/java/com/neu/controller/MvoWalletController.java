package com.neu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.neu.pojo.MvoWallet;
import com.neu.service.MvoWalletService;


@Controller
public class MvoWalletController {
	@Autowired
	private MvoWalletService mvoWalletService;

	
	@RequestMapping(value="/gotomvoWallet")

	public String gotoBvoWallet(MvoWallet mvoWallet,Model model) {
		
		return mvoWalletService.queryMvoWallet(mvoWallet,model);
	}

	@RequestMapping("/registMvoWallet")
	public String registBvoWallet(MvoWallet mvoWallet,Model model) {
		return mvoWalletService.addMvoWallet(mvoWallet,model);
	}

}
