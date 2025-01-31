package com.company.department;

public class Department {
	
	public void showDetails(Employee emp) {
		System.out.println("Employee details from department");
		System.out.println("Id "+ emp.getId());
		System.out.println("Name "+ emp.name);
		System.out.println("Departmet "+ emp.department);
		System.out.println("Salary "+ emp.salary);
		
	}
	

}
