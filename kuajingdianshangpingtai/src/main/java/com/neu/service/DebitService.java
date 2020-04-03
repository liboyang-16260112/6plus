package com.neu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neu.mapper.DebitMapper;

@Service
public class DebitService {

	@Autowired 
	private DebitMapper debitMapper;
	
	 public  String  addDebit(String dname,String email,String telephone){
		try{
		 debitMapper.insertDebit(dname, email, telephone);
		 return "bvo-goodsstoreAdd";
		}catch(Exception  e){
			  e.printStackTrace();
			  return "error";
		  }
	 }


	
	



}
