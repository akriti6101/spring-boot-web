package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.beans.User;

@Service
public class UserService {
    @Autowired
	private UserRepo userDao;

	public UserService(UserRepo userDao) {
		super();
		this.userDao = userDao;
	}

	public UserService() {
	} 
    
	public void registerData(User user) {
		userDao.save(user);
	}
    
	public List<User> showData() {
		
		List<User> users=null;
		users=(List<User>) userDao.findAll();
		return users;
	}
}
