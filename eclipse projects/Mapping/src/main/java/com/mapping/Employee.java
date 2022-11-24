package com.mapping;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity

@Table(name="Employee")

public class Employee  {

 

        //Below @Column annotation is required, because there are two columns with the name EMPID

        //one in EMPLOYEE table and one in EMPLOYEEDETAIL table. If this field is not annotated with

        //@Column then while persisting Employee object JPA will get into conflict about where to persist this column

        //either to EMPLOYEE table or to the EMPLOYEEDETAIL table. We will persist only Employee object, due to the 121

        //relationship Employeedetail will also be persisted. So EMPID column of EMPLOYEEDETAIL table will be inserted

        //from Employee object, so both EMPID columns will be inserted through Employee object itself.

        @Id

        @Column(name = "EMPID")

        private int empid;

       

        private String name;

 

        @OneToOne(cascade = CascadeType.ALL )

        @JoinColumn(name = "EMPID")

        private Employeedetail employeedetails;

       

        //setters and getters

        public int getEmpid() {

                return empid;

        }

        public void setEmpid(int empid) {

                this.empid = empid;

        }

        public String getName() {

                return name;

        }

        public void setName(String name) {

                this.name = name;

        }

        public Employeedetail getEmployeedetails() {

                return employeedetails;

        }

        public void setEmployeedetails(Employeedetail employeedetails) {

                this.employeedetails = employeedetails;

        }

}