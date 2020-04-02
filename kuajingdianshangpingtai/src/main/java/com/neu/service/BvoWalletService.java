package com.neu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neu.mapper.BvoWalletMapper;
import com.neu.pojo.Bvowallet;

@Service
public class BvoWalletService {
	@Autowired
	private BvoWalletMapper bvoWalletMapper;

	public String queryBvoWallet(Bvowallet bvowallet) {
		System.out.println(bvowallet.getBvoaccount_name());
		if (result(bvowallet.getBvoaccount_name()) != null) {
			this.queryBvoWalletAll(bvowallet);
		} else {
			return "brand-wallerAcountRegister2";
		}
		return null;
	}

//通过名字查询是否已经存在用户
	public Bvowallet result(String bvoaccount_name) {
		return bvoWalletMapper.selectBvowallet(bvoaccount_name);
	}

//查询用户信息
	public String queryBvoWalletAll(Bvowallet bvowallet) {
		int result = bvoWalletMapper.selectBvoAll(bvowallet);
		if (result == 1) {
			return "brand-gmcwallerAcount";
		} else {
			return "wallet-error1";
		}

	}

//注册钱包信息
	public String addBvoWallet(Bvowallet bvowallet) {
		int result1 = bvoWalletMapper.insertBvowallet(bvowallet);
		if (result1 == 1) {
			// 回显钱包信息和品牌信息
			// model.addAttribute("brand", brandMapper.selectByCname(brand.getCname()));
			// model.addAttribute("brandinfolist",
			// brandInfoMapper.selectByCname(brand.getCname()));
			return "brand-gmcwallerAcount";
		} else {
			return "error";
		}
	}

}
