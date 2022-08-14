package com.informationasset.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.informationasset.model.Student;
import com.informationasset.repository.StudentRepository;

@Service
public class StudentService {
@Autowired
private StudentRepository repo;
public void save(Student student)
{
	repo.save(student);
}
}
