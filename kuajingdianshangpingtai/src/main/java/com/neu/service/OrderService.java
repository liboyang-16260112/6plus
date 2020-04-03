package com.neu.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.neu.mapper.OrderMapper;
import com.neu.pojo.Ordervo;

@Service
public class OrderService {
	@Autowired
	private  OrderMapper orderMapper;
	
	public Ordervo queryByOrder_id(String order_id) {
		return orderMapper.selectByOrder_id(order_id);
	} 
	
	//订单增加
	public  String addOrdervo(Ordervo ordervo,Model model) {
		int result = orderMapper.insertOrdervo(ordervo);
		if(result ==1) {
			OrdervoIndex(model);
			return "bov-orderlist";
		}else {
			return "error";
		}		
	}
	
	private String OrdervoIndex(Model model) {
		model.addAttribute("bov-orderlist");
		return "bov-orderlist";
		
	}

	public Ordervo selectByOrder_id(String order_id) {
		return orderMapper.selectByOrder_id(order_id);
		
	}

	


}
