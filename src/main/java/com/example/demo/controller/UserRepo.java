package com.example.demo.controller;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.beans.User;

public interface UserRepo extends CrudRepository<User,String>{

}
