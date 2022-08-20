package com.informationasset.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.informationasset.model.Department;
import com.informationasset.service.DepartmentService;
@Controller
public class DepartmentController {
	 @Autowired private DepartmentService departmentService;
	 
	    // Save operation
	    @PostMapping("/departments")
	    public Department saveDepartment(
	         @RequestBody Department department)
	    {
	        return departmentService.saveDepartment(department);
	    }
	 
	    // Read operation
	    @GetMapping("/departments")
	    public List<Department> fetchDepartmentList()
	    {
	        return departmentService.showRecords();
	    }
	 
	    // Update operation
	    @PutMapping("/departments/{id}")
	    public Department
	    updateDepartment(@RequestBody Department department,
	                     @PathVariable("id") int departmentId)
	    {
	        return departmentService.updateDepartment(
	            department, departmentId);
	    }
	 
	    // Delete operation
	    @DeleteMapping("/departments/{id}")
	    public String deleteDepartmentById(@PathVariable("id")
	                                       int departmentId)
	    {
	        departmentService.deleteDepartmentbyId(
	            departmentId);
	        return "Deleted Successfully";
	    }
}
