package com.rays.oop;

public class TestUserBean {

	public static void main(String[] args) {

		UserBean bean = new UserBean();

		bean.setId(1);
		bean.setName("ram");

		System.out.println(bean.getId());
		System.out.println(bean.getName());

		System.out.println("-------------------------------------------------");

		// constructor call
		UserBean bean1 = new UserBean(10, "shyam");

		System.out.println(bean1.getId());
		System.out.println(bean1.getName());

	}

}
