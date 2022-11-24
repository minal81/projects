package com.employee;


import jakarta.persistence.Persistence;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;

public class employeeManager {
	static EntityManager entityM;
	private static final EntityManagerFactory factory;
	private static final String PERSISTENCE_UNIT_NAME = "employeeUnit";	
	
	static {
		factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
	}



	public static void main(String[] args) {
		
		entityM=factory.createEntityManager();
		entityM.getTransaction().begin();
		
		employee e1=new employee();
		e1.setName("namrata");
		e1.setSalary(20000);
		entityM.persist(e1);
		entityM.getTransaction().commit();
		entityM.close();
		factory.close();
		

	}

}
