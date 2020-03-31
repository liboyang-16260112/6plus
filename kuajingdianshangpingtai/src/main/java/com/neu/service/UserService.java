package com.neu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.neu.mapper.UserMapper;
import com.neu.pojo.User;




@Service
public class UserService {

	@Autowired
	 private  UserMapper   userMapper;
	 public  String  register(String username,String pwd,String identity){
		  try{
		  userMapper.insertUser(username, pwd,identity);
		  return  "login";
		  }catch(Exception  e){
			  e.printStackTrace();
			  return "reg";
		  }
	  }
	 
	 public User loadUserByName(String username){
		 return userMapper.queryByUsername(username);
	 }
	 
	  public   String  login(String username,String pwd, String identity){
		   User user= loadUserByName(username);
		   if(user.getPwd().equals(pwd)){
			   if(user.getIdentity().equals("品牌商")){
				   return "brand-index";
			   }if(user.getIdentity().equals("管理员")){
				   return "admin-withdraw-audit";
			   }else{
				   return "bvo-index";
			   }
		   }else{
			   return  "login";
		   }
	  }
		
}
	 