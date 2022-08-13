package com.informationasset.service;

import org.springframework.stereotype.Service;

@Service
public class BankService {
public void displayBalance(String accName)
{
	System.out.println("Inside displayBalance() Mehod");
	if(accName.equals("12345"))
	{
		System.out.println("Balance is 10,000");
	}
	else
	{
		System.out.println("Wrong Account Number..............");
	}
}
}