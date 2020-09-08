package com.java.empfile;

import java.io.PrintStream;
import java.util.Scanner;

import java.io.File;
import java.io.IOException;

public class EmpMainClass {

	public static void main(String[] args) throws IOException {
		int choice;
		Scanner sc = new Scanner(System.in);
		EmpManagement empManagement = new EmpManagement();
		do {
			System.out.println(
					"Enter your choice \n\n1.Add Record\n2.Print All Records into a file\n3.Delete Record\n4.Search Record\n5.Modify Records\n6.Read File\n7.Show All Records\n8.Exit");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter Id: ");
				int id = sc.nextInt();
				System.out.println("Enter the Name: ");
				String name = sc.next();
				System.out.println("Enter the Department: ");
				String department = sc.next();
				System.out.println("Enter the Designation: ");
				String designation = sc.next();
				System.out.println("Enter the Salary: ");
				String salary = sc.next();
                Employee emp = new Employee(id, name, department, designation,salary);
				empManagement.addRecord(emp);
				System.out.println("Record has been added..!!");
				System.out.println("==================================");
				break;
			case 2:
				File file = new File("C:\\Users\\anshika.negi\\Desktop\\EmpRecords.txt");
				PrintStream stream = new PrintStream(file);
				PrintStream console = System.out;
				System.out.println("Record has been printed in your file..!!");
				System.out.println("==================================");
				System.setOut(stream);
				empManagement.printAllEmpData();
                System.setOut(console);
				break;
			case 3:
				System.out.println("Enter the Id you want to delete the record:");
				id = sc.nextInt();
				empManagement.delete(id);
				System.out.println("Record has been deleted..!");
				System.out.println("==================================");
				break;
			case 4:
				System.out.println("Enter the Id you want to Search:");
				id = sc.nextInt();
				empManagement.search(id);
				System.out.println("==================================");
				break;
			case 5:
				System.out.println("Enter the Id you want to Modify:");
				id = sc.nextInt();
				empManagement.modify(id);
				System.out.println("Record has been Modified..!!");
				System.out.println("==================================");
				break;
			case 6:
				empManagement.readFile();
				System.out.println("File has been read successfully");
				System.out.println("==================================");
				break;
			case 7:
				empManagement.printAllEmpData();
				System.out.println("==================================");
				break;
			case 8:
				System.out.println("You have Pressed 8..The program has been ended..!!");
				System.out.println("==================================");
				break;
			default:
				System.out.println("Wrong Choice...!!");
				System.out.println("==================================");
				break;
			}
		} while (choice != 8);
		sc.close();
	}

}