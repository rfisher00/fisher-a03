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

    }

    public static String generatePW(int length, int numSpecChar, int numNumbers) {

    }

    public static String shufflePW(String password) {

    }
}