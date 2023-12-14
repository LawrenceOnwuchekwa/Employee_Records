package com.employeerecords.dataoperation;

import java.util.List;

public interface EmployeeRecordOperation<T> {
	
	long add(T employee) throws ClassNotFoundException;
	
	boolean delete(long employeeNumber);
	
	boolean modify(long employeeNumber, T employee);
	
	T search(long employeeNumber);
	
	List<T> showAll();
	
	long countRecords();
	
	T searchbyFirstname(String firstname);
	
	T searchbyLastname(String lastname);
	
	T searchbyDepartment(String department);
	
	

}
