package com.informationasset.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
	public Department updateDepartment(Department department, int departmentId) {
		// TODO Auto-generated method stub
		Department dpdb=repo.findById(departmentId).get();
		if(Objects.nonNull(dpdb.getDepartmentName())&&!"".equalsIgnoreCase(dpdb.getDepartmentName()))
		{
			dpdb.setDepartmentName(dpdb.getDepartmentName());
		}
		if(Objects.nonNull(dpdb.getDepartmentAddress())&&!"".equalsIgnoreCase(dpdb.getDepartmentAddress()))
		{
			dpdb.setDepartmentAddress(dpdb.getDepartmentAddress());
		}
		if(Objects.nonNull(dpdb.getDepartmentCode())&&!"".equalsIgnoreCase(dpdb.getDepartmentCode()))
		{
			dpdb.setDepartmentCode(dpdb.getDepartmentCode());
		}
		return repo.save(dpdb);
	}

	@Override
	public void deleteDepartmentbyId(int departmentId) {
		// TODO Auto-generated method stub
		repo.deleteById(departmentId);
	}

}
