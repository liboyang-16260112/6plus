package com.neu.pojo;

public class MvoJournalAccount {
	private String buyer_id;
	private String seller_id;
	private String transaction_record;
	private String transaction_audit;
	private String apply_time;

	public MvoJournalAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MvoJournalAccount(String buyer_id, String seller_id, String transaction_record, String transaction_audit,
			String apply_time) {
		super();
		this.buyer_id = buyer_id;
		this.seller_id = seller_id;
		this.transaction_record = transaction_record;
		this.transaction_audit = transaction_audit;
		this.apply_time = apply_time;
	}

	public String getBuyer_id() {
		return buyer_id;
	}

	public void setBuyer_id(String buyer_id) {
		this.buyer_id = buyer_id;
	}

	public String getSeller_id() {
		return seller_id;
	}

	public void setSeller_id(String seller_id) {
		this.seller_id = seller_id;
	}

	public String getTransaction_record() {
		return transaction_record;
	}

	public void setTransaction_record(String transaction_record) {
		this.transaction_record = transaction_record;
	}

	public String getTransaction_audit() {
		return transaction_audit;
	}

	public void setTransaction_audit(String transaction_audit) {
		this.transaction_audit = transaction_audit;
	}

	public String getApply_time() {
		return apply_time;
	}

	public void setApply_time(String apply_time) {
		this.apply_time = apply_time;
	}

}
