package com.SpringBoot911.SpringBoot911.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SpringBoot911.SpringBoot911.entity.User;


public interface UserRepository extends JpaRepository<User, Integer>{
	
	public User findByUserNameAndPassword(String userName, String password);

}

