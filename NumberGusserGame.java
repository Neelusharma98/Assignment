package com.techlab.numbergusser;

import java.util.Random;
import java.util.Scanner;

public class NumberGusserGame {

	public static void main(String[] args) {
		playGame();

	}
	 public static void playGame() {
	        Scanner scanner = new Scanner(System.in);
	        Random random = new Random();
	        

	        int lowerBound = 1;
	        int upperBound = 100;
	        int generatedNumber = random.nextInt(upperBound) + lowerBound;
	        System.out.println(generatedNumber);
	        int guess;
	        int tries = 0;

	        System.out.println("*****Welcome to the Number Guesser Game*******");
	        System.out.println("here generated a random number between 1 and 100.");

	        do {
	            System.out.print("Make a guess: ");
	            guess = scanner.nextInt();
	            tries++;

	            if (guess < generatedNumber) {
	                System.out.println("Sorry, Too Low number you have gussed.");
	            } else if (guess > generatedNumber) {
	                System.out.println("Sorry, Too High number you have gussed.");
	            } else {
	                System.out.println("******Congratulations****\n You guessed the number " + generatedNumber + " correctly.");
	                System.out.println("You made " + tries + " " + (tries == 1 ? "try" : "tries") + ".");
	                break;
	            }
	        } while (true);

	        System.out.println("Do you want to play again? (Y/N)");
	        String playAgain = scanner.next().trim().toUpperCase();

	        if (playAgain.equals("Y")) {
	            playGame();
	        } else {
	            System.out.println("Thank you for playing");
	        }
	    }

}
