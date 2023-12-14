package com.employeerecords.model;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class EmployeeEntity {
	
	private static final String FILENAME = "employeeRecords.txt";
	
	private long employeeNumber;
	
	private String firstname;
	
	private String lastname;
	
	private int age;
	
	private double salary;
	
	private String department;
	
	private String date;  //DD-MM-YYYY
	
	private String address;
	
	private String city;
	
	private String phonenumber;


	public EmployeeEntity(long employeeNumber, String firstname, String lastname, int age, double salary,
			String department, String date, String address, String city, String phonenumber) {
		super();
		this.employeeNumber = employeeNumber;
		this.firstname = firstname;
		this.lastname = lastname;
		this.age = age;
		this.salary = salary;
		this.department = department;
		this.date = date;
		this.address = address;
		this.city = city;
		this.phonenumber = phonenumber;
	}

	public long getEmployeeNumber() {
		return employeeNumber;
	}

	public void setEmployeeNumber(long employeeNumber) {
		this.employeeNumber = employeeNumber;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	@Override
	public String toString() {
		return "EmployeeEntity [employeeNumber=" + employeeNumber + ", firstname=" + firstname + ", lastname="
				+ lastname + ", age=" + age + ", salary=" + salary + ", department=" + department + ", date=" + date
				+ ", address=" + address + ", city=" + city + ", phonenumber=" + phonenumber + "]";
	}
	
	

}
