package com.reinertisa.rest;

import java.util.List;

import com.reinertisa.model.User;

public interface UserController {

	public boolean regesterUser(User user);
	public List<User> getAllUsers();
	public User getUser(String username);
	public User getUser(int user_id);
}
