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
        Scanner sc = new Scanner(System.in);
        String pw;
        System.out.print("Enter a password: ");
        pw = sc.nextLine();

        String pwStrength = switch (passwordValidator(pw)) {
            case 1 -> "very weak password";
            case 2 -> "weak password";
            case 3 -> "strong password";
            case 4 -> "very strong password";
            default -> "password of unknown strength";
        };
        System.out.printf("The password '%s' is a %s.%n", pw, pwStrength);
    }

    public static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static int passwordValidator(String pw) {
        int status = 0;
        boolean hasDigit = false;
        boolean hasSymbol = false;
        boolean hasLetter = false;
        if (pw.length() < 8) {
            if (isNumeric(pw))
                return status = 1;
            if (pw.matches("[a-zA-Z]+"))
                return status = 2;
        }
        for (char c : pw.toCharArray()) {
            if(Character.isLetter(c))
                hasLetter = true;
            if(Character.isDigit(c))
                hasDigit = true;
            if(!pw.matches("[a-zA-Z0-9 ]*"))
                hasSymbol = true;
        }
        if(hasLetter && hasDigit && pw.length() >= 8)
            status = 3;
        if(hasLetter && hasSymbol && pw.length() >= 8)
            status = 4;

        return status;
    }
}

