package com.neu.pojo;

import org.springframework.stereotype.Component;

@Component
public class Logistics {
	private String order_id;
	private String tracking_number;
	private String address;
	
	public Logistics() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Logistics(String order_id, String tracking_number, String address) {
		super();
		this.order_id = order_id;
		this.tracking_number = tracking_number;
		this.address = address;
	}

	public String getOrder_id() {
		return order_id;
	}

	public void setOrder_id(String order_id) {
		this.order_id = order_id;
	}

	public String getTracking_number() {
		return tracking_number;
	}

	public void setTracking_number(String tracking_number) {
		this.tracking_number = tracking_number;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	

}
