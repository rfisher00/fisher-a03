/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Ryan Fisher
 */

package baseline;

import java.util.Scanner;
import java.util.Random;

/* pseudocode:
    in function numberGuesser:
        implement input necessities
        create a new Random instance
        have a boolean true for runtime
        while(running == true)
            prompt for difficulty, save as int
            initialize the random number based on the difficulty
            prompt for a guess and save as int
            make a guesscounter variable set to 1
            initialize a boolean as false until guess = random
            while(!correct)
                if the random = guess
                    Congrats!
                    correct = true
                else
                    if guess < random
                        too high
                        prompt for next guess
                        guess counter ++
                    if guess < random
                        too low
                        prompt for next guess
                        guess counter ++
            prompt user to play again, save input as string
            if input == n or N
                running = false;
 */

public class Solution32 {
    public static void main(String[] args) {

        System.out.println("Let's play Guess the Number!");
        numberGuesser();
    }

    public static void numberGuesser() {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        boolean running = true;
        while(running) {
            System.out.printf("%nEnter the difficulty level (1, 2, or 3): ");
            int difficulty = sc.nextInt();
            int random = 7;
            if(difficulty == 1)
                random = rand.nextInt(11);
            if(difficulty == 2)
                random = rand.nextInt(101);
            if(difficulty == 3)
                random = rand.nextInt(1001);
            System.out.print("I have my number. What's your guess? ");
            int guess = sc.nextInt();
            int guesses = 1;
            boolean correct = false;
            while(!correct) {
                if(guess == random) {
                    System.out.printf("You got it in %d guesses!%n", guesses);
                    correct = true;
                }
                else {
                    if(guess < random) {
                        System.out.printf("Too low. Guess again: ");
                        guesses++;
                        guess = sc.nextInt();
                    }
                    if(guess > random) {
                        System.out.printf("Too high. Guess again: ");
                        guesses++;
                        guess = sc.nextInt();
                    }
                }
            }

            System.out.print("Do you wish to play again (Y/N)? ");
            String response = sc.next();
            if(response.equals("n") || response.equals("N"))
                running = false;
        }
    }
}
