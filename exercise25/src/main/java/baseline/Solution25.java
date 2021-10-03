/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Ryan Fisher
 */

package baseline;
import java.util.Scanner;

/* pseudocode:
    implement input necessities
    prompt for the input of a password
    in function passwordValidator:
        if pw has only numbers and <8 char
        check this by function isNumeric: try/ catch NumberFormatException
            return 1: very weak
        if pw has only letters and <8 char
        check this by regex matches([a-zA-Z]+)
            return 2: weak

        for passwords >= 8 char
        if pw has letters + numbers and >= 8 char
            return 3: strong
        if pw has letters, number + symbols and >= 8 char
            return 4: very strong
        have a boolean variable for each case of the password containing
        a number, letter and a symbol
        depending on which bools are true, return 3 or 4
        else
            return 0: unknown strength
    in main:
        use a case switch to state the strength of the password in the output
 */

public class Solution25 {
    public static void main(String[] args) {

    }

    public static boolean isNumeric(String str) {

    }

    public static int passwordValidator(String pw) {

    }
}

