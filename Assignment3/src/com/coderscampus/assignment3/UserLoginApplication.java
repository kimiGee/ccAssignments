package com.coderscampus.assignment3;

import java.util.Scanner;

public class UserLoginApplication {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your username: ");
		
		String username = scanner.nextLine();		
		
		System.out.println("Enter your password: ");
		
		String password = scanner.nextLine();
		
		System.out.println(username + " " + password);
		
		scanner.close();

	}

}
