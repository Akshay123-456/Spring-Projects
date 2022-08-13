package com.informationasset.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmloyeeController_PathVariable {
@RequestMapping(value="/addEmployee/{id}")
@ResponseBody
public String getEmployee(@PathVariable("id") int id)
{
	return "Welcome Employee "+id;
}
}
