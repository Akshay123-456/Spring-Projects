package com.informationasset.service;

import java.util.List;    
import java.util.ArrayList;    
import org.springframework.beans.factory.annotation.Autowired;    
import org.springframework.stereotype.Service;

import com.informationasset.model.UserRecord;
import com.informationasset.repository.UserRepository;  
 
@Service    
public class UserService   
{    
@Autowired    
private UserRepository userRepository;    
public List<UserRecord> getAllUsers()  
{    
List<UserRecord>userRecords = new ArrayList<>();    
userRepository.findAll().forEach(userRecords::add);    
return userRecords;    
}    
public void addUser(UserRecord userRecord)  
{    
userRepository.save(userRecord);    
} 
public void deleteUser(int id)
{
	userRepository.deleteById(id);
}
public void updateUser(int id, UserRecord userRecord)
{
	userRepository.findById(id);
	userRepository.save(userRecord);
}
}