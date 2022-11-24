package com.Banking.Bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Banking.Bank.entity.Transaction;

public interface TransactionRepository  extends JpaRepository<Transaction,Long>
{
          
}
