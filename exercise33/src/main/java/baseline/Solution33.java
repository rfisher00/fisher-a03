/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Ryan Fisher
 */

package baseline;


import java.util.Scanner;
import java.util.Random;

/* pseudocode:
    implement input necessities
    prompt user for a question
    use function eightball with random int
    to return a random element from array of responses
    and print to output
 */

public class Solution33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("What's your question?%n> ");
        sc.nextLine();
        System.out.printf("%s%n", eightBall());
    }
    public static String eightBall() {
        Random rand = new Random();
        String[] eightball = {"Yes", "No", "Ask again later"};
        int random = rand.nextInt(3);
        return eightball[random];
    }
}
