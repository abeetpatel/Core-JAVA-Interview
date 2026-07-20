package com.rays.javabasic;

import java.time.LocalDate;
import java.time.Period;

public class AgeCount {

	public static void main(String[] args) {

		LocalDate now = LocalDate.now();

		LocalDate Bdate = LocalDate.of(2001, 8, 29);

		Period p = Period.between(Bdate, now);

		System.out.println("Age = " + p.getYears());

	}

}
