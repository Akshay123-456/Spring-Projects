package com.informationasset.database;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.informationasset.model.Employee;
import com.informationasset.repository.EmployeeRepository;

@Component
public class DBOperationRunner implements CommandLineRunner {

	@Autowired
	EmployeeRepository emprepo;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		emprepo.saveAll(Arrays.asList(
				new Employee(1001,"James","james@gmail.com",25000.00),
				new Employee(1002,"Meera","meera@gmail.com",28000.00),
				new Employee(1003,"Client","client@gmail.com",25000.00)
				));
	}

}
