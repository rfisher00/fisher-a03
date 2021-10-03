/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Ryan Fisher
 */

package baseline;
import java.util.Scanner;

/* pseudocode:
    implement input necessities
    prompt for the rate of return & store as string
    use function validInput to check if isNumeric and not 0
    use validInput boolean to output
        if notNumeric or rate = 0
            not valid input
        else
            function investment() parses rate to double and returns 72/rate
 */

public class Solution29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("What is the rate of return? ");
        String rate = sc.nextLine();

        if(validInput(rate)) {
            System.out.printf("It will take %.1f years to double your initial investment.%n", investment(rate));
        }
        else
            System.out.printf("Sorry. That's not a valid input.%n");
    }

    public static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static boolean validInput(String rate) {
        boolean correct = true;
        if (!isNumeric(rate) || Double.parseDouble(rate) == 0)
            correct = false;
        return correct;
    }

    public static double investment(String rate) {
        double rateNum = Double.parseDouble(rate);
        return 72/rateNum;
    }
}
