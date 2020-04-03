package com.neu.pojo;

import org.springframework.stereotype.Component;

@Component
public class Wishlist {
	private int id;
	private String seller_id;
	private String good_id;
	private int price; 
	private String sku;

	public Wishlist() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Wishlist(int id, String seller_id, String good_id, int price, String sku) {
		super();
		this.id = id;
		this.seller_id = seller_id;
		this.good_id = good_id;
		this.price = price;
		this.sku = sku;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSeller_id() {
		return seller_id;
	}

	public void setSeller_id(String seller_id) {
		this.seller_id = seller_id;
	}

	public String getGood_id() {
		return good_id;
	}

	public void setGood_id(String good_id) {
		this.good_id = good_id;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	
}
