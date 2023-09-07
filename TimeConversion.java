/* Time conversion Develop a program which converts input seconds in hours and
minutes and seconds.
Eg. 7515 seconds = 2 Hours, 5 minutes and 15 seconds */


import java.util.*;
public class TimeConversion{

public static void main(String[]args){
Scanner s= new Scanner(System.in);
System.out.print("Enter Seconds : ");

int seconds = s.nextInt();

int hours = seconds / 3600;
int rs = seconds % 3600;

int minutes = rs / 60;
int rs2= seconds % 60;

System.out.println(seconds + " Seconds = " + hours + " Hours " + minutes + " minutes " + rs2 + " second");

}
}