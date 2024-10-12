package com.blog.service;

import java.util.List;
import java.util.Optional;

import com.blog.model.Users;

public interface UserService {
	
	Users createUser(Users user);
	
	List<Users> getAllUsers();
	
	Optional<Users> getUser(int id);
	
	Users updateUser(int id,Users user);
	
	void deleteUser(int id);
}
