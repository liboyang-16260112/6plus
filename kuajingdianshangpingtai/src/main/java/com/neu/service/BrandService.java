package com.neu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.neu.mapper.BrandMapper;
import com.neu.pojo.Brand;

@Service
public class BrandService {
	@Autowired
	private BrandMapper brandMapper;

	public String brandRegister(Brand brand,Model model) {
		int result = brandMapper.insertBrand(brand);
		if (result == 1) {
			//回显公司信息和品牌信息
			model.addAttribute("brand", brandMapper.selectByCname(brand.getCname()));
			return "brand-brandInput";
		} else {
			return "brand-addbrand";
		}

	}

}
