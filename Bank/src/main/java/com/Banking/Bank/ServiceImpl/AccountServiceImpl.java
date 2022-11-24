package com.Banking.Bank.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Banking.Bank.entity.Account;
import com.Banking.Bank.repository.AccountRepository;
import com.Banking.Bank.service.AccountService;

@Service
public class AccountServiceImpl  implements AccountService
{
	@Autowired
	AccountRepository accountrepository;

	@Override
	public Account CreateAccount(Account account) {
		
		return accountrepository.save(account);
	}

	@Override
	public Account GetAccount(long AccountNo) {
		
		return accountrepository.findById(AccountNo).get();
	}

}
