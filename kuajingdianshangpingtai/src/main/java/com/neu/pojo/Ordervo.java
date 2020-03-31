package com.neu.pojo;

import java.sql.Date;

import org.springframework.stereotype.Component;
@Component
public class Ordervo {

	private int order_quantity;
	private int order_status;
	private String order_id;
	private String seller_id;
	private String good_id;
	private String good_name;
	private String order_price;
	private String sku;
	private Date order_time;
	public int getOrder_quantity() {
		return order_quantity;
	}
	public void setOrder_quantity(int order_quantity) {
		this.order_quantity = order_quantity;
	}
	public int getOrder_status() {
		return order_status;
	}
	public void setOrder_status(int order_status) {
		this.order_status = order_status;
	}
	public String getOrder_id() {
		return order_id;
	}
	public void setOrder_id(String order_id) {
		this.order_id = order_id;
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
	public String getGood_name() {
		return good_name;
	}
	public void setGood_name(String good_name) {
		this.good_name = good_name;
	}
	public String getOrder_price() {
		return order_price;
	}
	public void setOrder_price(String order_price) {
		this.order_price = order_price;
	}
	public String getSku() {
		return sku;
	}
	public void setSku(String sku) {
		this.sku = sku;
	}
	public Date getOrder_time() {
		return order_time;
	}
	public void setOrder_time(Date order_time) {
		this.order_time = order_time;
	}
	public Ordervo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Ordervo(int order_quantity, int order_status, String order_id,
			String seller_id, String good_id, String good_name,
			String order_price, String sku, Date order_time) {
		super();
		this.order_quantity = order_quantity;
		this.order_status = order_status;
		this.order_id = order_id;
		this.seller_id = seller_id;
		this.good_id = good_id;
		this.good_name = good_name;
		this.order_price = order_price;
		this.sku = sku;
		this.order_time = order_time;
	}
	
}
