package com.deeptech;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="studentinfo")
public class Student {
	
private int id;
private String name;
private String email;
private String Phoneno;


@Id
@Column(name="id")
@GeneratedValue(strategy=GenerationType.IDENTITY)

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
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
public String getPhoneno() {
	return Phoneno;
}
public void setPhoneno(String phoneno) {
	Phoneno = phoneno;
}

}
