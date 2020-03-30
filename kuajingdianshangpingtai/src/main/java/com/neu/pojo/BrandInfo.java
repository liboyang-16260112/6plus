package com.neu.pojo;

import org.springframework.stereotype.Component;

@Component
public class BrandInfo {
	private int pid;
	private String cname;
	private String bname;
	private int bid;
	private String logo;

	public BrandInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BrandInfo(int pid, String cname, String bname, int bid, String logo) {
		super();
		this.pid = pid;
		this.cname = cname;
		this.bname = bname;
		this.bid = bid;
		this.logo = logo;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
	}

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

}
