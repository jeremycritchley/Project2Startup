package com.reinertisa.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.reinertisa.model.User;
import com.reinertisa.service.UserService;

@RestController("userController")
//@CrossOrigin(origins="http://localhost:8080/project-2")
public class UserControllerImpl implements UserController {

	@Autowired
	private UserService userService;
	
	@PostMapping("/users")
	public boolean regesterUser( User user) {
		
		return userService.registerUser(user);
	}

	@GetMapping("/users")
	public List<User> getAllUsers() {
		
		return userService.getAllUsers();
	}

	
	@GetMapping("/users/username")
	public @ResponseBody User getUser(@RequestBody String username) {
		// TODO Auto-generated method stub
		return userService.getUser(username);
	}

	@GetMapping("/users/id")
	public User getUser(int user_id) {
		// TODO Auto-generated method stub
		return null;
	}

}
