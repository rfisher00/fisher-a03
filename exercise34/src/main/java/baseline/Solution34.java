/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Ryan Fisher
 */

package baseline;

import java.util.Scanner;
import java.util.Random;

/* pseudocode:
    in function employeeList:
    initialize array employees with 5 names
    output the # of employees/elements
    prompt for who to remove
    iterate thru array until name matches employee[i]
    save i as index
    create a new array of one less length
    iterate through array again, but continue if index == i
    and have remaining employees put in the new array
    return the new array to main
    in main: print length of new array and its elements
 */

public class Solution34 {
    public static void main(String[] args) {
        String[] employees = employeeList();
        System.out.printf("There are %d employees:%n", employees.length);
        for(int i = 0; i <  employees.length; i++) {
            System.out.printf("%s%n", employees[i]);
        }
    }
    public static String[] employeeList() {
        Scanner sc = new Scanner(System.in);

        String[] employees = {"John Smith","Jackie Jackson","Chris Jones","Amanda Cullen","Jeremy Goodwin"};
        int length = employees.length;
        int index = 0;
        System.out.printf("There are %d employees: ", length);
        System.out.println("Enter an employee name to remove: ");
        String name = sc.nextLine();
        String[] newEmployees = new String[length-1];

        for(int i = 0; i < employees.length; i++) {
            if (employees[i].equals(name))
                index = i;
        }
        for(int i = 0, j = 0; i < employees.length; i++) {
            if(i == index)
                continue;
            newEmployees[j++] = employees[i];
        }
        return newEmployees;
    }
}


