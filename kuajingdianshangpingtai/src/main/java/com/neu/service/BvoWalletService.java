package com.neu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.neu.mapper.BvoWalletMapper;
import com.neu.pojo.Bvowallet;

@Service
public class BvoWalletService {
	@Autowired
	private BvoWalletMapper bvoWalletMapper;

//进入钱包页面后保存按钮的功能
	public String queryBvoWallet(Bvowallet bvowallet,Model model) {

		if (result(bvowallet.getBvoaccount_name()) != null) {
			return queryBvoWalletAll(bvowallet,model);
		} else {
			return "brand-wallerAcountRegister2";
		}

	}

//通过名字查询是否已经存在用户
	public Bvowallet result(String bvoaccount_name) {

		return bvoWalletMapper.selectBvowallet(bvoaccount_name);
	}

//登录
	public String queryBvoWalletAll(Bvowallet bvowallet,Model model) {
		Bvowallet result = bvoWalletMapper.selectBvoAll(bvowallet);
		if (result != null) {
			 model.addAttribute("bvowallet", bvoWalletMapper.selectBvowallet(bvowallet.getBvoaccount_name()));
			return "brand-gmcwallerAcount";
		} else {
			return "wallet-error";
		}

	}

//注册钱包信息
	public String addBvoWallet(Bvowallet bvowallet,Model model) {
		int result1 = bvoWalletMapper.insertBvowallet(bvowallet);
		if (result1 == 1) {
			// 回显钱包信息和品牌信息
			 model.addAttribute("bvowallet", bvoWalletMapper.selectBvowallet(bvowallet.getBvoaccount_name()));
			// model.addAttribute("brandinfolist",
			// brandInfoMapper.selectByCname(brand.getCname()));
			return "brand-gmcwallerAcount";
		} else {
			return "wallet-error1";
		}
	}

}
