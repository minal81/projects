package com.anudip.sb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.anudip.sb.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{
	
	public User findByUserNameAndPassword(String userName, String password);

}
