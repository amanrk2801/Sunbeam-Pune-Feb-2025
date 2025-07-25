package com.sunbeam;

public class Account {
	private int id;
	private String type;
	private double balance;

	public Account() {
	}

	public Account(int id, String type, double balance) {
		this.id = id;
		this.type = type;
		this.balance = balance;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", type=" + type + ", balance=" + balance + "]";
	}

	public synchronized void deposit(double amount) {
		double newBalance = this.balance + amount;
		this.balance = newBalance;
	}

	public synchronized   void withdraw(double amount) {
		double newBalance = this.balance - amount;
		this.balance = newBalance;
	}
}
