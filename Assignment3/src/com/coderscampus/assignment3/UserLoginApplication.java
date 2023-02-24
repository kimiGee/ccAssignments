package com.coderscampus.assignment3;

import java.util.Scanner;

public class UserLoginApplication {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		UserService service = new UserService();
		int attempts = 0;
		boolean loggedIn = false;

		while ((attempts < 5) && (loggedIn == false)) {
			System.out.println("Enter your username: ");
			String username = scanner.nextLine();
			System.out.println("Enter your password: ");
			String password = scanner.nextLine();

			if (service.validateCredentials(username, password) == false) {
				System.out.println("Credentials not correct.  Please try again.");
				attempts++;
			} else {
				loggedIn = true;
			}
		}

		scanner.close();

	}

}
