package com.SpringBoot911.SpringBoot911.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringBoot911.SpringBoot911.Service.UserService;
import com.SpringBoot911.SpringBoot911.entity.User;
import com.SpringBoot911.SpringBoot911.respository.UserRepository;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	UserRepository urepo;
	
	@Override
	public User loginU(String userName, String password) {
		User user = urepo.findByUserNameAndPassword(userName, password);
		return user;
	}

}
