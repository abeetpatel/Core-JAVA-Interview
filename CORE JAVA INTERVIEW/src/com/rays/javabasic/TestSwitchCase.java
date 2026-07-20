package com.rays.javabasic;

public class TestSwitchCase {

	public static void main(String[] args) {

		int num = 5;
		String day = null;

		switch (num) {

		case 1:
			day = "Monday";
			break;

		case 2:
			day = "Tuesday";
			break;

		case 3:
			day = "Wednesday";
			break;

		case 4:
			day = "Thursday";
			break;

		case 5:
			day = "Friday";
			break;

		case 6:
			day = "Saturday";
			break;

		case 7:
			day = "Sunday";
			break;

		default:
			day = "invalid day";

		}

		System.out.println(day);

	}

}
