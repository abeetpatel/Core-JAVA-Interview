package com.rays.oop;

public class Account {

	private int balance;

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public void deposite(int amount) {
		balance = balance + amount;
		System.out.println("Balance => " + balance);
	}

	public void withdrawel(int amount) {
		if (balance >= amount) {
			balance = balance - amount;
			System.out.println("Balance => " + balance);
		} else {
			System.out.println("insufficient balance");
			System.out.println("Balance => " + balance);
		}
	}

}
