package com.rays.collection.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TestComparator {
	public static void main(String[] args) {

		List list = new ArrayList();

		list.add(new Employee(1, "Anand", 5000));
		list.add(new Employee(3, "Shyam", 3300));
		list.add(new Employee(2, "Ajay", 4000));
		list.add(new Employee(4, "Anand", 5000));

		EmployeeSortbyName byName = new EmployeeSortbyName();
		EmployeeSortByIdName byIdName = new EmployeeSortByIdName();
		EmployeeSortByIdNameSalary byAll = new EmployeeSortByIdNameSalary();

		Collections.sort(list, byAll);

		Iterator it = list.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
