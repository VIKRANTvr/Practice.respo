/* Day of the Week Write a program that takes a number from 1 to 7 as input and
outputs the corresponding day of the week (e.g., 1 - Sunday, 2 - Monday, ...). */

import java.util.*;
public class Weekday{
public static void main(String[]args){

Scanner s =new Scanner(System.in);
System.out.println("Enter a Weekday number(1 - 7) : ");

int Week = s.nextInt();

String Weekdays;

switch(Week) {
case 1 :
Weekdays= "Sunday";
break;
case 2 :
Weekdays="Monday";
break;
case 3 :
Weekdays="Tuesday";
break;
case 4 :
Weekdays="Wednesday";
break;
case 5 :
Weekdays="Thursday";
break;
case 6 :
Weekdays="Friday";
break;
case 7 :
Weekdays="Saturday";
break;
default : 
System.out.println("Please Enter Number between 1 - 7.");
break;
}
System.out.println("Today is : " + Weekdays);
}
}