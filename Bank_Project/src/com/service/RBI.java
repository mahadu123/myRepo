package com.service;

import com.exception.inputMismatchException;

public interface RBI {
	
	public void createAccount() throws inputMismatchException;
	public void viewAccountDetails();
	public void withDrawlMoney();
	public void depositMoney();
	public void updateDetails();
	public void viewAccountBalance();
	
	

}
