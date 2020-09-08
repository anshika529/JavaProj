package com.java.empfile;

import java.io.FileReader;
import java.io.IOException;

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

	public void modify(int id) {
		int choice;
		for (Employee employee : employees) {
			if (employee.getId() == id) {

				do {

					System.out.println(
							"Enter the field you want to modify:\n1.Id\n2.Name\n3.Department\n4.Designation\n5.Salary\n6.Stop Editing");
					choice = sc.nextInt();
					switch (choice) {
					case 1:
						System.out.println("Enter Id: ");
						employee.setId(sc.nextInt());
						break;
					case 2:
						System.out.println("Enter Name:");
						employee.setName(sc.next());
						break;
					case 3:
						System.out.println("Enter Department:");
						employee.setDepartment(sc.next());
						break;
					case 4:
						System.out.println("Enter Designation:");
						employee.setDesignation(sc.next());
						break;
					case 5:
						System.out.println("Enter Salary:");
						employee.setSalary(sc.next());
						break;
					case 6:
						System.out.println("You have pressed 6.!!Editing has been done..!!");
						break;
					default:
						System.out.println("Wrong Choice..!!");
						break;
					}
				} while (choice != 6);

			}
		}

	}


	public void readFile() throws IOException {
		FileReader fr = new FileReader("C:\\\\Users\\\\anshika.negi\\\\Desktop\\\\EmpRecords.txt");
		int i;
		while ((i = fr.read()) != -1) {
			System.out.print((char) i);
		}
		System.out.println("\n");
		fr.close();
	}

	public void search(int id) {
		for (Employee employee : employees) {
			if (employee.getId() == id) {

				System.out.println(employees.get(employees.indexOf(employee)));

			}
			else
			{
				System.out.println("Record Not found..!!");
			}

		}

	}

}