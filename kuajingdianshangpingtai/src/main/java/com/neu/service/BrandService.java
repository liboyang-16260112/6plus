package com.neu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.neu.mapper.BrandMapper;
import com.neu.pojo.Brand;

@Service
public class BrandService {
	@Autowired
	private BrandMapper brandMapper;

	public String brandRegister(Brand brand) {
		int result = brandMapper.insertBrand(brand);
		if (result == 1) {
			return "brand-brandInput";
		} else {
			return "brand-addbrand";
		}

	}

}
