package com.CRUD;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class StudentMain {

	public static void main(String[] args) {
		EntityManagerFactory emf=null;
		EntityManager em=null;	
		EntityTransaction et=null;
			
			
				emf=Persistence.createEntityManagerFactory("StudentUnit");
				em=emf.createEntityManager();
				et=em.getTransaction();
				//call the Transaction's begin
				et.begin();
				
				/*Student student=new Student();
				student.setFName("manish");
				student.setLName("pathak");
				student.setContactNO(526362617L);
				em.persist(student);*/
				
				//retrive the entity from database
				
				//to update the data
				Student s=em.find(Student.class,1);
				s.setLName("patil");
				System.out.println("Student firstt name: "+s.getFName());
				System.out.println("Student last name: "+s.getLName());
				System.out.println("Student Contact No: "+s.getContactNO());
				//to delete the row
				
				if(s!=null) {
					em.remove(s);
				}
				
				
				
				 em.getTransaction().commit();
				 
				 
			
		
			
	}

}