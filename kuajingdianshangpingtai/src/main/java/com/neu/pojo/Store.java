package com.neu.pojo;

import org.springframework.stereotype.Component;

@Component
public class Store
{
	private int storeid;
	private String storename;
	private String storetype;
	private String sellid;
	private String marketplaceid;
	public int getStoreid()
	{
		return storeid;
	}
	public void setStoreid(int storeid)
	{
		this.storeid = storeid;
	}
	public String getStorename()
	{
		return storename;
	}
	public void setStorename(String storename)
	{
		this.storename = storename;
	}
	public String getStoretype()
	{
		return storetype;
	}
	public void setStoretype(String storetype)
	{
		this.storetype = storetype;
	}
	public String getSellid()
	{
		return sellid;
	}
	public void setSellid(String sellid)
	{
		this.sellid = sellid;
	}
	public String getMarketplaceid()
	{
		return marketplaceid;
	}
	public void setMarketplaceid(String marketplaceid)
	{
		this.marketplaceid = marketplaceid;
	}
	public Store(int storeid, String storename, String storetype, String sellid, String marketplaceid)
	{
		super();
		this.storeid = storeid;
		this.storename = storename;
		this.storetype = storetype;
		this.sellid = sellid;
		this.marketplaceid = marketplaceid;
	}
	public Store()
	{
		super();
		// TODO Auto-generated constructor stub
	}

}
