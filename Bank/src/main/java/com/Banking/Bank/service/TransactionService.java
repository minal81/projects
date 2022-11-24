package com.Banking.Bank.service;

import com.Banking.Bank.entity.Transaction;

public interface TransactionService {
	//To Withdraw amount
	void Withdraw(long Tid);
	
	//to deposit amount
	Void Deposit(long Tid);

	//To Get Current Balance
	Transaction GetAmount(long Tid);
}
