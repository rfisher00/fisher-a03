/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Ryan Fisher
 */

package baseline;

import java.util.Scanner;
import java.util.Random;
import java.util.List;
import java.util.Arrays;
import java.util.Collections;

/* pseudocode:
    implement input necessities
    prompt for length, num of symbols and num of numbers
    store each as an int
    in function generatePW():
        create a new random instance and new stringbuilder instance
        create a string of letters, another of digits, and another of symbols
        iterate through each as much as numSymbols and numNumbers allows
        have a random element be appended to an empty string every iteration
        iterate thru and randomly append n = length - (numSymbols + numNumbers) letters
        stringbuilt password toString, needs to be shuffled with shufflePW();
        returns the shuffled password to main

    in function shufflePW():
        split password string into a list
        use Collections.shuffle to rearrange elements
        iterate through the list and append each to new Stringbuilder
        return the stringbuild shuffled PW
 */

public class Solution37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("What's the minimum length? ");
        int length = sc.nextInt();
        System.out.print("How many special characters? ");
        int numSpecChar = sc.nextInt();
        System.out.print("How many numbers? ");
        int numNumbers = sc.nextInt();

        String password = generatePW(length, numSpecChar, numNumbers);

        System.out.printf("Your password is %s", password);
    }

    public static String generatePW(int length, int numSpecChar, int numNumbers) {
        Random rand = new Random();
        StringBuilder sb = new StringBuilder();

        String password = null;

        final String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        final String numbers = "0987654321";
        final String symbols = "!@#$%^&*()_-=+[{]}\"|;:'/?.>,<~";

        for (int i = 0; i < numSpecChar; i++) {
            int randomIndex = rand.nextInt(symbols.length());
            sb.append(symbols.charAt(randomIndex));
        }

        for (int i = 0; i < numNumbers; i++) {
            int randomIndex = rand.nextInt(numbers.length());
            sb.append(numbers.charAt(randomIndex));
        }

        for (int i = 0; i < (length - (numNumbers + numSpecChar)); i++) {
            int randomIndex = rand.nextInt(letters.length());
            sb.append(letters.charAt(randomIndex));
        }

        password = sb.toString();
        return shufflePW(password);
    }

    public static String shufflePW(String password) {
        List<String> passwordList = Arrays.asList(password.split(""));
        Collections.shuffle(passwordList);
        StringBuilder sb = new StringBuilder();
        for (String letter : passwordList) {
            sb.append(letter);
        }
        return sb.toString();
    }
}