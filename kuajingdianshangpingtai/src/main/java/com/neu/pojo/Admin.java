package com.neu.pojo;

import org.springframework.stereotype.Component;

@Component
public class Admin {
	private int aid;
	private String name;
	private String password;
	
	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Admin(int aid, String name, String password) {
		super();
		this.aid = aid;
		this.name = name;
		this.password = password;
	}
	
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	
	
}
