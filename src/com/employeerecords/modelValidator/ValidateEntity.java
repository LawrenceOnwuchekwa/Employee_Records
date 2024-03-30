package com.employeerecords.modelValidator;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.employeerecords.model.EmployeeEntity;

public class ValidateEntity {
	
	public static boolean validateEmployee(EmployeeEntity employee) throws IllegalArgumentException {
		if(employee.getAddress() == null || employee.getAddress().trim().isEmpty()) {
			throw new IllegalArgumentException("Address cannot be null or empty");
		}
		if(employee.getCity() == null || employee.getCity().trim().isEmpty()) {
			throw new IllegalArgumentException("City cannot be null or empty");
		}
		if(employee.getFirstname() == null || employee.getFirstname().trim().isEmpty()) {
			throw new IllegalArgumentException("Firstname cannot be null or empty");
		}
		if(employee.getLastname() == null || employee.getLastname().trim().isEmpty()) {
			throw new IllegalArgumentException("Lastname cannot be null or empty");
		}
		if(employee.getAge() <= 0) {
			throw new IllegalArgumentException("Age cannot be zero or less than zero");
		}
		if(employee.getSalary() <= 0) {
			throw new IllegalArgumentException("Salaray cannot be negative or zero");
		}
		if(employee.getDepartment() == null || employee.getDepartment().trim().isEmpty()) {
			throw new IllegalArgumentException("Department cannot be null or empty");
		}
		if(employee.getDate() == null || employee.getDate().trim().isEmpty()) {
			throw new IllegalArgumentException("Date cannot be null or empty");
		}
			SimpleDateFormat ddateformat = new SimpleDateFormat("dd-MM-yyyy");
			ddateformat.setLenient(false);
			 try {
		            Date date = ddateformat.parse(employee.getDate());
		        } catch (ParseException e) {
		            System.out.println("ParseException: " + e.getMessage());
		            System.out.println("Date is invalid.");
		            return false;
		        }
			 if(employee.getFirstname().length()<3|| employee.getLastname().length()<3 ) {
					throw new IllegalArgumentException("Unusual name length");
				}
			 Pattern pattern = Pattern.compile("^[a-zA-Z]+$");
			 Matcher matcher = pattern.matcher(employee.getFirstname());
			 Matcher matcher1 = pattern.matcher(employee.getLastname());
			 if(!matcher.matches() || !matcher1.matches()) {
				 throw new IllegalArgumentException("Invalid character combination");
			 }
			 if(employee.getAge()<18) {
				 throw new IllegalArgumentException("Age must be above 18");
			 }
			 return true;
		    }
	

	

}
