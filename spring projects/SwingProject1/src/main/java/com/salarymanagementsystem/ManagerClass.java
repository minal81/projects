package com.salarymanagementsystem;

import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class ManagerClass {

	public static void main(String[] args) {
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("EmployeeSalary");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=null;
				et=em.getTransaction();
				et.begin();
		
		try {
			
		
		
		
		
		Salary s1=new Salary();
	    s1.setPaid_Date("10/10/2022");
	    s1.setAmount_Paid(40000f);   
	    
	    
	    
	    
		Employee e1=new Employee();
		Scanner sc=new Scanner(System.in);
		
		JFrame jp = new JFrame();

		System.out.println("1.INSERT Data");
		System.out.println("2.RETRIVE Data");
		System.out.println("3.UPDATE Data");
		System.out.println("4.DELETE Data");
		System.out.println("5.Quit");
		int option = Integer.parseInt(JOptionPane.showInputDialog(jp, "Enter your Choice:"));
		while (option != 5) {
			/*System.out.println("1.INSERT Data");
			System.out.println("2.RETRIVE Data");
			System.out.println("3.UPDATE Data");
			System.out.println("4.DELETE Data");
			System.out.println("5.Quit");*/
			option = Integer.parseInt(JOptionPane.showInputDialog(jp, "Enter your Choice:"));
			switch (option)
			{
			
			
			
			case 1:{
			System.out.println("Enter Employee First name");
			String f_name=sc.next();
			e1.setE_F_name(f_name);
			
			
			System.out.println("Enter Employee Last name");
			String L_name=sc.next();
			e1.setE_F_name(L_name);
			
			System.out.println("Enter Employee Date of birth(dd/mm/yyyy)");
			String DOB=sc.next();
			e1.setE_DOB(DOB);//
			
			System.out.println("Enter Employee Gender(M/F)");
		    char Gender=sc.next().charAt(0);
		    e1.setE_Gender(Gender);
		    
		    System.out.println("Enter Employee Address");
		    String Address=sc.next();
		    e1.setE_Address(Address);
		    
		    System.out.println("Enter Employee City");
		    String City=sc.next();
		    e1.setE_City(City);
		    
		    System.out.println("Enter Employee Phone");
		    long phone=sc.nextLong();
		    e1.setE_Phone(phone);
		    
		    System.out.println("Enter Employee Designation");
		    String Designation=sc.next();
		    e1.setE_Designation(Designation);
		    
		   
		    System.out.println("Enter Employee Department");
		    String Department=sc.next();
		    e1.setE_Department(Department);
		    
		    System.out.println("Enter Employee date of joining(dd/mm/yyyy");
		    String DOJ=sc.next();
		    e1.setE_DOJ(DOJ);
		    
		    System.out.println("Enter Employee Grade");
		    char Grade=sc.next().charAt(0);
		    e1.setE_Grade(Grade);
		    
		    e1.setSalary(s1);
		    em.persist(e1);
		    JOptionPane.showMessageDialog(jp, "Succeussfully Inserted..", "Alert",JOptionPane.INFORMATION_MESSAGE);
			break;
		    	
			}
			case 2:
			{
				Employee f1 = em.find(Employee.class, 3);
				System.out.println("Employee f_name:  "+f1.getE_F_name());
				System.out.println("Employee L_name: "+f1.getE_L_name());
				System.out.println("Employee City: "+f1.getE_City());
				System.out.println("Employee Department:  "+f1.getE_Department());
				System.out.println("Employee DEsignation: "+f1.getE_Designation());
				//System.out.println("Employee Salary:"+f1.getSalary());
				break;
				
				
			}
			case 3:
			{
				int a = Integer.parseInt(JOptionPane.showInputDialog(jp, "Enter your employee Id"));
				Salary s2= em.find(Salary.class, a);
				float sa=s2.getAmount_Paid();
				float ca=(sa*40)/100+sa;
				s2.setAmount_Paid(ca);// UPDATE QUERY
				System.out.println("Congratulations" + s2.getS_Id()+"Your current salary after 40% hike is.."+s2.getAmount_Paid());
				 JOptionPane.showMessageDialog(jp, "Succeussfully Updated..", "Alert",JOptionPane.INFORMATION_MESSAGE);
				break;
			}
			case 4: {
				int a = Integer.parseInt(JOptionPane.showInputDialog(jp, "Enter your employee Id"));

				Employee e4 = em.find(Employee.class, a);
				em.remove(e4);
				System.out.println("After deletion:" + e4.getE_id());
				JOptionPane.showMessageDialog(jp, "Succeussfully Deleted...", "Alert",JOptionPane.INFORMATION_MESSAGE);
				break;
			}
			case 5: {
				
				jp.setVisible(false);
				jp.dispose();

			}
			}
		
		
		
	    et.commit();
	}
		}
	 catch (Exception e) {
		//et.rollback();
		 

	} finally {
		em.close();
		emf.close();
	}
		

}
}
