package com.coderscampus.assignment2;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNum {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		Integer theRandomNumber = random.nextInt(100) + 1;	
		
		System.out.println("Pick a number between 1 and 100: ");	
		gameStart(theRandomNumber, scanner);		
		
	}
	
	public static int gameStart(Integer answer, Scanner scanner) {
		
		int turns =  5;
		Integer guess = chooseNum(scanner);
		
		while(turns > 1) {
			
			if(guess == answer) {
				turns = 0;
				System.out.println("You win! The answer was " + answer);
				return 0;
			}else if((guess < 1)||(guess > 100)){
				System.out.println("That guess is out of bounds, try again: ");
				guess = chooseNum(scanner);
				turns--;
				}else if(guess < answer){
					System.out.println("Please pick a higher number...");
					guess = chooseNum(scanner);
					turns--;
				}else if(guess > answer){
					System.out.println("Please pick a lower number...");
					guess = chooseNum(scanner);
					turns--;
				}
		}	
		
		System.out.println("The answer was " + answer + ". Better luck next time!");
		return 0;	
		
	}
	
	public static Integer chooseNum(Scanner scanner) {
		
		String userInput = scanner.nextLine();
		Integer userGuess = Integer.parseInt(userInput);
		return userGuess;
		
	}	


}


