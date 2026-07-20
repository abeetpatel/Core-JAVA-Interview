package com.rays.oop;

public class TestAccount {
	
	public static void main(String[] args) {
		
		Account a = new Account();
		
		a.setBalance(10000);
		a.deposite(1000);
		a.withdrawel(500);
		a.withdrawel(11000);
		
	}

}
