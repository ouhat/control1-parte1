package com.upm.profundizacion;

import java.util.ArrayList;
import java.util.List;

public class Customer {
	
	private List<Account> accounts;
	
	Customer() {
		accounts = new ArrayList<Account>();
	}
	
	public String getAccountWithHighestBalance() throws NoAccountsException {
		
		if(accounts.isEmpty()) {
			throw new NoAccountsException();
		}
		
		
		String selectedAccount = "";
		float maxBalance = 0;
		
		for(Account account : accounts) {
			
			if(account.getCurrentBalance() > maxBalance) {
				
				selectedAccount = account.getAccountNumber();
				
			}
			
		}
		
		return selectedAccount;
		
	}
	
}
