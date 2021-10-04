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

    }

    public static void numberGuesser() {

        }
    }
}
