/* Odd or Even Design a program that determines if a given integer is odd or even
using an if else statement. */

import java.util.*;
public class OddEven{
public static void main(String[]args){
Scanner s=new Scanner(System.in);
System.out.println("Enter a Number : ");
int number = s.nextInt();

if(number % 2==0){
System.out.println(number + " is an Even number.");
}
else{
System.out.println(number + " is an Odd number.");
}
}
}