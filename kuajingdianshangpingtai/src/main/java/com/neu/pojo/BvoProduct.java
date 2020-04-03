package com.neu.pojo;

import org.springframework.stereotype.Component;

@Component
public class BvoProduct
{
	private int bvoproductid;
	private String bvoproductname;
	private String price;
	public int getBvoproductid()
	{
		return bvoproductid;
	}
	public void setBvoproductid(int bvoproductid)
	{
		this.bvoproductid = bvoproductid;
	}
	public String getBvoproductname()
	{
		return bvoproductname;
	}
	public void setBvoproductname(String bvoproductname)
	{
		this.bvoproductname = bvoproductname;
	}
	public String getPrice()
	{
		return price;
	}
	public void setPrice(String price)
	{
		this.price = price;
	}
	public BvoProduct(int bvoproductid, String bvoproductname, String price)
	{
		super();
		this.bvoproductid = bvoproductid;
		this.bvoproductname = bvoproductname;
		this.price = price;
	}
	public BvoProduct()
	{
		super();
		// TODO Auto-generated constructor stub
	}
	

}
