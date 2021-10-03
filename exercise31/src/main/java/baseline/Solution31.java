/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Ryan Fisher
 */

package baseline;

import java.util.Scanner;

/* pseudocode:
    implement input necessities
    prompt user for age and heart rate
    use function makeTable
    iterating 9 times with i incremented by 5 from 55
    makeTable uses calctargetHR function to output the correct bpm per intensity i
 */

public class Solution31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = 0;
        int restingHR = 0;
        boolean input = false;
        while (!input) {
            try {
                System.out.print("How old are you? ");
                age = Integer.valueOf(sc.nextLine());
                if(age <= 0) {
                    input = false;
                    System.out.println("Not a valid number.");
                }
                else
                    input = true;
            } catch (NumberFormatException e) {
                System.out.println("Not a valid number.");
            }
        }

        input = false;
        while (!input) {
            try {
                System.out.print("What is your resting heart rate? (pulses per minute) ");
                restingHR = Integer.valueOf(sc.nextLine());
                if(age <= 0) {
                    input = false;
                    System.out.println("Not a valid number.");
                }
                else
                    input = true;
            } catch (NumberFormatException e) {
                System.out.println("Not a valid number.");
            }
        }
        makeTable(age, restingHR);
    }

    public static double calcTargetHR(int age, int restingHR, int intensity) {
        return (((220 - age) - restingHR) * ((double) intensity/100)) + restingHR;
    }

    public static void makeTable(int age, int restingHR) {
        System.out.printf("%nResting Pulse: %d \t\t\tAge: %d%nIntensity    | Rate%n-------------|--------%n%n", restingHR, age);
        for (int i = 55; i < 100; i = i + 5) {

            System.out.printf("%d           | %d bpm%n", i, Math.round(calcTargetHR(age, restingHR, i)));
        }
    }
}

