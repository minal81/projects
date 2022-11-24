package com.deeptech;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;



public class StudentManagerEx {

	
	static EntityManager entityM;
	private static final EntityManagerFactory factory ;
	private static final String PERSISTENCE_UNIT_NAME = "BookUnit";	

	static {
		factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
	}

	public static void main(String[] args) {
		entityM=factory.createEntityManager();
		
		entityM.getTransaction().begin();
		Student s1=new Student();
		s1.setName("ashish");
		s1.setEmail("ashish@anudip");
		s1.setPhoneno("1234525");
		entityM.persist(s1);
		entityM.getTransaction().commit();
		entityM.close();
		factory.close();
	}

	

}
