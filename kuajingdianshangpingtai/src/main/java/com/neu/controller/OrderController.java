package com.neu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.neu.pojo.Ordervo;
import com.neu.service.OrderService;

@Controller
public class OrderController {
	@Autowired
	private OrderService orderService;
	
	@RequestMapping("/debit-ordervoo")
	public String addOrdervo(Ordervo ordervo,Model model) {
		return orderService.addOrdervo(ordervo,model);
	}

}
