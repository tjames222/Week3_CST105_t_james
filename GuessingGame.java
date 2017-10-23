/**
 * Program: Guessing Games 
 * File: GuessingGame.java 
 * Summary: User has to guess the random number that the computer is thinking of 
 * Author: Timothy James
 * Date: 10/22/17
 */
import java.util.Scanner; // used for reading in user input
import java.util.Random; // used to generate random numbers

public class GuessingGame {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // instantiates the Scanner object
        Random random = new Random(); // instantiates the Random object

        System.out.println("Play the guessing game!");

        System.out.println(); // blank line

        // Createing variable to be used in program
        int randomNumber = random.nextInt(10000) + 1; // generates random number between 0 and 10,000
        int guess1 = 0;
        int numberOfTries = 0;
        int max = 10000;
        int min = 1;
        int success = 0;

        // Tests the guess against the random number
        while (success == 0) {

            // Prompt the user to enter guess
            System.out.print("Enter a number between " + min + " and " + max + ": ");
            guess1 = input.nextInt(); // reads and stores users guess
            numberOfTries++;

            if (guess1 < min || guess1 > max) { // tests the users input for validity
                System.out.println("Invalid input");
            } else if (guess1 == randomNumber) {
                success++;
                System.out.println("Exact match! The number is " + randomNumber
                        + ". It took you " + numberOfTries + " tries to get it.");
            } else if (guess1 < randomNumber) {
                System.out.println("Guess Higher");
                min = guess1 + 1;
            } else if (guess1 > randomNumber) {
                System.out.println("Guess Lower");
                max = guess1 - 1;
            }
        }
        System.out.println();
        System.out.print("Do you want to play again? (y/n): ");
        String restart = input.next();
        if (restart.equalsIgnoreCase("y")) {
            success = 0;
        } else {
            success = 1;
        }
    }
}

