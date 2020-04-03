package com.neu.pojo;

import org.springframework.stereotype.Component;

@Component
public class DataDictionary {
	private int dic_id;
	private String dic_type;
	private String dic_description;
	private int dic_code;
	private String dic_value;

	public DataDictionary() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DataDictionary(int dic_id, String dic_type, String dic_description, int dic_code, String dic_value) {
		super();
		this.dic_id = dic_id;
		this.dic_type = dic_type;
		this.dic_description = dic_description;
		this.dic_code = dic_code;
		this.dic_value = dic_value;
	}

	public int getDic_id() {
		return dic_id;
	}

	public void setDic_id(int dic_id) {
		this.dic_id = dic_id;
	}

	public String getDic_type() {
		return dic_type;
	}

	public void setDic_type(String dic_type) {
		this.dic_type = dic_type;
	}

	public String getDic_description() {
		return dic_description;
	}

	public void setDic_description(String dic_description) {
		this.dic_description = dic_description;
	}

	public int getDic_code() {
		return dic_code;
	}

	public void setDic_code(int dic_code) {
		this.dic_code = dic_code;
	}

	public String getDic_value() {
		return dic_value;
	}

	public void setDic_value(String dic_value) {
		this.dic_value = dic_value;
	}

	
}