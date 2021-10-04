/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Ryan Fisher
 */


package baseline;

public class PaymentCalculator {
    static double balance;
    static double apr;
    static double monthly;

    PaymentCalculator(double balance, double apr, double monthly) {
        this.balance = balance;
        this.apr = apr;
        this.monthly = monthly;
    }

    public static double calculateMonthsUntilPaidOff() {
        // -(1/30) * log(1 + b/p * (1 - (1 + i)^30)) / log(1 + i)
        apr = apr/36500; //a percentage divided by 365 for daily

        return (-1.0/30.0) * Math.log(1.0 + balance/monthly * (1.0 - Math.pow(1.0+apr, 30.0))) / Math.log(1.0 + apr);
    }
}
