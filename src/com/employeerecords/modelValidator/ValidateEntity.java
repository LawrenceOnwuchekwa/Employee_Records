package com.employeerecords.modelValidator;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.employeerecords.model.EmployeeEntity;

public class ValidateEntity {
	
	public static void validateEmployee(EmployeeEntity employee) throws IllegalArgumentException {
		if(employee.getFirstname() == null || employee.getFirstname().isEmpty()) {
			throw new IllegalArgumentException("Firstname cannot be null or empty");
		}
		if(employee.getFirstname().length() <3 ) {
			throw new IllegalArgumentException("Unusual name length");
		}
//		if(!isValidName(employee.getFirstname())){
//			throw new IllegalArgumentException("Invalid character present. Character must be between aA-zZ");
//		}
		if(employee.getLastname() == null || employee.getLastname().isEmpty()) {
			throw new IllegalArgumentException("Lastname cannot be null or empty");
		}
		if(employee.getLastname().length()<3) {
			throw new IllegalArgumentException("Unusual name length");
		}
		if(employee.getAge() <= 0) {
			throw new IllegalArgumentException("Age must be a positive integer");
		}
		if(employee.getDate() == null || employee.getDate().isBlank() || employee.getDate().isEmpty()) {
			throw new IllegalArgumentException("Date cannot be null, empty or blank");
		}
		if(!isvalidDate(employee.getDate())){
			throw new IllegalArgumentException("Date must be in the format- dd-MM-yyyy");
		}
		if(employee.getAddress() == null || employee.getAddress().isEmpty()) {
			throw new IllegalArgumentException("Address cannot be null or empty");
		}
		if(employee.getCity() == null || employee.getCity().isEmpty()) {
			throw new IllegalArgumentException("City cannot be null or empty");
		}
	}
	public static boolean isvalidDate(String dateEmployee) {
		String dateFormat = "dd-MM-yyyy";
		SimpleDateFormat ddateformat = new SimpleDateFormat(dateFormat);
		ddateformat.setLenient(false);
		
		try {
			Date date = ddateformat.parse(dateEmployee);
			return true;
		}catch(ParseException e) {
			return false;
		}
	}
	public static void isValidName(String nName) {
		for(int i = 0; i<nName.length(); ++i) {
			if((char)(nName.charAt(i)) <= 65 || (char)(nName.charAt(i)) >= 123) {
				System.out.println("Invalid string");
			}
			else {
				System.out.println("valid string");
			}
//			throw new IllegalArgumentException("Invalid character combo");
		}
		
	}

}
