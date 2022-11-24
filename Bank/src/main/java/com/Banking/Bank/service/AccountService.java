package com.Banking.Bank.service;

import com.Banking.Bank.entity.Account;

public interface AccountService 
{
	//To Create a Account
     Account CreateAccount(Account account);
     
    //To Get Details of Account  
    Account GetAccount(long AccountNo);
}
