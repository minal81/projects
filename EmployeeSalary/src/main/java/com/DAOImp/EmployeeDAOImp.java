package com.DAOImp;

import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import com.DAO.EmployeeDAO;
import com.Entity.Employee;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class EmployeeDAOImp implements EmployeeDAO{
	EntityManager em = null;
	{
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("empSal");
		
		em = emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
	}
	
	Employee e1=new Employee();
	Scanner sc=new Scanner(System.in);
	
	JFrame jp = new JFrame();
	 
	public void AddEmp()
	{
		System.out.println("Enter employee First name");
		String f_name=sc.next();
		e1.setE_F_name(f_name);
		
		
		System.out.println("Enter employee Last name");
		String L_name=sc.next();
		e1.setE_L_name(L_name);
		
		System.out.println("Enter employee Date of birth(dd/mm/yyyy)");
		String DOB=sc.next();
		e1.setE_DOB(DOB);//
		
		System.out.println("Enter employee Gender(M/F)");
	    char Gender=sc.next().charAt(0);
	    e1.setE_Gender(Gender);
	    
	    System.out.println("Enter employee City");
	    String City=sc.next();
	    e1.setE_City(City);
	    
	    System.out.println("Enter employee Phone");
	    long phone=sc.nextLong();
	    e1.setE_Phone(phone);
	    
	    System.out.println("Enter employee Designation");
	    String Designation=sc.next();
	    e1.setE_Designation(Designation);
	    
	   
	    System.out.println("Enter employee Department");
	    String Department=sc.next();
	    e1.setE_Department(Department);
	    
	    System.out.println("Enter employee date of joining(dd/mm/yyyy");
	    String DOJ=sc.next();
	    e1.setE_DOJ(DOJ);
	    
	    System.out.println("Enter employee Grade");
	    char Grade=sc.next().charAt(0);
	    e1.setE_Grade(Grade);
	    em.persist(e1);
        
        
        JOptionPane.showMessageDialog(jp, "Succeussfully Inserted..", "Alert",JOptionPane.INFORMATION_MESSAGE);
	}
	
	public void ViewEmp()
	{
		
		int a=Integer.parseInt(JOptionPane.showInputDialog(jp, "Enter your employee Id to see the data"));
		Employee f1 = em.find(Employee.class, a);
		System.out.println("Employee f_name:  "+f1.getE_F_name());
		System.out.println("Employee L_name: "+f1.getE_L_name());
		System.out.println("Employee City: "+f1.getE_City());
		System.out.println("Employee Department:  "+f1.getE_Department());
		System.out.println("Employee DEsignation: "+f1.getE_Designation());
		
		
	}
	public void UpdateEmp()
	{
		int a = Integer.parseInt(JOptionPane.showInputDialog(jp, "Enter that employee Id to update the salary"));
		Employee u1=em.find(Employee.class, a);
		String f_name=u1.getE_F_name();
		String L_name=u1.getE_L_name();
		u1.setE_F_name(f_name);
		u1.setE_L_name(L_name);
		JOptionPane.showMessageDialog(jp, "Succeussfully Updated..", "Alert",JOptionPane.INFORMATION_MESSAGE);
	}
	public void DeleteEmp()
	{
		int a = Integer.parseInt(JOptionPane.showInputDialog(jp, "Enter that employee Id to delete"));
		Employee e4 = em.find(Employee.class, a);
		em.remove(e4);
		//System.out.println("After deletion:" + e4.getE_id());
		JOptionPane.showMessageDialog(jp, "Succeussfully Deleted...", "Alert",JOptionPane.INFORMATION_MESSAGE);
	}
	

}
