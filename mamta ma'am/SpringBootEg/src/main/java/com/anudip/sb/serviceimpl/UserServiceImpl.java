package com.anudip.sb.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.anudip.sb.entity.User;
import com.anudip.sb.repository.UserRepository;
import com.anudip.sb.service.UserService;

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
