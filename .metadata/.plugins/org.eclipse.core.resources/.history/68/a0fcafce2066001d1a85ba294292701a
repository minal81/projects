package com.Bank.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Account")
public class Account {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long AccountNo;

	@Column(name = "Accounttype", nullable = false)
	private String AccountType;

	@Column(name = "OwnerFirstName", length = 20)
	private String OwnerFName;

	@Column(name = "OwnerLastName", length = 20)
	private String OwnerLName;

	@Column(name = "BankName")
	private String BankName;

	@Column(name = "Transaction Id")
	private long Tid;

	@Column(name = "Balance")
	private Double Balance;

	public long getAccountNo() {
		return AccountNo;
	}

	public void setAccountNo(long accountNo) {
		AccountNo = accountNo;
	}

	public String getAccountType() {
		return AccountType;
	}

	public void setAccountType(String accountType) {
		AccountType = accountType;
	}

	public String getOwnerFName() {
		return OwnerFName;
	}

	public void setOwnerFName(String ownerFName) {
		OwnerFName = ownerFName;
	}

	public String getOwnerLName() {
		return OwnerLName;
	}

	public void setOwnerLName(String ownerLName) {
		OwnerLName = ownerLName;
	}

	public String getBankName() {
		return BankName;
	}

	public void setBankName(String bankName) {
		BankName = bankName;
	}

	public long getTid() {
		return Tid;
	}

	public void setTid(long tid) {
		Tid = tid;
	}

	public Double getBalance() {
		return Balance;
	}

	public void setBalance(Double balance) {
		Balance = balance;
	}

}
