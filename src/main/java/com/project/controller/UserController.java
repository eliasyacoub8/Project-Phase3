package com.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.project.model.User;
import com.project.repository.UserRepository;

@RestController
@RequestMapping("users")
public class UserController {
	@Autowired
	UserRepository userrepository;
	
	@PostMapping ("add")
	public User addUser(@RequestBody User user)
	{
		return userrepository.save(user);
	}
	
	// retrieve all student from database
	
	@GetMapping("allusers")
	public List<User> getAllStudent()
	{
		List<User> user=(List<User>) userrepository.findAll();
		return user;
	}
}
