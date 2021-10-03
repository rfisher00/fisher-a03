/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Ryan Fisher
 */

package baseline;
import java.util.Scanner;
import java.util.Arrays;

/* pseudocode:
    implement input necessities
    prompt for the input of 2 strings
    in function isAnagram;
    remove all whitespace from strings
    compare lengths; if equal, continue
    have each string toCharArray and toLowerCase
    sort each string array and see if equals() is true
    use boolean to output if strings are anagrams
 */

public class Solution24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two strings and I'll tell you if they are anagrams:%nEnter the first string: ");
        String str1 = sc.nextLine();
        System.out.print("Enter the second string: ");
        String str2 = sc.nextLine();

        System.out.printf(isAnagram(str1, str2) ? "\"%s\" and \"%s\" are anagrams.\n" : "\"%s\" and \"%s\" are not anagrams.%n", str1, str2);
    }

    public static boolean isAnagram(String str1, String str2) {
        boolean status;
        String s1 = str1.replaceAll("\\s", "");  // remove all whitespace
        String s2 = str2.replaceAll("\\s", "");

        if(s1.length() != s2.length()) {
            status = false;
        }
        else {
            char[] arrayS1 = s1.toLowerCase().toCharArray();
            char[] arrayS2 = s2.toLowerCase().toCharArray();
            Arrays.sort(arrayS1);
            Arrays.sort(arrayS2);
            status = Arrays.equals(arrayS1, arrayS2);
        }
        return status;
    }
}
