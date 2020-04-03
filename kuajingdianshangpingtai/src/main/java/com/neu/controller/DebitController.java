package com.neu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;




import com.neu.service.DebitService;

@Controller
public class DebitController {

	@Autowired
	private DebitService debitService;
	
	@RequestMapping("/addDebit")
	 public  String  addDebit(String dname,String email,String telephone){  	
    	return  debitService.addDebit(dname, email, telephone);
    }


}
