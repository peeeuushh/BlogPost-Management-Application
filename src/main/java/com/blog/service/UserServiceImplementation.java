package com.blog.service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blog.model.Users;
import com.blog.dao.UserRepository;

@Service
public class UserServiceImplementation implements UserService{
	
	@Autowired
	UserRepository userRepo;

	@Override
	public Users createUser(Users user) {
		return userRepo.save(user);
	}

	@Override
	public List<Users> getAllUsers() {
		return userRepo.findAll();
	}

	@Override
	public Optional<Users> getUser(int id) {
		return userRepo.findById(id);
	}

	@Override
	public Users updateUser(int id, Users user) {
		Users userDB =userRepo.findById(id).get();
		
		if (Objects.nonNull(user.getName()))
		{
			userDB.setName(user.getName());
		}
		
		if (Objects.nonNull(user.getUser_name()))
		{
			userDB.setUser_name(user.getUser_name());
		}
		
		if (Objects.nonNull(user.getEmail()))
		{
			userDB.setEmail(user.getEmail());
		}
		
		if (Objects.nonNull(user.getPassword()))
		{
			userDB.setPassword(user.getPassword());
		}
		
		return userRepo.save(userDB);
		
		
	}

	@Override
	public void deleteUser(int id) {
		userRepo.deleteById(id);
		
	}
	
}
