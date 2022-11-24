package com.StudentCourse;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="Course")
public class Course {
	
	@Id
	@Column(name="CID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int CId;
	
	@Column(name="CName")
	private String CName;
	
	@Column(name="CDuration")
	private int Duration;
	
	
	@ManyToMany(mappedBy = "courses",cascade=CascadeType.ALL)

    private Set<Student> students;


	public int getCId() {
		return CId;
	}


	public void setCId(int cId) {
		CId = cId;
	}


	public String getCName() {
		return CName;
	}


	public void setCName(String cName) {
		CName = cName;
	}


	public int getDuration() {
		return Duration;
	}


	public void setDuration(int duration) {
		Duration = duration;
	}


	public Set<Student> getStudents() {
		return students;
	}


	public void setStudents(Set<Student> students) {
		this.students = students;
	}
	
	

}
