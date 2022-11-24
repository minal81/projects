package com.mapping;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Test {

    public static void main(String[] args) {

            EntityManagerFactory emf = Persistence.createEntityManagerFactory("employeeUnit");

            EntityManager em = emf.createEntityManager();



            em.getTransaction().begin();



            Employee emp = new Employee();

            emp.setName("Minal");

            emp.setEmpid(2);



            Employeedetail empdetail = new Employeedetail();

            empdetail.setAge(25);

            empdetail.setState("mumbai");

            empdetail.setEmpid(2);



            emp.setEmployeedetails(empdetail);



            em.persist(emp);



            // Employee can access EmployeeDetails

            Employee e = em.find(Employee.class, 1);

            System.out.println(e.getName());

            System.out.println(e.getEmployeedetails().getState());



            // EmployeeDetails can not access Employee



            em.getTransaction().commit();

    }

}
