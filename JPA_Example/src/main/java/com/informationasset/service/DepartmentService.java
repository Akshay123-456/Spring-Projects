package com.informationasset.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.informationasset.model.Department;
@Service
public interface DepartmentService {
//Save Operation
Department saveDepartment(Department department);
//Read Operation
List<Department> showRecords();
//Update Operation
Department updateDepartment(Department department, int departmentId);
//Delete Operation
public void deleteDepartmentbyId(int departmentId);
}
