package com.CRUD;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Student")

public class Student {
	@Id
	@Column(name="StudentId")
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Integer id;
	
	@Column(name="StudentFirstName")
	private String FName;
	
	@Column(name="StudentLastName")
	private String LName;
	
	@Column(name="StudentContactNo")
	private Long ContactNO;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFName() {
		return FName;
	}
	public void setFName(String fName) {
		FName = fName;
	}
	public String getLName() {
		return LName;
	}
	public void setLName(String lName) {
		LName = lName;
	}
	public Long getContactNO() {
		return ContactNO;
	}
	public void setContactNO(Long contactNO) {
		ContactNO = contactNO;
	}
	
	

}
