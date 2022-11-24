package com.mapping;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;


@Entity

@Table(name = "EMPLOYEEDETAIL")

public class Employeedetail  {

 

        @Id

        @GeneratedValue(strategy = GenerationType.AUTO)

        private int empdetailid;

 

        private int age;

       

        private String state;

       

        private int empid;

       

        public int getEmpdetailid() {

                return empdetailid;

        }

        public void setEmpdetailid(int empdetailid) {

                this.empdetailid = empdetailid;

        }

        public int getAge() {

                return age;

        }

        public void setAge(int age) {

                this.age = age;

        }

        public String getState() {

                return state;

        }

        public void setState(String state) {

                this.state = state;

        }

        public int getEmpid() {

                return empid;

        }

        public void setEmpid(int empid) {

                this.empid = empid;

        }

}