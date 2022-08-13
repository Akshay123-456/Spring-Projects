package com.informationasset.service;

import com.informationasset.model.Account;

public interface AccountService {
public abstract Account getAccountbyCustomerId(String customerId) throws Exception;
}
