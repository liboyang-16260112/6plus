package com.neu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;

import com.neu.service.UserService;



@Controller
public class UserController {

	@Autowired
	private   UserService userService;
	 @RequestMapping("regist")
	    public  String  regist(){
	    	return "reg";
	    }
	    @RequestMapping("/register")
	    public  String   register(String username,String pwd,String identity){
	    	return  userService.register(username, pwd,identity);
	    }
	    @RequestMapping("/userlog")
	    public   String  userlog(String username,String pwd,String identity){
	    	return  userService.login(username, pwd, identity);
	    }
	    
	    @RequestMapping("/log")
	    public  String   log(){
	    	return  "login";
	    }
}
