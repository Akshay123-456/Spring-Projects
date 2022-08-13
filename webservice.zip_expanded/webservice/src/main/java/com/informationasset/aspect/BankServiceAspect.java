package com.informationasset.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class BankServiceAspect {
	@Pointcut("execution(* com.informationasset.service.BankService.*(..))")
private void logDisplayBalance()
{
	
}

@Around(value="logDisplayBalance()")
public void aroundAdvice(ProceedingJoinPoint jp) throws Throwable
{
	System.out.println("Method aroundAdvice() before invocation of method "+jp.getSignature().getName()+" method");
	try
	{
		jp.proceed();
	}
	finally
	{
		
	}
	System.out.println("Method aroundAdvice after invocation of method "+jp.getSignature().getName()+" method");
}
}
