package com.informationasset.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.informationasset.model.Department;
@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {

}