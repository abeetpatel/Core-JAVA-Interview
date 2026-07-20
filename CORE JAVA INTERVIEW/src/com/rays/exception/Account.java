package com.rays.exception;

public class Account {

	private int balance;

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public int getBalance() {
		return balance;
	}

	public void deposit(int amount) {

		balance = balance + amount;
		System.out.println("after deposite =>" + balance);

	}

	public void withdrawel(int amount) throws InsufficientBalance {

		if (balance >= amount) {
			balance = balance - amount;
			System.out.println("after withdrawel =>" + balance);
		} else {
			InsufficientBalance e = new InsufficientBalance();
			throw e;
		}

	}

}
