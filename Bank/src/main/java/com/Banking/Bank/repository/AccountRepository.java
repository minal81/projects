package com.Banking.Bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.Banking.Bank.entity.Account;

public interface AccountRepository  extends JpaRepository<Account,Long>{

}
