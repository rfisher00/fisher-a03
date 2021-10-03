/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Ryan Fisher
 */

package baseline;
import java.util.Scanner;

/* pseudocode:
    implement input necessities
    in function generateMultiTable():
        for loop iterating i by 1 from 0 to 12
            another for loop iterating j from 0 to 12
                print(i * j) with whitespace (no tabs)
            print a new line for next row
 */

public class Solution30 {
    public static void main(String[] args) {
        generateMultiTable();
    }
    public static void generateMultiTable() {
        for(int i = 1; i < 13; i++) {
            for(int j = 1; j < 13; j++) {
                System.out.printf("%-7d", i*j);
            }
            System.out.println("\n");
        }
    }
}
