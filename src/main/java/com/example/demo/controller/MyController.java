package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.beans.User;

@Controller
public class MyController {
    @Autowired
	private UserService userService;
	
	@GetMapping("/")
	public String home() {
		return "view/home.jsp";
	}
	@GetMapping("/register")
	public String registrationPage() {
		return "view/Register.jsp";
	}
	@PostMapping("/registerData")
	public String registerData(@ModelAttribute("user") User user) {
		userService.registerData(user);
		return "view/home.jsp";
	}
	@GetMapping("/showData")
	public String showData(Model model) {
		List<User> users=userService.showData();
		model.addAttribute("users", users);
		return "view/showUsers.jsp";
	}
}
