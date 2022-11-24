package com.Bank.DAOImpl;

import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import com.Bank.DAO.AccountDAO;
import com.Bank.Entity.Account;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class AccountDAOImpl implements AccountDAO {

	
	Scanner sc = new Scanner(System.in);
	JFrame jp = new JFrame();
	EntityManagerFactory emf = null;
	EntityManager em = null;
	EntityTransaction et = null;

	// Import EntityManager factory to implement JPA and Hibernate
	{
		emf = Persistence.createEntityManagerFactory("BankUnit");

		em = emf.createEntityManager();
		et = em.getTransaction();
	}

	public Boolean CreateAccount() {
		et.begin();
		Account A1=new Account();
		System.out.println("Enter Account Type");
		String Atype = sc.next();
		A1.setAccountType(Atype);
		
		System.out.println("Enter Account First Name");
		String FName = sc.next();
		A1.setOwnerFName(FName);
		
		System.out.println("Enter Account Last Name");
		String LName = sc.next();
		A1.setOwnerLName(LName);
		
		System.out.println("Enter Bank Name");
		String Bank = sc.next();
		A1.setBankName(Bank);
		

		System.out.println("Enter Tranaction Id");
		long TId = sc.nextLong();
		A1.setTid(TId);
		
		System.out.println("Which type of account you want \n1.Zero Account \n2.Saving Account");
		int type=sc.nextInt();
		if(type ==1) {
			A1.setBalance(0.00);}
		else {
			System.out.println("To Open Saving Account Minimum Balance is 2000 rs");
			A1.setBalance(2000.00);}
		
		 em.persist(A1);
		 et.commit();
		 JOptionPane.showMessageDialog(jp, "Account Created Successfully", "Alert", JOptionPane.INFORMATION_MESSAGE);
		 return true;
		
	}

	public void Withdraw() {
		
		et.begin();
		System.out.println("Enter Account Id");
		long id = sc.nextInt();
		Account A1=em.find(Account.class, id);
		System.out.println("Enter Withdraw Amount");
	    double amt=sc.nextLong();
	    double bal=A1.getBalance();
	    if( bal >= amt)
	    {
	    	
	    	Double Balance=A1.getBalance() - amt;
	        A1.setBalance(Balance);
	        JOptionPane.showMessageDialog(jp, "Withdraw Successfully", "Alert", JOptionPane.INFORMATION_MESSAGE);
	    	System.out.println("Current Balance:- "+Balance);

	    }
	    else {
	    	System.out.println("Your balance is less than " + amt + "\tTransaction failed...!!");
	    }
	    em.persist(A1);
	    et.commit();
	
		
	}

	public void Deposit() {
		
		et.begin();
		System.out.println("Enter Account Number");
		long id = sc.nextInt();
		Account A1=em.find(Account.class, id);
		System.out.println("Enter Deposit Amount");
	    double amt =sc.nextLong()+A1.getBalance();
	    A1.setBalance(amt);
	    JOptionPane.showMessageDialog(jp, "Deposit  Successfully", "Alert", JOptionPane.INFORMATION_MESSAGE);
	    System.out.println("Current Balance : "+A1.getBalance());
	    em.persist(A1);
	    et.commit();
		
	}

	public Boolean CurrentBalance() {
		
		et.begin();
		System.out.println("Enter Account Number");
		long id = sc.nextInt();
		Account A1=em.find(Account.class, id);
		System.out.println("\n\nAccount Id : "+A1.getAccountNo());
		System.out.println("Current Balance :"+A1.getBalance());
		et.commit();
		return true;
	}

}
