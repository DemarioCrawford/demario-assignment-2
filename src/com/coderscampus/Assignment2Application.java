package com.coderscampus;

import java.util.Random;
import java.util.Scanner;

public class Assignment2Application {

	public static void main(String[] args) {
//		Instantiate the scanner and random objects
		Random random = new Random();
//		Generate random number and number of attempts allowed
		int randomNumber = random.nextInt(101); 
		int guesses = 5;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Welcome to the guessing game!");
		System.out.println("You have 5 tries to guess the correct number between 1 and 100.");
		
		while (guesses > 0) {
			System.out.println("Attempts left: " + guesses );
			System.out.println("Pick a number between 1 and 100");
			int guess = scanner.nextInt(); // scanner will read this 
			
			if (guess < 1 || guess > 100) {
				System.out.println("Your guess is not between 1 and 100");
				continue; //Don't take a way a try
			}
			
			if (guess == randomNumber) {
				System.out.println("You win! You chose the correct number.");
				return; //exit game
			}
			if (guess > randomNumber ) {
				System.out.println("Pick a lower number.");
				guesses--;
			}
			if (guess < randomNumber) {
				System.out.println("Pick a higher number.");
				guesses--;
			}
		}
		
		System.out.println("You have used up all of your attempts. You lose!");
		System.out.println("The number to guess was: " + randomNumber);
		
		
	}
}
