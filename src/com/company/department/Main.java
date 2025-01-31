package com.company.department;

public class Main {

	public static void main(String[] args) {

		Employee e1 = new Employee(110, "Rohan", 15000, "Java ");
		Employee e2 = new Employee(120, "Akash", 5000, "Python ");
		Employee e3 = new Employee(112, "Rohit", 55000, "C++ ");
		
	Department d1 = new Department();
	d1.showDetails(e1);
	d1.showDetails(e2);
	d1.showDetails(e3);
	}

}
