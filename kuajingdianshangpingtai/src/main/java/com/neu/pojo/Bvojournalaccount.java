package com.neu.pojo;

import org.springframework.stereotype.Component;

@Component
public class Bvojournalaccount {
	private String buyer_id;
	private String cname;
	private String transaction_record;
	private String transaction_audit;
	private String apply_time;
	
	public Bvojournalaccount() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Bvojournalaccount(String buyer_id, String cname,  String transaction_record, String transaction_audit,String apply_time ) {
		super();
		this.buyer_id = buyer_id;
		this.cname = cname;
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

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
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
