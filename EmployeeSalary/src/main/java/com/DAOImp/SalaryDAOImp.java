package com.DAOImp;

import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import com.DAO.SalaryDAO;
import com.Entity.Salary;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;





public class SalaryDAOImp implements SalaryDAO {
	EntityManager em = null;
	{
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("empSal");
		
		em = emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
	}
	Scanner sc=new Scanner(System.in);
	Salary s1=new Salary();
	JFrame jp = new JFrame();
	
	
	public void AddSal()
	{
		System.out.println("Enter Employee id");
	    int id=sc.nextInt();
	    s1.setE_id(id);
	    
		
		System.out.println("Enter Salary paid date");
	    String p_date=sc.next();
	    s1.setPaid_Date(p_date);
	    
	    System.out.println("enter Salary amount");
	    float S=sc.nextFloat();
	    s1.setAmount_Paid(S);
	    em.persist(s1);
        JOptionPane.showMessageDialog(jp, "Succeussfully Inserted..", "Alert",JOptionPane.INFORMATION_MESSAGE);
	}
	public void AddBonus()
	{
		
	}
	

}
