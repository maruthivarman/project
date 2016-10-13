package com.niit.service;
import java.util.List;

import com.niit.model.User;

public interface UserDAO {
	public List<User> getAllUsers();
	 public User getUser(int userid);
	 public void insertUser(User user);
	 public void updateUser(User user);
	 public void deleteUser(int id);
	 public void deleteAllUser(User user);
	 
}
