package com.SpringBoot911.SpringBoot911.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;


import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.Data;

@Data
@Entity
public class Batch {
	
	@Id
	private int bid;
	
	@Column(length = 30, nullable = false)
	@NotBlank(message = "batchname cannot be blank")
	private String batchname;
	
	@Column(length = 30, nullable = false)
	@NotBlank(message = "name cannot be blank")
	private String tname;
	
	private int time;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name="studentId", referencedColumnName = "id")
	@JsonBackReference
	//private Student student;
	private Student student;
}
