/*
*  UCF COP3330 Fall 2021 Assignment 3 Solutions
*  Copyright 2021 Ryan Fisher
*/

package baseline;
import java.util.Scanner;

/* pseudocode:
    implement input necessities
    in function summer,  use for loop to obtain multiple integers
    add each integer to sum = 0 before next iteration
    return sum and print in main
 */

public class Solution28 {
    public static void main(String[] args) {
        System.out.printf("The total is %d.%n", summer());
    }
    public static int summer() {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        for(int i= 0; i < 5; i++) {
            System.out.print("Enter a number: ");
            sum += sc.nextInt();
        }
        return sum;
    }
}