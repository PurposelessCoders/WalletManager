package com.purposelesscoders.walletmanager.bdd;

import java.sql.Date;

public class Transaction {
	private int id;
	private int value;
	private Date date;
	private EDevise devise;
	
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getValue() {
		return value;
	}
	
	public void setValue(int value) {
		this.value = value;
	}
	
	public Date getDate() {
		return date;
	}
	
	public void setDate(Date date) {
		this.date = date;
	}
	
	public EDevise getDevise() {
		return devise;
	}
	
	public void setDevise(EDevise devise) {
		this.devise = devise;
	}
	
	@Override
	public String toString() {
		return "Transaction [id=" + id + ", value=" + value + ", date=" + date
				+ ", devise=" + devise + "]";
	}
	 
	
}
