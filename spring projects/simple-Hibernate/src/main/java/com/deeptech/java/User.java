package com.deeptech.java;
import javax.persistence.*;

@Entity
@Table(name="USER")
public class User {
	private Integer Id;
	private String name;
	private String email;
	private String password;
	
	@Column(name="User_Id")
	@Id
	
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}
