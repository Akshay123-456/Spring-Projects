package com.informationasset.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.informationasset.model.Student;
import com.informationasset.service.StudentService;

@Controller
public class ServiceController {
@Autowired
StudentService service=new StudentService();
List<String> courses;
@ModelAttribute
public void preload()
{
	courses=new ArrayList<String>();
	courses.add("c");
	courses.add("cpp");
	courses.add("java");
	courses.add("python");
}
@GetMapping("/")
public String home(Model model,Student student)
{
	model.addAttribute("courses",courses);
	return "register";
}
@PostMapping("/save")
public String register(@ModelAttribute("student") Student student,Model model)
{
	System.out.println("get courses:::"+student.getCourse());
	service.save(student);
	return "Welcome";
}
}
