package com.employeerecords.main;

import com.employeerecords.dataoperation.EmployeeOperationImplement;
import com.employeerecords.modelValidator.ValidateEntity;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello world");
		String name = "\"\"";
		String firstName = "lawrence";
		ValidateEntity.isValidName(firstName);
		
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