/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Ryan Fisher
 */

package baseline;
import java.util.Scanner;

/* pseudocode:

    implement input necessities
    prompt user for balance, APR, and their monthly payment
    use class PaymentCalculator's constructor with the input values
    output the number of months by using PaymentCalculator's calculateMonthsUntilPaidOff()
 */

public class Solution26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("What is your balance? ");
        double balance = sc.nextDouble();
        System.out.print("What is the % APR on the card? ");
        double apr = sc.nextDouble();
        System.out.print("What is the monthly payment you can make? ");
        double monthly = sc.nextDouble();

        PaymentCalculator paymentCalculator = new PaymentCalculator(balance, apr, monthly);

        System.out.printf("It will take you %.0f months to pay off this card.%n", Math.ceil(PaymentCalculator.calculateMonthsUntilPaidOff()));
    }
}