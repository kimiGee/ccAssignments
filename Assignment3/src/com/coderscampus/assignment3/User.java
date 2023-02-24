package com.coderscampus.assignment3;

public class User {

	private String username;
	private String password;
	private String name;

	public User(String uName, String pw, String nm) {
		this.username = uName;
		this.password = pw;
		this.name = nm;
	}

	public User() {
		this.username = "";
		this.password = "";
		this.name = "";
	}

	public void setUsername(String uName) {
		this.username = uName;
	}

	public void setPassword(String pw) {
		this.password = pw;
	}

	public void setName(String nm) {
		this.name = nm;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public String getName() {
		return name;
	}

	public void printUserInfo() {
		System.out.println("username: " + this.username);
		System.out.println("password: " + this.password);
		System.out.println("name: " + this.name);
	}
}
