/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Ryan Fisher
 */

package baseline;

import java.util.*;

/* pseudocode:
        in function addName()
            implement input necessities
            create an empty array of strings
            use an ArrayList for empty nameList
            take input in while loop until input == ""
            have each name add to the Array list
            convert the ArrayList to an array and return to main
        in main:
            create a new random instance
            have a string array initialized to addName function
            create a random integer less than the length of the nameArray
            print out the corresponding element
 */

public class Solution35 {
    public static void main(String[] args) {
        Random rand = new Random();
        String[] nameList = addName();
        int index = rand.nextInt(nameList.length);
        System.out.printf("The winner is %s%n", nameList[index]);
    }
    public static String[] addName() {
        Scanner sc = new Scanner(System.in);
        String[] nameList = new String[0];

        List<String> names = new ArrayList<String>(Arrays.asList(nameList));

        String name = "blank";

        while(!name.equals("")) {
            System.out.print("Enter a name: ");
            name = sc.nextLine();
            names.add(name);
        }
        nameList = names.toArray(nameList);
        return nameList;
    }
}
