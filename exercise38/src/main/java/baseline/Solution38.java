/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Ryan Fisher
 */

package baseline;

import java.util.Scanner;
import java.util.Arrays;


/* pseudocode:
     implement input necessities
    prompt for numbers separated by spaces
    save as a string and pass it into filterEvenNumbers()

    in function filterEvenNumbers()
        create a new empty string arr
        check if passed in field is empty
        if not:
            have the empty arr initialized as the passed in string.split(" ")
            iterate through the array
            parse each character into an int and
            if int number % 2 = 0:
                isEven, print
 */

public class Solution38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a list of numbers, separated by spaces: ");
        String numbers = sc.nextLine();
        filterEvenNumbers(numbers);
    }

    public static void filterEvenNumbers(String numbers) {
        String[] numberArr = new String[0];
        if (numbers.length() > 0)
            numberArr = numbers.split(" ");
        System.out.print("The even numbers are ");
        for(int i = 0; i < numberArr.length; i++) {
            int number = Integer.parseInt(numberArr[i]);
            if(number % 2 == 0)
                System.out.printf("%d ", number);
        }
    }
}