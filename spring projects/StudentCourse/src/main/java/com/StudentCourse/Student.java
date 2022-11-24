package com.StudentCourse;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import jakarta.persistence.JoinTable;
import jakarta.persistence.JoinColumn;
import java.util.Set;




@Entity
@Table(name="Student")
public class Student {
	@jakarta.persistence.Id
	@Column(name="SID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int Id;
	
	
	@Column(name="Name")
	private String Name;
	
	@Column(name="Branch")
	private String Branch; 
	
	
	@ManyToMany(cascade = CascadeType.ALL)

    @JoinTable(name ="STUDENTCOURSE", joinColumns = {@JoinColumn(name = "SID") }, inverseJoinColumns = {@JoinColumn(name = "CID") })

    private Set<Course> courses;


	public int getId() {
		return Id;
	}


	public void setId(int id) {
		Id = id;
	}


	public String getName() {
		return Name;
	}


	public void setName(String name) {
		Name = name;
	}


	public String getBranch() {
		return Branch;
	}


	public void setBranch(String branch) {
		Branch = branch;
	}


	public Set<Course> getCourses() {
		return courses;
	}


	public void setCourses(Set<Course> courses) {
		this.courses = courses;
	}
	
	

}
