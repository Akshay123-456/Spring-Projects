package com.informationasset.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import com.informationasset.model.Account;

@Aspect
@Component
public class AccountAspect {
@AfterReturning(value="execution(* com.informationasset.service.AccountServiceImpl.* (..))",returning="account")
public void AfterReturningAdvice(JoinPoint point, Account account)
{
	System.out.println("After Returning Methode: "+point.getSignature());
	System.out.println(account);
}
@AfterThrowing(value="execution(* com.informationasset.service.AccountServiceImpl.* (..))",throwing="e")
public void AfterThrowingAdvice(JoinPoint jp, Exception e)
{
	System.out.println("After Throwing Exception in Method: "+jp.getSignature());
	System.out.println("Exception is: "+e.getMessage());
}
}
