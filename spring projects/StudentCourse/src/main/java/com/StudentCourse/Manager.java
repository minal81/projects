package com.StudentCourse;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Manager {

	public static void main(String[] args) {
		
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("StudentCourse");
		EntityManager em=emf.createEntityManager();
		em.getTransaction().begin();
		
		Scanner sc=new Scanner(System.in);
		Student s1=new Student();
		System.out.println("ENter Student Name");
		String name=sc.nextLine();
		s1.setName(name);
		
		System.out.println("ENter Student Branch");
		String Branch=sc.nextLine();
		s1.setBranch(Branch);
		
		
		Course c1=new Course();
		System.out.println("ENter Course Name");
		String CName=sc.nextLine();
		c1.setCName(CName);
		
		System.out.println("ENter Course Duration");
		int CDuration=sc.nextInt();
		c1.setDuration(CDuration);
		
		 Set<Course> sc1 = new HashSet<Course>();

         sc1.add(c1);

     

         Set<Student> ss = new HashSet<Student>();

         ss.add(s1);

       



         // ASSOCIATING STUDENT WITH COURSE

         c1.setStudents(ss);

        



         // ASSOCIATING COURSE WITH STUDENT

         s1.setCourses(sc1);

        



         em.persist(s1);

        

         em.getTransaction().commit();
		
				
		
		
		
		
		
		
		

	}

}
