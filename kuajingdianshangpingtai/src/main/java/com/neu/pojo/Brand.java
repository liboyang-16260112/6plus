package com.neu.pojo;

import org.springframework.stereotype.Component;

@Component
public class Brand {
	private String cname;
	private String introduction;
	private String reporttype;
	private String address;

	public Brand() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Brand(String cname, String introduction, String reporttype, String address) {
		super();
		this.cname = cname;
		this.introduction = introduction;
		this.reporttype = reporttype;
		this.address = address;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getIntroduction() {
		return introduction;
	}

	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}

	public String getReporttype() {
		return reporttype;
	}

	public void setReporttype(String reporttype) {
		this.reporttype = reporttype;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
