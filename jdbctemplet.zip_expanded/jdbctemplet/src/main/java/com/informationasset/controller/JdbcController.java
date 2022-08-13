package com.informationasset.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.CustomSQLErrorCodesTranslation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.informationasset.configuration.CustomErrorCode;
import com.informationasset.main.JdbcTempletApplication;

@RestController
public class JdbcController {
	CustomErrorCode code=new CustomErrorCode();
@Autowired
JdbcTemplate templet;
@RequestMapping("/insert")
public String exec()
{
	templet.setExceptionTranslator(code);
	templet.execute("insert into student (roll_no,student_name,grade,address) values(4,'Savio','A','Mumbai');");
	return "Record Added Succesfully";
}
}
