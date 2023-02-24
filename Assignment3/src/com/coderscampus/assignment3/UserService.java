package com.coderscampus.assignment3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class UserService {

	User[] userArray = new User[4];
	List<User> tempList = new ArrayList<>(); // temporary array list to store User objects

	// User service constructor builds the array of User objects
	public UserService() {

		BufferedReader fileReader = null;

		try {
			fileReader = new BufferedReader(new FileReader("data.txt"));
			String line = "";

			while (line != null) {
				line = fileReader.readLine();
				if (line == null) {
					userArray = tempList.toArray(userArray); // convert array list to array when end of file is reached
				} else {
					buildUserList(line);
				}
			}

		} catch (FileNotFoundException e) {
			System.out.println("File was not found...");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("An I/O exception has occured...");
			e.printStackTrace();
		} finally {
			try {
				fileReader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	// extract data from text file
	public void buildUserList(String fileLine) {
		String[] userInfo = null;
		String[] fileInfoArray = new String[1];
		fileInfoArray[0] = fileLine;

		for (String line : fileInfoArray) {
			userInfo = line.split(",");
		}

		// create a user from file data and add to the temporary array list
		tempList.add(createUser(userInfo));
	}

	// create user
	public User createUser(String[] userInfo) {
		User user = new User(userInfo[0], userInfo[1], userInfo[2]);
		return user;
	}

	// compare information provided by the user to text file contents, provide
	// greeting if info is valid,
	// return true to calling function
	public boolean validateCredentials(String u, String p) {

		for (User user : this.userArray) {
			if ((u.equalsIgnoreCase(user.getUsername()))) {
				if ((p.equals(user.getPassword()))) {
					System.out.println("Hi " + user.getName() + "!");
					return true;
				}
			}
		}
		return false;
	}

}
