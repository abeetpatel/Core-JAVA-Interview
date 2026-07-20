package com.rays.oop.Interface;

public class Businessman implements Richman, Socialworker {

	@Override
	public void helpToOther() {

		System.out.println("helpToOther");

	}

	@Override
	public void earnMoney() {

		System.out.println("earnMoney");

	}

	@Override
	public void donation() {

		System.out.println("donation");

	}

	@Override
	public void party() {

		System.out.println("party");

	}

	public void abc() {
		System.out.println("abc");
	}

}
