package com.neu.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.neu.mapper.BrandInfoMapper;
import com.neu.mapper.BrandMapper;
import com.neu.pojo.Brand;
import com.neu.pojo.BrandInfo;

@Service
public class BrandService {
	@Autowired
	private BrandMapper brandMapper;
	private BrandInfoMapper brandInfoMapper;

	// 通过品牌商公司名检索是否存在
	public Brand queryByCname(String cname) {
		return brandMapper.selectByCname(cname);
	}

//品牌商信息展示
	public String brandRegister(Brand brand, Model model) {
		// 先检索对应公司，再展示公司所拥有的品牌信息
		Brand brand1 = queryByCname(brand.getCname());
		if (brand1 != null) {
			// 回显公司信息和品牌信息
			model.addAttribute("brand", brandMapper.selectByCname(brand.getCname()));
			model.addAttribute("brandinfolist", brandInfoMapper.selectByCname(brand.getCname()));
			return "brand-brandInput";
		} else {
			int result = brandMapper.insertBrand(brand);
			if (result == 1) {
				// 回显公司信息和品牌信息
				model.addAttribute("brand", brandMapper.selectByCname(brand.getCname()));
				model.addAttribute("brandinfolist", brandInfoMapper.selectByCname(brand.getCname()));
				return "brand-brandInput";
			} else {
				return "brand-addbrand";
			}
		}

	}

}
