package com.java.employeerecord;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class EmpManagement {

	List<Employee> employees = new ArrayList<Employee>();
	Scanner sc = new Scanner(System.in);

	

	public void addRecord(Employee emp) {
		employees.add(emp);
	}

	

	public void printAllEmpData() {
		employees.forEach(emp -> System.out.println(emp));
	}

	public boolean delete(int id) {
		for (Employee employee : employees) {
			if (employee.getId() == id) {
				employees.remove(employees.indexOf(employee));
				return true;
			}
		}
		return false;
	}
	public void Modify(int id)
	{
		for(Employee employee:employees)
		{
			if(employee.getId()==id)
			{ 
				System.out.println("Enter Id:");
				employee.setId(sc.nextInt());
				System.out.println("Enter Name:");
				employee.setName(sc.next());
				System.out.println("Enter Department:");
				employee.setDepartment(sc.next());
				System.out.println("Enter Designation:");
				employee.setDesignation(sc.next());
				
			}
		}
		System.out.println("Record has been Modified..!!");
		System.out.println("=================================");
	}
	public void search(int id) {
		for (Employee employee : employees) {
		if (employee.getId() == id) {

		System.out.println(employees.get(employees.indexOf(employee)));

		}


		}
		}
}