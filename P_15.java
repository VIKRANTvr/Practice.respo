// Write a Program to print the month name for the given number

import java.util.*;
public class P_15 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.print("Enter a Number from 1 to 12 to get Month Name : ");
        int M= s.nextInt();
        String Month ="";
        switch (M) {
            case 1 -> Month = "January";
            case 2 -> Month = "February";
            case 3 -> Month = "March";
            case 4 -> Month = "April";
            case 5 -> Month = "May";
            case 6 -> Month = "June";
            case 7 -> Month = "July";
            case 8 -> Month = "August";
            case 9 -> Month = "September";
            case 10 -> Month = "October";
            case 11 -> Month = "November";
            case 12 -> Month = "December";
            default -> System.out.print("Please Enter a Valid Number");
        }
        System.out.println(Month);
    }
}
