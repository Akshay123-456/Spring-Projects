package com.informationasset.service;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.springframework.stereotype.Service;

import com.informationasset.model.Account;

@Service
public class AccountServiceImpl implements AccountService {

	private static Map<String, Account> map=new HashMap<String, Account>();
	static 
	{
		map.put("M4546779", new Account("10441117000", "Saving Account"));
		map.put("K2434567", new Account("10863554577","Current Account"));
	}
	@Override
	public Account getAccountbyCustomerId(String customerId) throws Exception {
		// TODO Auto-generated method stub
		if(customerId==null)
		{
			throw new Exception("Customer Id is Null!!!");
		}
		Account account=null;
		Set<Entry<String,Account>> entrySet=map.entrySet();
		for(Entry<String, Account> entry:entrySet)
		{
			if(entry.getKey().equals(customerId))
			{
				account=entry.getValue();
			}
		}
		return account;
	}

}
