package com.purposelesscoders.walletmanager.bdd;

public class Account {
	private int id;
	private String name;
	private EAccount type;
	private EDevise devise;
	private double value;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public EAccount getType() {
		return type;
	}
	
	public void setType(EAccount type) {
		this.type = type;
	}
	
	public EDevise getDevise() {
		return devise;
	}
	
	public void setDevise(EDevise devise) {
		this.devise = devise;
	}
	
	public double getValue() {
		return value;
	}
	
	public void setValue(double resume) {
		this.value = resume;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", name=" + name + ", type=" + type
				+ ", devise=" + devise + ", resume=" + value + "]";
	}
}
