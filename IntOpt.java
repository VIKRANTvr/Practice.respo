/* Write a IntOpt program by taking a, b and c as input values and print the following integer operations a + b *c, a * b + c, c + a / b, and a % b + c. Please discuss the precedence of the operators. */

import java.util.*;
public class IntOpt{
public static void main(String[]args){

Scanner s= new Scanner(System.in);

System.out.println("Enter the value of a : " );
int a = s.nextInt();

System.out.println("Enter the value of b : ");
int b = s.nextInt();

System.out.println("Enter the value of c : ");
int c = s.nextInt();

int result1 = a + b * c;
int result2 = a * b + c;
int result3 = c + a / b;
int result4 = a % b + c;

System.out.println(" a + b * c : " + result1);
System.out.println(" a * b + c : " + result2);
System.out.println(" c + a / b : " + result3);
System.out.println(" a % b + c : " + result4);
}
}