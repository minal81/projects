package com.Banking.Bank.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Banking.Bank.entity.Transaction;
import com.Banking.Bank.repository.TransactionRepository;
import com.Banking.Bank.service.TransactionService;


@Service
public class TransactionServiceImpl  implements TransactionService
{

	@Autowired
	TransactionRepository transactionrepository;
	
	
	@Override
	public void Withdraw(long Tid) {
	 Transaction t1=new Transaction();
	 double amount=t1.getBalance();
	 if(t1.getBalance() >= amount)
	 {
		 double balance=t1.getBalance()-amount;
		 System.out.print("Suceesfull Withdraw");
	 }
	 else {
		 
	 }
		
	}

	@Override
	public Void Deposit(long Tid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Transaction GetAmount(long Tid) {
		// TODO Auto-generated method stub
		return null;
	}

}
