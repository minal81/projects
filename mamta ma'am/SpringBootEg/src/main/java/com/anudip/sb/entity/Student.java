package com.anudip.sb.entity;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;

@Data
@Entity
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(length = 30, nullable = false)
	@NotBlank(message = "name cannot be blank")
	private String name;
	
	
	@Column(length = 20, unique = true, nullable = false)
	@Email(message = "email is not proper")
	private String email;
	
	@Column(length = 15, nullable = false)
	@NotBlank(message = "status cannot be blank")
	private String status;
	
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "student", cascade = CascadeType.ALL)
	@JsonManagedReference
	private List<Batch> batches;

}
