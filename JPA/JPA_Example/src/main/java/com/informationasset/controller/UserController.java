package com.informationasset.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.informationasset.model.UserRecord;
import com.informationasset.repository.UserRepository;
import com.informationasset.service.UserService;

import org.springframework.web.bind.annotation.RequestBody;        
import org.springframework.web.bind.annotation.RestController;  

@RestController    
public class UserController   
{    
@Autowired    
private UserService userService;     
@RequestMapping(value="/", method=RequestMethod.GET)    
public List<UserRecord> getAllUser()  
{    
return userService.getAllUsers();    
}       
@RequestMapping(value="/add-user", method=RequestMethod.POST)    
public void addUser(@RequestBody UserRecord userRecord)  
{    
userService.addUser(userRecord);    
}  
@RequestMapping(value="/delete-user",method=RequestMethod.DELETE)
public void deleteUser(@RequestParam int id)
{
	userService.deleteUser(id);
}
@RequestMapping(value="update-user",method=RequestMethod.PUT)
public void updateUser(@RequestParam int id, @RequestBody UserRecord record)
{
	userService.updateUser(id, record);
}
} 