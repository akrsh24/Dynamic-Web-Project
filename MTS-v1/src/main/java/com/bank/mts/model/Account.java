package com.bank.mts.model;

public class Account {

	private String num;
	private double balance;
	private String holderName;
	private AccountType type;
	private AccountStatus status;

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	
	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getHolderName() {
		return holderName;
	}

	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}

	public AccountType getType() {
		return type;
	}

	public void setType(AccountType type) {
		this.type = type;
	}

	public AccountStatus getStatus() {
		return status;
	}

	public void setStatus(AccountStatus status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Account [num=" + num + ", balance=" + balance + ", holderName=" + holderName + ", type=" + type
				+ ", status=" + status + "]";
	}

	public double getBalance() {
		return balance;
	}

}
