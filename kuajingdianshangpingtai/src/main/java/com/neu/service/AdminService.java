package com.neu.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.neu.mapper.AdminMapper;
import com.neu.pojo.DataDictionary;
import com.neu.pojo.Parameter;



@Service
public class AdminService {
	@Autowired
	private AdminMapper adminMapper;
	
	public String abc(Model model) {
		ArrayList<Parameter> list=adminMapper.queryAll();
		model.addAttribute("parameter",list);
		return "parameter";
	}
	public String deleteParameter(String Parameter_id) {
		adminMapper.deleteParameter(Parameter_id);
		return "parameter";
	}
	public String parameter2(String Parameter_id,Integer Parameter_value,String Parameter_description) {
		adminMapper.parameter2(Parameter_id,Parameter_value,Parameter_description);
		return "parameter";
	}
	public String loadByid(String Parameter_id,Model model) {
		Parameter para= adminMapper.queryByid(Parameter_id);
		model.addAttribute("para", para);
		return "update";
	}
	public String upadteParameter(Parameter p,Model model) {
		adminMapper.upadteParameter(p);
		model.addAttribute("parameter", adminMapper.queryAll());
		return "parameter";
	}
	/*================================*/
	public String abc1(Model model) {
		ArrayList<DataDictionary> list=adminMapper.queryAll1();
		model.addAttribute("code",list);
		return "code";
	}
	public String deleteDd(int dic_id) {
		adminMapper.deleteDd(dic_id);;
		return "code";
	}
	public String Dd(String dic_type,String dic_description,Integer dic_code,String dic_value) {
		adminMapper.dd2(dic_type,dic_description,dic_code,dic_value);
		return "code";
	}
	public String loadBydid(int dic_id,Model model) {
		DataDictionary ddd= adminMapper.queryBydid(dic_id);
		model.addAttribute("ddd", ddd);
		return "update1";
	}
	public String upadteDd(DataDictionary d,Model model) {
		adminMapper.upadteDd(d);
		model.addAttribute("code", adminMapper.queryAll1());
		return "code";
	}
}
