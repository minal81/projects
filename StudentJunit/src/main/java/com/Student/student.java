package com.Student;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity

@Table(name = "EMPLOYEE")
public class student {
	 @Id

     @GeneratedValue(strategy = GenerationType.AUTO)

     @Column(name = "ID")
	private Integer Id;
	 @Column(name = "name")
	private String Name;
	 @Column(name = "Qulification")
	private String Qulification;
	 
	 
	 
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getQulification() {
		return Qulification;
	}
	public void setQulification(String qulification) {
		Qulification = qulification;
	}
	
	

}
