/** Program: English To Pig-Latin
 * Summary: Converts English to Pig-Latin
 * File: PigLatin.java
 * Author: Timothy James
 * Date: 10/21/17
 */ 
import java.util.*; // imports java utility package

public class PigLatin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // creates an input reader
        
        // Gives the user instructions on the program
        System.out.println("The English to Pig-Latin translator!");
        System.out.println("Directions: Write 5 words seperated by "
                + "spaces and then press enter to see the Pig-Latin translation of "
                + "each word.");
        
        System.out.println(); // creates a blank space
        
        // Prompts the user to input a string
        System.out.print("Enter 5 words: ");
        String english1 = input.next(); // reads and stores the users 1st input
        String english2 = input.next(); // reads and stores the users 2nd input
        String english3 = input.next(); // reads and stores the users 3rd input
        String english4 = input.next(); // reads and stores the users 4th input
        String english5 = input.next(); // reads and stores the users 5th input
        
        english1 = english1.toUpperCase(); // converts user input to CAPS
        english2 = english2.toUpperCase(); // converts user input to CAPS
        english3 = english3.toUpperCase(); // converts user input to CAPS
        english4 = english4.toUpperCase(); // converts user input to CAPS
        english5 = english5.toUpperCase(); // converts user input to CAPS
        
        System.out.println();// blank line
        
        // Translates first word by checking for vowels and splitting the word where the first vowel is found
        if (english1.indexOf('A') == 0 || english1.indexOf('E') == 0 
                || english1.indexOf('I') == 0 || english1.indexOf('O') == 0 
                || english1.indexOf('U') == 0) {   
            System.out.printf(english1 + "\t" + english1 + "AY"); // if word starts with vowel program will just add AY to the end
        }
        else if (english1.charAt(1) != 'A' && english1.charAt(1) != 'E' // checks if there is a consonant in the second letter spot
                && english1.charAt(1) != 'I' && english1.charAt(1) != 'O' 
                && english1.charAt(1) != 'U' && english1.charAt(1) != 'Y') 
            if (english1.charAt(2) != 'A' && english1.charAt(2) != 'E' 
                && english1.charAt(2) != 'I' && english1.charAt(2) != 'O' 
                && english1.charAt(2) != 'U' && english1.charAt(2) != 'Y') {
                System.out.printf(english1 + "\t" + english1.substring(3) + english1.substring(0, 3) 
                    + "AY"); /** if consonant is in the third letter spot the program will split the word and add the beginning to the
                     * end as well as adding AY after that
                     */               
            }
            else // prints the else if outcome    
            System.out.printf(english1 + "\t" + english1.substring(2) + english1.substring(0, 2) 
                    + "AY");
        
        else // if only the first letter is a consonant
            System.out.printf(english1 + "\t" + english1.substring(1) + english1.charAt(0) + "AY");
        
        System.out.println(); // blank line
        
        // Translates second word
        if (english2.indexOf('A') == 0 || english2.indexOf('E') == 0 
                || english2.indexOf('I') == 0 || english2.indexOf('O') == 0 
                || english2.indexOf('U') == 0) {   
            System.out.printf(english2 + "\t" + english2 + "AY");
        }
        else if (english2.charAt(1) != 'A' && english2.charAt(1) != 'E' 
                && english2.charAt(1) != 'I' && english2.charAt(1) != 'O' 
                && english2.charAt(1) != 'U' && english2.charAt(1) != 'Y') 
            if (english2.charAt(2) != 'A' && english2.charAt(2) != 'E' 
                && english2.charAt(2) != 'I' && english2.charAt(2) != 'O' 
                && english2.charAt(2) != 'U' && english2.charAt(2) != 'Y') {
                System.out.printf(english2 + "\t" + english2.substring(3) + english2.substring(0, 3) 
                    + "AY");
            }
            else    
            System.out.printf(english2 + "\t" + english2.substring(2) + english2.substring(0, 2) 
                    + "AY");
        
        else 
            System.out.printf(english2 + "\t" + english2.substring(1) + english2.charAt(0) + "AY");
        
        System.out.println(); // blank line
        
        // Translates third word
        if (english3.indexOf('A') == 0 || english3.indexOf('E') == 0 
                || english3.indexOf('I') == 0 || english3.indexOf('O') == 0 
                || english3.indexOf('U') == 0) {   
            System.out.printf(english3 + "\t" + english3 + "AY"); // if word starts with vowel program will just add AY to the end
        }
        else if (english3.charAt(1) != 'A' && english3.charAt(1) != 'E' // checks if there is a consonant in the second letter spot
                && english3.charAt(1) != 'I' && english3.charAt(1) != 'O' 
                && english3.charAt(1) != 'U' && english3.charAt(1) != 'Y') 
            if (english3.charAt(2) != 'A' && english3.charAt(2) != 'E' 
                && english3.charAt(2) != 'I' && english3.charAt(2) != 'O' 
                && english3.charAt(2) != 'U' && english3.charAt(2) != 'Y') {
                System.out.printf(english3 + "\t" + english3.substring(3) + english3.substring(0, 3) 
                    + "AY"); /** if consonant is in the third letter spot the program will split the word and add the beginning to the
                     * end as well as adding AY after that
                     */               
            }
            else // prints the else if outcome    
            System.out.printf(english3 + "\t" + english3.substring(2) + english3.substring(0, 2) 
                    + "AY");
        
        else // if only the first letter is a consonant
            System.out.printf(english3 + "\t" + english3.substring(1) + english3.charAt(0) + "AY");
        
        System.out.println(); // blank line
        
        // Translates fourth word
        if (english4.indexOf('A') == 0 || english4.indexOf('E') == 0 
                || english4.indexOf('I') == 0 || english4.indexOf('O') == 0 
                || english4.indexOf('U') == 0) {   
            System.out.printf(english4 + "\t" + english4 + "AY"); // if word starts with vowel program will just add AY to the end
        }
        else if (english4.charAt(1) != 'A' && english4.charAt(1) != 'E' // checks if there is a consonant in the second letter spot
                && english4.charAt(1) != 'I' && english4.charAt(1) != 'O' 
                && english4.charAt(1) != 'U' && english4.charAt(1) != 'Y') 
            if (english4.charAt(2) != 'A' && english4.charAt(2) != 'E' 
                && english4.charAt(2) != 'I' && english4.charAt(2) != 'O' 
                && english4.charAt(2) != 'U' && english4.charAt(2) != 'Y') {
                System.out.printf(english4 + "\t" + english4.substring(3) + english4.substring(0, 3) 
                    + "AY"); /** if consonant is in the third letter spot the program will split the word and add the beginning to the
                     * end as well as adding AY after that
                     */               
            }
            else // prints the else if outcome    
            System.out.printf(english4 + "\t" + english4.substring(2) + english4.substring(0, 2) 
                    + "AY");
        
        else // if only the first letter is a consonant
            System.out.printf(english4 + "\t" + english4.substring(1) + english4.charAt(0) + "AY");
        
        System.out.println(); // blank line
        
        // Translates fifth word
        if (english5.indexOf('A') == 0 || english5.indexOf('E') == 0 
                || english5.indexOf('I') == 0 || english5.indexOf('O') == 0 
                || english5.indexOf('U') == 0) {   
            System.out.printf(english5 + "\t" + english5 + "AY"); // if word starts with vowel program will just add AY to the end
        }
        else if (english5.charAt(1) != 'A' && english5.charAt(1) != 'E' // checks if there is a consonant in the second letter spot
                && english5.charAt(1) != 'I' && english5.charAt(1) != 'O' 
                && english5.charAt(1) != 'U' && english5.charAt(1) != 'Y') 
            if (english5.charAt(2) != 'A' && english5.charAt(2) != 'E' 
                && english5.charAt(2) != 'I' && english5.charAt(2) != 'O' 
                && english5.charAt(2) != 'U' && english5.charAt(2) != 'Y') {
                System.out.printf(english5 + "\t" + english5.substring(3) + english5.substring(0, 3) 
                    + "AY"); /** if consonant is in the third letter spot the program will split the word and add the beginning to the
                     * end as well as adding AY after that
                     */               
            }
            else // prints the else if outcome    
            System.out.printf(english5 + "\t" + english5.substring(2) + english5.substring(0, 2) 
                    + "AY");
        
        else // if only the first letter is a consonant
            System.out.printf(english5 + "\t" + english5.substring(1) + english5.charAt(0) + "AY");
        
        System.out.println(); // blank line
    }
}
