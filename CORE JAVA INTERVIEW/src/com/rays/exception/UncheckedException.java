package com.rays.exception;

public class UncheckedException {

	public static void son() {

		throw new RuntimeException();

	}

	public static void mom() {

		son();

	}

	public static void dad() {

		mom();

	}

	public static void main(String[] args) {

		dad();

	}

}