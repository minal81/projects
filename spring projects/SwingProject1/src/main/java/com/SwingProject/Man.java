package com.SwingProject;


import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import com.salarymanagementsystem.Employee;
import com.salarymanagementsystem.Salary;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;



public class Man {

	public static void main(String[] args) {
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("EmpSal");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=null;
				et=em.getTransaction();
				et.begin();
				
		try
		{
			Sal s1=new Sal();
			Emp e1=new Emp();
			Scanner sc=new Scanner(System.in);
			
			JFrame jp = new JFrame();

			System.out.println("1.INSERT Data");
			System.out.println("2.RETRIVE Data");
			System.out.println("3.UPDATE Data");
			System.out.println("4.DELETE Data");
			System.out.println("5.Quit");
			int option = Integer.parseInt(JOptionPane.showInputDialog(jp, "Enter your Choice:"));
			while (option != 5)
			{
				System.out.println("1.INSERT Data");
				System.out.println("2.RETRIVE Data");
				System.out.println("3.UPDATE Data");
				System.out.println("4.DELETE Data");
				System.out.println("5.Quit");
				option = Integer.parseInt(JOptionPane.showInputDialog(jp, "Enter your Choice:"));
				switch(option)
				{
				case 1:
				{
					System.out.println("Enter Employee First name");
					String f_name=sc.next();
					e1.setE_F_name(f_name);
					
					
					System.out.println("Enter Employee Last name");
					String L_name=sc.next();
					e1.setE_L_name(L_name);
					
					System.out.println("Enter Employee Date of birth(dd/mm/yyyy)");
					String DOB=sc.next();
					e1.setE_DOB(DOB);//
					
					System.out.println("Enter Employee Gender(M/F)");
				    char Gender=sc.next().charAt(0);
				    e1.setE_Gender(Gender);
				    
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
				    
				    System.out.println("Enter Salary paid date");
				    String p_date=sc.next();
				    s1.setPaid_Date(p_date);
				    
				    System.out.println("enter Salary amount");
				    float S=sc.nextFloat();
				    s1.setAmount_Paid(S);
				    
				    System.out.println("enter Salary slip no.");
				    String u=sc.next();
				    s1.setSlip_No(u);
				    
				    Set<Sal> s2 = new HashSet<Sal>();
	                s2.add(s1);
	                Set<Emp> e2 = new HashSet<Emp>();

	                e2.add(e1);
	                
	             // ASSOCIATING Sal WITH Emp

	                s1.setEmp(e2);
	                
	             // ASSOCIATING Emp WITH Sal

	                e1.setSal(s2);
	                
	                em.persist(e1);
	                em.getTransaction().commit();
	                
	                JOptionPane.showMessageDialog(jp, "Succeussfully Inserted..", "Alert",JOptionPane.INFORMATION_MESSAGE);
	    			break;
	               
				}
				case 2:
				{
				    
					int a=Integer.parseInt(JOptionPane.showInputDialog(jp, "Enter your employee Id to see the data"));
					Emp f1 = em.find(Emp.class, a);
					System.out.println("Employee f_name:  "+f1.getE_F_name());
					System.out.println("Employee L_name: "+f1.getE_L_name());
					System.out.println("Employee City: "+f1.getE_City());
					System.out.println("Employee Department:  "+f1.getE_Department());
					System.out.println("Employee DEsignation: "+f1.getE_Designation());
					Set<Sal> z =f1.getSal();
							//f1.getSalary();
	                for (Sal sal : z) 
	                {

	                    System.out.println("Employee Salary " + sal.getAmount_Paid());

	                }
					
					
					break;
				}
				case 3:
				{
					int a = Integer.parseInt(JOptionPane.showInputDialog(jp, "Enter that employee Id to update the salary"));
					Sal s2= em.find(Sal.class, a);
					float sa=s2.getAmount_Paid();
					float ca=(sa*40)/100+sa;
					s2.setAmount_Paid(ca);// UPDATE QUERY
					System.out.println("Congratulations" + s2.getS_Id()+"Your current salary after 40% hike is.."+s2.getAmount_Paid());
					 JOptionPane.showMessageDialog(jp, "Succeussfully Updated..", "Alert",JOptionPane.INFORMATION_MESSAGE);
					break;
				}
				case 4:
				{
					int a = Integer.parseInt(JOptionPane.showInputDialog(jp, "Enter that employee Id to delete"));
					Emp e4 = em.find(Emp.class, a);
					em.remove(e4);
					System.out.println("After deletion:" + e4.getE_id());
					JOptionPane.showMessageDialog(jp, "Succeussfully Deleted...", "Alert",JOptionPane.INFORMATION_MESSAGE);
					break;
				}
				case 5:
				{
					jp.setVisible(false);
					jp.dispose();
				}
				em.getTransaction().commit();
				}
				  
				//et.commit();
			}
		}
		 catch (Exception e) {
				//et.rollback();
				 

			} finally {
				//em.close();
				//emf.close();
			}
				

	}

}
