package com.smoothstack.training.daytwo;


import java.util.Scanner;

public class CommandLine {
	public static void main(String[] args) {
		int numberLeft = 3, total = 0;
		
		try (Scanner input = new Scanner(System.in)) {
			int number;
			
			boolean done = false;
			
			while (done == false) {
				System.out.println("Add a number");
				number = input.nextInt();
				total = total+number;
				numberLeft--;
				
				
				
				if ( numberLeft == 0 ) {
					System.out.println("input is "+number+" the total is now "+total);
					done = true;
				}
				
			}
		}
		
	}

}
