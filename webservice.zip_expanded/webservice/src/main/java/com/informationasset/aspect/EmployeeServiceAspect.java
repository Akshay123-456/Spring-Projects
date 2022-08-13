package com.informationasset.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class EmployeeServiceAspect {
//@Before(value="execution(* com.informationasset.service.EmployeeService.* (..)) and args(empid,firstname,lastname)")
//public void BeforeAdvice(JoinPoint point,String empid, String firstname, String lastname)
//{
//	System.out.println("Before Method: "+point.getSignature());
//	System.out.println("Creating Employee with First Name as: "+firstname+"\tLast Name: "+lastname+"\tEmployee Id: "+empid);
//}
//@Before(value="execution(* com.informationasset.service.EmployeeService.* (..)) and args(empid)")
//public void BeforeAdvice(JoinPoint point, String empid)
//{
//	System.out.println("Before Method: "+point.getSignature());
//	System.out.println("Deleting Employee with id as: "+empid);
//}
	@After(value="execution(* com.informationasset.service.EmployeeService.* (..)) and args(empid,firstname,lastname)")
	public void BeforeAdvice(JoinPoint point,String empid, String firstname, String lastname)
	{
		System.out.println("After Method: "+point.getSignature());
		System.out.println("Created Employee with First Name as: "+firstname+"\tLast Name: "+lastname+"\tEmployee Id: "+empid);
	}
	@After(value="execution(* com.informationasset.service.EmployeeService.* (..)) and args(empid)")
	public void BeforeAdvice(JoinPoint point, String empid)
	{
		System.out.println("After Method: "+point.getSignature());
		System.out.println("Deleted Employee with id as: "+empid);
	}
}