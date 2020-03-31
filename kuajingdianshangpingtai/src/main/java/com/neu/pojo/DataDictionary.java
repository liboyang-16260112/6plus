package com.neu.pojo;

import org.springframework.stereotype.Component;

@Component
public class DataDictionary {
	private int dic_id;
	private String type;
	private String dic_description;
	private int code;
	public DataDictionary(int dic_id, String type, String dic_description, int code) {
		super();
		this.dic_id = dic_id;
		this.type = type;
		this.dic_description = dic_description;
		this.code = code;
	}
	public DataDictionary() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getDic_id() {
		return dic_id;
	}
	public void setDic_id(int dic_id) {
		this.dic_id = dic_id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getDic_description() {
		return dic_description;
	}
	public void setDic_description(String dic_description) {
		this.dic_description = dic_description;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	
}
