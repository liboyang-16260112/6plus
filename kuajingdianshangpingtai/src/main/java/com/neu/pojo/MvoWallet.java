package com.neu.pojo;

public class MvoWallet {
	private String mvoaccount_name;
	private String seller_id;
	private String buyer_id;
	private String mvoaccount_email;
	private String mvoaccount_pwd;
	private String mvoaccount_fund;

	public MvoWallet() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MvoWallet(String mvoaccount_name, String seller_id, String buyer_id, String mvoaccount_email,
			String mvoaccount_pwd, String mvoaccount_fund) {
		super();
		this.mvoaccount_name = mvoaccount_name;
		this.seller_id = seller_id;
		this.buyer_id = buyer_id;
		this.mvoaccount_email = mvoaccount_email;
		this.mvoaccount_pwd = mvoaccount_pwd;
		this.mvoaccount_fund = mvoaccount_fund;
	}

	public String getMvoaccount_name() {
		return mvoaccount_name;
	}

	public void setMvoaccount_name(String mvoaccount_name) {
		this.mvoaccount_name = mvoaccount_name;
	}

	public String getSeller_id() {
		return seller_id;
	}

	public void setSeller_id(String seller_id) {
		this.seller_id = seller_id;
	}

	public String getBuyer_id() {
		return buyer_id;
	}

	public void setBuyer_id(String buyer_id) {
		this.buyer_id = buyer_id;
	}

	public String getMvoaccount_email() {
		return mvoaccount_email;
	}

	public void setMvoaccount_email(String mvoaccount_email) {
		this.mvoaccount_email = mvoaccount_email;
	}

	public String getMvoaccount_pwd() {
		return mvoaccount_pwd;
	}

	public void setMvoaccount_pwd(String mvoaccount_pwd) {
		this.mvoaccount_pwd = mvoaccount_pwd;
	}

	public String getMvoaccount_fund() {
		return mvoaccount_fund;
	}

	public void setMvoaccount_fund(String mvoaccount_fund) {
		this.mvoaccount_fund = mvoaccount_fund;
	}

}
