package com.informationasset.service;

import org.springframework.stereotype.Service;

import com.informationasset.model.Employee;

@Service
public class EmployeeService {

	public Employee createEmployee(String empid, String firstname, String lastname) {
		// TODO Auto-generated method stub
		Employee emp=new Employee();
		emp.setEmpId(empid);
		emp.setFirstName(firstname);
		emp.setLastName(lastname);
		return emp;
	}

	public Employee deleteEmployee(String empid) {
		// TODO Auto-generated method stub
		return null;
	}

}
