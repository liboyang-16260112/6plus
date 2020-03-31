package com.neu.pojo;

import org.springframework.stereotype.Component;

@Component
public class Debit {
	private String name;
	private String email;
	private String telephone;
	private String seller_id;

	public Debit() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Debit(String name, String email, String telephone, String seller_id) {
		super();
		this.name = name;
		this.email = email;
		this.telephone = telephone;
		this.seller_id = seller_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getSeller_id() {
		return seller_id;
	}

	public void setSeller_id(String seller_id) {
		this.seller_id = seller_id;
	}

}
