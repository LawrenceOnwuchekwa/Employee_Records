package com.employeerecords.main;

import java.util.Scanner;
import java.util.UUID;

import com.employeerecords.dataoperation.EmployeeOperationImplement;
import com.employeerecords.filemanager.FileManager;
import com.employeerecords.model.EmployeeEntity;
import com.employeerecords.modelValidator.ValidateEntity;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		EmployeeEntity employee = new EmployeeEntity(0, "lawrence", "uche", 23, 145500,"Staff", "30-02-1999", "4 orji street", "lagos", "07017051276");
		EmployeeEntity employee1 = new EmployeeEntity(0, "lawrencce", "uche", 13, 145500,"Staff", "28-02-1999", "4 orji street", "lagos", "07017051276");
		// TODO Auto-generated method stub
		System.out.println(ValidateEntity.validateEmployee(employee1));
//		System.out.println(employee1.toString());
		
		
		
//		FileManager.createFile();
//		System.out.println("Enter your firstname");
//		String firstname = input.nextLine();
//		employee.setFirstname(firstname);
//		System.out.println("Enter your lastname");
//		String lastname = input.nextLine();
//		employee.setFirstname(lastname);
//		FileManager.writeToFile(firstname);
//		FileManager.writeToFile(lastname);
		
	}
}
//		if(name==null) {
//			System.out.println("yes it is null");
//		}
//		System.out.println("no it's not");
////		for(int i = 0; i<firstName.length(); ++i) {
////			System.out.println(firstName.charAt(i));
////		}
//		for(int i = 65; i<=122;++i) {
//			System.out.println((char)i);
//		}
//		}
//		System.out.println(name.is);
//		EmployeeOperationImplement obj = new EmployeeOperationImplement();
//		obj.add()