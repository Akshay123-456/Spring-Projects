package com.informationasset.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.informationasset.model.Department;
import com.informationasset.repository.DepartmentRepository;

public class DepartmentServiceImpl implements DepartmentService {
@Autowired
private DepartmentRepository repo;
	@Override
	public Department saveDepartment(Department department) {
		// TODO Auto-generated method stub
		return repo.save(department);
	}

	@Override
	public List<Department> showRecords() {
		// TODO Auto-generated method stub
		return (List<Department>)repo.findAll();
	}

	@Override
	public Department updateDepartment(Department department, Long departmentId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteDepartmentbyId(Long departmentId) {
		// TODO Auto-generated method stub

	}

}
