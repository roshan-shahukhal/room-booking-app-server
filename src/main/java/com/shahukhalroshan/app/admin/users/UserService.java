package com.shahukhalroshan.app.admin.users;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shahukhalroshan.app.entities.User;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public void saveOrUpdateUser(User user) {
		this.userRepository.save(user);
	}
	
	public List<User> getAllUsers() {
		List<User> users = new ArrayList<>();
		this.userRepository.findAll().forEach(users :: add);
		
		return users;
	}
	
	public User getUserById(Integer id) {
		return this.userRepository.findById(id).get();
	}
	
	public void deleteUser(Integer id) {
		this.userRepository.deleteById(id);
	}
	
	
	
	

}
