package com.rays.exception;

public class LoginException extends Exception {

	public LoginException() {

		super("Login Id and password is invalid");

	}

	public LoginException(String msg) {

		super(msg);

	}

}
