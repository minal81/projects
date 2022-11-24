package com.StudentUniversity;





import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class ManagerClass {

	public static void main(String[] args) {


        EntityManagerFactory emf = Persistence.createEntityManagerFactory("StudentUnit");

        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        
        University u1=new University();
        u1.setUniversityName("mumbai");
        u1.setState("maharashtra");
        u1.setUniversityID(1);
        
        
        Student s1=new Student();
        s1.setName("minal");
        s1.setCourse("electrical");
        s1.setUniversity(u1);
        
        Student s2=new Student();
        s2.setName("manish");
        s2.setCourse("civil");
        s2.setUniversity(u1);
        
        Student s3=new Student();
        s3.setName("sai");
        s3.setCourse("IT");
        s3.setUniversity(u1);
        
        
        em.persist(s1);

        em.persist(s2);

        em.persist(s3);
        
        em.getTransaction().commit();

       
        
        


	}

}
