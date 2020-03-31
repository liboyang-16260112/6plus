package com.neu.pojo;

import org.springframework.stereotype.Component;

@Component
public class Bvowallet {
	private String bvoaccount_name;
	private String cname;
	private String buyer_id;
	private String bvoaccount_email;
	private String bvoaccount_pwd;
	private String bvoccount_fund;
	
	public Bvowallet() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Bvowallet(String bvoaccount_name, String cname, String buyer_id, String bvoaccount_email, String bvoaccount_pwd,String bvoccount_fund ) {
		super();
		this.bvoaccount_name = bvoaccount_name;
		this.cname = cname;
		this.buyer_id = buyer_id;
		this.bvoaccount_email = bvoaccount_email;
		this.bvoaccount_pwd = bvoaccount_pwd;
		this.bvoccount_fund = bvoccount_fund;
		
	}

	public String getBvoaccount_name() {
		return bvoaccount_name;
	}

	public void setBvoaccount_name(String bvoaccount_name) {
		this.bvoaccount_name = bvoaccount_name;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getBuyer_id() {
		return buyer_id;
	}

	public void setBuyer_id(String buyer_id) {
		this.buyer_id = buyer_id;
	}

	public String getBvoaccount_email() {
		return bvoaccount_email;
	}

	public void setBvoaccount_email(String bvoaccount_email) {
		this.bvoaccount_email = bvoaccount_email;
	}

	public String getBvoaccount_pwd() {
		return bvoaccount_pwd;
	}

	public void setBvoaccount_pwd(String bvoaccount_pwd) {
		this.bvoaccount_pwd = bvoaccount_pwd;
	}

	public String getBvoccount_fund() {
		return bvoccount_fund;
	}

	public void setBvoccount_fund(String bvoccount_fund) {
		this.bvoccount_fund = bvoccount_fund;
	}
	
	

}
