package com.SpringBoot911.SpringBoot911.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
//import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.validation.constraints.Email;

import lombok.Data;

@Data 
@Entity
public class Student {
	@Id
	@Column(length=5)
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column(length=30,nullable=false)
	@NotBlank(message="name cannot be blank")
	//@Min(value=3,message="name should be at least 3 letter")
	private String name;
	 
	 @Column(length=20,nullable=false,unique=true)
	 @Email(message="email is not proper")
	private String Email;
	 
	 	@OneToMany(fetch = FetchType.EAGER, mappedBy = "student", cascade = CascadeType.ALL)
		@JsonManagedReference
		private List<Batch> batches;
	

}
