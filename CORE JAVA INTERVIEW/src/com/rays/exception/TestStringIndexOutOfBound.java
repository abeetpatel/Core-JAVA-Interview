package com.rays.exception;

public class TestStringIndexOutOfBound {
	public static void main(String[] args) {

		String s = "name";
		String a[] = { "a", "b" };

		try {

			System.out.println(10 / 0);
			System.out.println(a[6]);
			System.out.println(s.charAt(9));

		} catch (ArithmeticException e) {
			System.out.println(e);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);

		} catch (StringIndexOutOfBoundsException e) {
			System.out.println(e);

		} finally {

			System.out.println("Final Block");
		}

	}
}
