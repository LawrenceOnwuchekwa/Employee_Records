package com.employeerecords.dataoperation;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

import com.employeerecords.model.EmployeeEntity;

public class EmployeeOperationImplement implements EmployeeRecordOperation<EmployeeEntity> {

	
	private static final String FILENAME = "employeeRecords.txt";
	@Override
	public long add(EmployeeEntity employee) throws ClassNotFoundException{
		// TODO Auto-generated method stub
		List<EmployeeEntity> entities = new ArrayList<>();
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILENAME))) {
			while (true) {
				EmployeeEntity entity = (EmployeeEntity) ois.readObject();
	            entities.add(entity);
	            }
	        } catch (IOException e) {
	            // Reached end of file
	        	e.printStackTrace();       
	        	}
		return 0;
	    }

	@Override
	public boolean delete(long employeeNumber) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean modify(long employeeNumber, EmployeeEntity employee) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public EmployeeEntity search(long employeeNumber) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<EmployeeEntity> showAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long countRecords() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public EmployeeEntity searchbyFirstname(String firstname) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EmployeeEntity searchbyLastname(String lastname) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EmployeeEntity searchbyDepartment(String department) {
		// TODO Auto-generated method stub
		return null;
	}

}
