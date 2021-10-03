/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Ryan Fisher
 */

package baseline;

import java.util.*;

/* pseudocode:
    in function makeList():
        implement input necessities
        create an empty array of integers
        use an ArrayList for empty timeArr
        take input in while loop until input == "done"
        parse string input to int and include nonnumeric values exception
        add each int to the Array list
        convert the ArrayList to an array and return to main
    in function output()
        print out the resulting list of integers
        use an if statement so the last integer doesn't include a comma, but a newline
        call on functions findMin, findMax, findAvg and findStd and output their returned values
 */

public class Solution36 {
    public static void main(String[] args) {
        Integer[] timeArr = makeList();
        output(timeArr);
    }

    public static int findMin(Integer[] timeArr) {
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < timeArr.length; i++) {
            if(timeArr[i] < min)
                min = timeArr[i];
        }
        return min;
    }

    public static int findMax(Integer[] timeArr) {
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < timeArr.length; i++) {
            if(timeArr[i] > max)
                max = timeArr[i];
        }
        return max;
    }

    public static double findAvg(Integer[] timeArr) {
        double sum = 0;
        for(int i = 0; i < timeArr.length; i++) {
            sum += (double) timeArr[i];
        }
        return sum/timeArr.length;
    }

    public static double findStd(Integer[] timeArr) {
        double sum = 0;
        for(int i = 0; i < timeArr.length; i++) {
            sum += Math.pow(timeArr[i] - findAvg(timeArr), 2);
        }
        return Math.sqrt(sum/timeArr.length);
    }

    public static void output(Integer[] timeArr) {
        System.out.print("Numbers: ");
        for (int i = 0; i < timeArr.length; i++) {
            if (i == timeArr.length - 1) {
                System.out.printf("%d%n", timeArr[i]);
            } else
                System.out.printf("%d, ", timeArr[i]);
        }
        System.out.printf("The average is %.1f%n", findAvg(timeArr));
        System.out.printf("The maximum is %d%n", findMax(timeArr));
        System.out.printf("The minimum is %d%n", findMin(timeArr));
        System.out.printf("The standard deviation is %.2f%n", findStd(timeArr));
    }

    public static Integer[] makeList() {
        Scanner sc = new Scanner(System.in);

        Integer[] timeArr = new Integer[0];

        List<Integer> durations = new ArrayList<>(Arrays.asList(timeArr));

        String timeStr = "0";
        int time = 1;
        boolean input = false;
        while (!timeStr.equals("done") && !input) {
            try {
                System.out.print("Enter a number: ");
                timeStr = sc.nextLine();

                if (time <= 0) {
                    System.out.print("Enter a valid number: ");
                    input = true;
                }
                else {
                    time = Integer.parseInt(timeStr);
                    durations.add(time);
                }
            } catch(NumberFormatException e){
            }
        }

        timeArr = durations.toArray(timeArr);

        return timeArr;
    }
}

