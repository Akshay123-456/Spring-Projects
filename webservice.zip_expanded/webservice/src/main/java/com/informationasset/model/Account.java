package com.informationasset.model;

public class Account {
public String accountName, accountType;

public String getAccountName() {
	return accountName;
}

public void setAccountName(String accountName) {
	this.accountName = accountName;
}

public String getAccountType() {
	return accountType;
}

public void setAccountType(String accountType) {
	this.accountType = accountType;
}

public Account(String accountName, String accountType) {
	super();
	this.accountName = accountName;
	this.accountType = accountType;
}

@Override
public String toString() {
	return "Account [accountName=" + accountName + ", accountType=" + accountType + "]";
}

}
