package com.neu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.neu.mapper.MvoWalletMapper;
import com.neu.pojo.MvoWallet;

@Service
public class MvoWalletService {
	@Autowired
	private MvoWalletMapper mvoWalletMapper;

//进入钱包页面后保存按钮的功能
	public String queryMvoWallet(MvoWallet mvoWallet,Model model) {

		if (result(mvoWallet.getMvoaccount_name()) != null) {
			return queryMvoWalletAll(mvoWallet,model);
		} else {
			return "bvo-gmcwallerAcount2";
		}

	}

//通过名字查询是否已经存在用户
	public MvoWallet result(String bvoaccount_name) {

		return mvoWalletMapper.selectMvowallet(bvoaccount_name);
	}

//登录
	public String queryMvoWalletAll(MvoWallet mvoWallet,Model model) {
		MvoWallet result = mvoWalletMapper.selectMvoAll(mvoWallet);
		if (result != null) {
			 model.addAttribute("bvowallet", mvoWalletMapper.selectMvowallet(mvoWallet.getMvoaccount_name()));
			return "bvo-gmcwallermoney";
		} else {
			return "wallet-error";
		}

	}

//注册钱包信息
	public String addMvoWallet(MvoWallet mvoWallet,Model model) {
		int result1 = mvoWalletMapper.insertMvowallet(mvoWallet);
		if (result1 == 1) {
			// 回显钱包信息和品牌信息
			 model.addAttribute("bvowallet", mvoWalletMapper.selectMvowallet(mvoWallet.getMvoaccount_name()));
			// model.addAttribute("brandinfolist",
			// brandInfoMapper.selectByCname(brand.getCname()));
			return "bvo-gmcwallermoney";
		} else {
			return "wallet-error1";
		}
	}

}
