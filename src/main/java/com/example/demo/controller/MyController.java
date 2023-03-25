package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.beans.User;

@Controller
public class MyController {
    @Autowired
	private UserService userService;
	
	@RequestMapping("/")
	public String home() {
		return "home";
	}
	@RequestMapping("/register")
	public String registrationPage() {
		return "Register";
	}
	@PostMapping("/registerData")
	public String registerData(@ModelAttribute("user") User user) {
		userService.registerData(user);
		return "home";
	}
	@RequestMapping("/showData")
	public String showData(Model model) {
		List<User> users=userService.showData();
		model.addAttribute("users", users);
		return "showUsers";
	}
}
