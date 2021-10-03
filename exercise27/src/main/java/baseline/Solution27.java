/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Ryan Fisher
 */

package baseline;
import java.util.Scanner;

/* pseudocode:

    implement input necessities
    prompt for first, last, zip and ID
    use function validateInput to call the functions
    each function returns a bool based on validity
        emptyFirst() & emptyLast(): checks if the field has been filled
        checkFirst() & checkLast(): checks if input string length >= 2
        checkId(): checks if length = 7, if first 2 characters are letters, the 3rd is a hyphen, and remaining 4 are #s
        checkZip(): checks if it is numeric and a length of 5

 */

public class Solution27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first name: ");
        String firstName = sc.nextLine();

        System.out.print("Enter the last name: ");
        String lastName = sc.nextLine();

        System.out.print("Enter the ZIP code: ");
        String zipCode = sc.nextLine();

        System.out.print("Enter the employee ID: ");
        String employeeID = sc.nextLine();

        validateInput(firstName, lastName, employeeID, zipCode);
    }
    public static boolean emptyFirst(String first) {
        boolean filled = true;
        if(first.length() == 0) {
            filled = false;
        }
        return filled;
    }
    public static boolean emptyLast(String last) {
        boolean filled = true;
        if(last.length() == 0) {
            filled = false;
        }
        return filled;
    }
    public static boolean checkFirst(String first) {
        boolean longEnough = true;
        if(first.length() < 2) {
            longEnough = false;
        }
        return longEnough;
    }

    public static boolean checkLast(String last) {
        boolean longEnough = true;
        if(last.length() < 2) {
            longEnough = false;
        }
        return longEnough;
    }

    public static boolean checkId(String id) {
        boolean correctFormat = true;
        if(id.length() != 7) {
            correctFormat = false;
        }
        for(int i = 0; i < 2; i++) {
            if(!Character.isLetter(id.toCharArray()[i]))
                correctFormat = false;
            }
        if(id.toCharArray()[2] != '-')
            correctFormat = false;
        for(int i = 3; i < 7; i++) {
            if(!Character.isDigit(id.toCharArray()[i]))
                correctFormat = false;
        }
        return correctFormat;
    }

    public static boolean checkZip(String zip) {
        if(zip.length() != 5) {
            return false;
        }
        try {
            Double.parseDouble(zip);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void validateInput(String first, String last, String id, String zip) {

        if(emptyFirst(first) && emptyLast(last) && checkFirst(first) && checkLast(last) && checkZip(zip) && checkId(id))
            System.out.printf("There were no errors found.%n");

        if(!checkFirst(first))
            System.out.printf("The first name must be at least 2 characters long.%n");
        if(!checkLast(last))
            System.out.printf("The last name must be at least 2 characters long.%n");
        if(!emptyFirst(first))
            System.out.printf("The first name must be filled in.%n");
        if(!emptyLast(last))
            System.out.printf("The last name must be filled in.%n");

        if(!checkId(id))
            System.out.printf("The employee ID must be in the format of AA-1234.%n");
        if(!checkZip(zip))
            System.out.printf("The zipcode must be a 5 digit number.%n");
    }
}
