package com.anudip.sb.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Data;

@Data
@Entity
public class User {
	
	@Id
	private int uid;
	
	@Column(length = 10, nullable = false)
	private String userName;
	
	@Column(length = 10, nullable = false)
	private String password;
}
