package com.neu.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.neu.mapper.ProductMapper;
import com.neu.pojo.Goods;

@Service
public class ProductService {
	@Autowired
	private ProductMapper productMapper;

	// 添加商品信息
	public String addProduct(Goods goods, Model model) {
		int result = productMapper.insertGoods(goods);
		if (result == 1) {
			productIndex(model);
			return "brand-productInput-attr";
		} else {
			return "error";
		}
	}

//商品录入页面回显产品信息
	public String productIndex(Model model) {
		model.addAttribute("productlist", queryAll());
		return "brand-productInput-attr";
	}

//由productIndex调用查询所有产品
	public ArrayList<Goods> queryAll() {
		return productMapper.selectAll();
	}

}
