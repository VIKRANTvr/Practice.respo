/* Write a Double Opt program by taking a, b and c as input values and print the following double operations a + b *c, a * b + c, c + a / b, and a % b + c. Please discuss the precedence of the operators. */

import java.util.*;
public class DoubOpt{
public static void main(String[]args){
Scanner s = new Scanner(System.in);

System.out.println("Enter the value of a : ");
double a = s.nextDouble();

System.out.println("Enter the value of b : ");
double b = s.nextDouble();

System.out.println("Enter the value of c : ");
double c = s.nextDouble();

Double result1 =  a + b * c; 
Double result2 =  a * b + c; 
Double result3 =  c + a / b; 
Double result4 =  a % b + c; 

System.out.println("a + b * c : " + result1);
System.out.println("a * b + c : " + result2);
System.out.println("c + a / b : " + result3);
System.out.println("a % b + c : " + result4);

}
}