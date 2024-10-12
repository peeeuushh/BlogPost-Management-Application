package com.blog.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blog.model.Users;
import com.blog.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@PostMapping("/createUser")
	public Users createUser(@RequestBody Users user)
	{
		return userService.createUser(user);
	}
	
	@GetMapping("/getAllUsers")
	public List<Users> getAllUsers()
	{
		return userService.getAllUsers();
	}
	
	@GetMapping("/getUser/{id}")
	public Optional<Users> getUser(@PathVariable ("id") int id)
	{
		return userService.getUser(id);
	}
	
	@PutMapping("/updateUser/{id}")
	public Users updateUser(@PathVariable ("id") int id,@RequestBody Users user)
	{
		return userService.updateUser(id, user);
	}
	
	@DeleteMapping("/deleteUser/{id}")
	public void deleteUser(@PathVariable ("id") int id)
	{
		userService.deleteUser(id);
	}
	
	
	
	
	
	
	
	
	
}
