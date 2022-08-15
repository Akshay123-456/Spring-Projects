package com.informationasset.service;

import java.util.List;

import com.informationasset.model.Department;

public interface DepartmentService {
//Save Operation
Department saveDepartment(Department department);
//Read Operation
List<Department> showRecords();
//Update Operation
Department updateDepartment(Department department, Long departmentId);
//Delete Operation
public void deleteDepartmentbyId(Long departmentId);
}
