package com.neu.pojo;

public class Goods {

	private int good_id ;
	private int price;
	private int inventory ;
	private int pid ;
	private int bid ;
	private int good_length;
	private int good_width;
	private int good_height;
	private int weight;
	private int good_status ;
	private String good_name;
	private String sku;
	private String upc;
	private String ena;
	private String warranty;
	private String edescription ;
	private String aedescription ;
	private String good_img;
	private String good_type;
	public Goods() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Goods(int good_id, int price, int inventory, int pid, int bid,
			int good_length, int good_width, int good_height, int weight,
			int good_status, String good_name, String sku, String upc,
			String ena, String warranty, String edescription,
			String aedescription, String good_img, String good_type) {
		super();
		this.good_id = good_id;
		this.price = price;
		this.inventory = inventory;
		this.pid = pid;
		this.bid = bid;
		this.good_length = good_length;
		this.good_width = good_width;
		this.good_height = good_height;
		this.weight = weight;
		this.good_status = good_status;
		this.good_name = good_name;
		this.sku = sku;
		this.upc = upc;
		this.ena = ena;
		this.warranty = warranty;
		this.edescription = edescription;
		this.aedescription = aedescription;
		this.good_img = good_img;
		this.good_type = good_type;
	}
	public int getGood_id() {
		return good_id;
	}
	public void setGood_id(int good_id) {
		this.good_id = good_id;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getInventory() {
		return inventory;
	}
	public void setInventory(int inventory) {
		this.inventory = inventory;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public int getGood_length() {
		return good_length;
	}
	public void setGood_length(int good_length) {
		this.good_length = good_length;
	}
	public int getGood_width() {
		return good_width;
	}
	public void setGood_width(int good_width) {
		this.good_width = good_width;
	}
	public int getGood_height() {
		return good_height;
	}
	public void setGood_height(int good_height) {
		this.good_height = good_height;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getGood_status() {
		return good_status;
	}
	public void setGood_status(int good_status) {
		this.good_status = good_status;
	}
	public String getGood_name() {
		return good_name;
	}
	public void setGood_name(String good_name) {
		this.good_name = good_name;
	}
	public String getSku() {
		return sku;
	}
	public void setSku(String sku) {
		this.sku = sku;
	}
	public String getUpc() {
		return upc;
	}
	public void setUpc(String upc) {
		this.upc = upc;
	}
	public String getEna() {
		return ena;
	}
	public void setEna(String ena) {
		this.ena = ena;
	}
	public String getWarranty() {
		return warranty;
	}
	public void setWarranty(String warranty) {
		this.warranty = warranty;
	}
	public String getEdescription() {
		return edescription;
	}
	public void setEdescription(String edescription) {
		this.edescription = edescription;
	}
	public String getAedescription() {
		return aedescription;
	}
	public void setAedescription(String aedescription) {
		this.aedescription = aedescription;
	}
	public String getGood_img() {
		return good_img;
	}
	public void setGood_img(String good_img) {
		this.good_img = good_img;
	}
	public String getGood_type() {
		return good_type;
	}
	public void setGood_type(String good_type) {
		this.good_type = good_type;
	}
	
}
