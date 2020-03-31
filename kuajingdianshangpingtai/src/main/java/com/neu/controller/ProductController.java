package com.neu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.neu.pojo.Goods;
import com.neu.service.ProductService;

@Controller
public class ProductController {
	@Autowired
	private ProductService productService;

//商品信息页面展示
	@RequestMapping("/productInput-attr")
	public String queryAll(Model model) {
		return productService.productIndex(model);
	}

//添加商品信息功能
	@RequestMapping("/brand-production-attr2")
	public String addProducts(Goods goods, Model model) {
		return productService.addProduct(goods, model);
	}

//搜索框功能
	@RequestMapping("/form-search")
	public String queryAllByName() {
		return null;
	}
}
