package com.rays.oop.Interface;

public class TestBusinessman {

	public static void main(String[] args) {

		Businessman b = new Businessman();

		b.earnMoney();
		b.donation();
		b.party();
		b.helpToOther();
		b.abc();

		Richman r = new Businessman();

		r.earnMoney();
		r.donation();
		r.party();

		Socialworker s = new Businessman();

		s.helpToOther();

	}

}
