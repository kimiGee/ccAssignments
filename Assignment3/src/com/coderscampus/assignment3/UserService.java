package com.coderscampus.assignment3;

public class UserService {
	
	public User createUser(String username, String password, String name) {
		User user = new User(username, password, name);
		return user;		
	}

}
