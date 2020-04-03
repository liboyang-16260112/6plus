package com.neu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.neu.pojo.DataDictionary;
import com.neu.pojo.Parameter;
import com.neu.service.AdminService;


@Controller
public class AdminController {
	@Autowired
	private AdminService adminService;
	
	
   @RequestMapping("/parameter")
	    public String abc(Model model) {
			return adminService.abc(model);
		}
   @RequestMapping("/queryByid")
  	public   String  queryByid(String Parameter_id,Model model){
     	return   adminService.loadByid(Parameter_id, model);
     }
	@RequestMapping("/update")
	public String upadteParameter(Parameter p,Model model) {
		return adminService.upadteParameter(p, model);
	}
	@RequestMapping("/delete")
	public String deleteParameter(String Parameter_id) {
		return adminService.deleteParameter(Parameter_id);
	}
	@RequestMapping("/insert")
	public String parameter2(String pa_id,Integer pa_value,String pa_description) {
		return adminService.parameter2(pa_id,pa_value,pa_description);
	}
	

	@RequestMapping("/code")
    public String abc1(Model model) {
		return adminService.abc1(model);
	}
@RequestMapping("/queryBydid")
	public   String  queryBydid(int dic_id,Model model){
 	return   adminService.loadBydid(dic_id, model);
 }
@RequestMapping("/update1")
public String upadteDd(DataDictionary d,Model model) {
	return adminService.upadteDd(d, model);
}
@RequestMapping("/delete1")
public String deleteDd(int dic_id) {
	return adminService.deleteDd(dic_id);
}
@RequestMapping("/insert1")
public String Dd(String dic_type,String dic_description,Integer dic_code,String dic_value) {
	return adminService.Dd(dic_type, dic_description, dic_code, dic_value);
}
}
