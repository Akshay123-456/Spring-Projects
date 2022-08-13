package com.informationasset.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.informationasset.model.User;

@Controller
public class DemoController {
@RequestMapping("/")
public String index()
{
	return "index";
}
@RequestMapping(value="/save",method=RequestMethod.POST)
public ModelAndView save(@ModelAttribute User user)
{
	ModelAndView mv=new ModelAndView();
	mv.setViewName("user-data");
	mv.addObject("user", user);
	return mv;
}
}
