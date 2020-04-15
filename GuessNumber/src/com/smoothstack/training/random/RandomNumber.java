package com.smoothstack.training.random;

import java.util.Random;
import java.util.Scanner;

public class RandomNumber {
	public static void main(String[] args) {
		Random rand = new Random();
		int numberToGuess = rand.nextInt(100);
		int numberOfTries = 5;
		try (Scanner input = new Scanner(System.in)) {
			int guess;
			boolean win = false;
			
			while (win == false) {
				System.out.println("Guess a number (may be between 1-100)");
				guess = input.nextInt();
				numberOfTries--;
				
				
				
				if ( numberToGuess-10 < guess && guess < numberToGuess+10 ) {
					System.out.println("your guess is "+guess+" the random number is "+numberToGuess);
					win = true;
				}
				else if (guess != numberToGuess && numberOfTries>0) {
					System.out.println(guess+" is incorrect you have "+numberOfTries+" tries left.");
					
				}
				else if (guess != numberToGuess && numberOfTries == 0) {
					System.out.println(guess+" is incorrect you have "+numberOfTries+" tries left. The Number is "+numberToGuess+" Game Over");
					
				}
			}
		}
		
	}
}



//
//>User is asked a question to guess a number (may be between 1-100) 
//if the number he guesses is within 10 numbers plus or minus of the number the java program has, then exit out and give the answer
//if the number he guesses is not within 10 numbers, ask the user to keep trying and give him more chances.
//if he is not able to guess within 5 chances, exit and display 'Sorry’ with the number.
//Example: Random # generated is 63
//User’s guess must be between 53 to 73.