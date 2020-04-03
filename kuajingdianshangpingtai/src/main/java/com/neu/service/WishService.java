package com.neu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.neu.mapper.WishMapper;

@Service
public class WishService {
	
	 @Autowired
	 private WishMapper wishMapper;
	 
	 public String addWish(String seller_id,String good_id,int price,String sku)
	 {
	  try
	  {
	   wishMapper.addWish(seller_id,good_id,price,sku);
	  // System.out.println("�����Ը��");
	   return "zzz";
	  }
	  catch (Exception e)
	  {
	   e.printStackTrace();
	   return "zzz";
	  }
	  
	 }
	 
	 public String bvoWishQueryAll(Model model)
	 {
	  model.addAttribute("wishlist", wishMapper.bvoWishQueryAll());
	  return "bvo-wishlist";
	  
	 }
}
