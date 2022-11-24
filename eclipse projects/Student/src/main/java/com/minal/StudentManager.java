package com.minal;




import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class StudentManager {

	
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
		s1.setName("manish");
		s1.setEmail("manish@anudip");
		s1.setPhoneno("543235");
		entityM.persist(s1);
		entityM.getTransaction().commit();
		entityM.close();
		factory.close();
	}

	

}
