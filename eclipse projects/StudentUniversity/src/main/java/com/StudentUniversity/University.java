package com.StudentUniversity;

import java.util.HashSet;
import java.util.Set;



import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="University")
public class University {
	@Id
	private int UniversityID;
	
	@Column(name="UNiversityName")
	private String UniversityName;
	
	@Column(name="state")
	private String state;
	
	 

	public int getUniversityID() {
		return UniversityID;
	}

	public void setUniversityID(int universityID) {
		UniversityID = universityID;
	}

	public String getUniversityName() {
		return UniversityName;
	}

	public void setUniversityName(String universityName) {
		UniversityName = universityName;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	
	 

	
	

}
