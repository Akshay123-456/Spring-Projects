package com.informationasset.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.informationasset.model.Employee;
import com.informationasset.service.EmployeeService;

@RestController
public class EmployeeController {
@Autowired
private EmployeeService empservice;
//http://localhost:8080/add/employee?empid=100&firstname=Akshay&lastname=Deshmukh
@RequestMapping(value="/add/employee",method=RequestMethod.GET)
public Employee addEmployee(@RequestParam("empid") String empid,@RequestParam("firstname") String firstname, @RequestParam("lastname") String lastname)
{
	return empservice.createEmployee(empid, firstname, lastname);
}
//http://localhost:8080/remove/employee?empid=100
@RequestMapping(value="/remove/employee",method=RequestMethod.DELETE)
public String deleteEmployee(@RequestParam("empid") String empid)
{
	empservice.deleteEmployee(empid);
	return "Employee Removed";
}
}
