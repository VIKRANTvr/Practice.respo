/* Write a program Quadratic to find the roots of the equation a*x*x + b*x + c. Since
the equation is x*x, hence there are 2 roots. The 2 roots of the equation can be
found using a formula
a. delta = b*b - 4*a*c
b. Root 1 of x = (-b + sqrt(delta))/(2*a)
c. Root 2 of x = (-b - sqrt(delta))/(2*a)
d. Take a, b, and c as input values to find the roots of x.
*/

import java.util.*;
public class QuadraticRoots{
public static void main(String[]args){
Scanner s = new Scanner(System.in);

System.out.println("ENter Coefficient of a : ");
double a = s.nextDouble();

System.out.println("Enter Coefficient of b : ");
double b = s.nextDouble();

System.out.println("Enter Coefficient of c : ");
double c = s.nextDouble();

double delta = b * b - 4 * a * c;

if(delta > 0){
 double root1 = (-b + Math.sqrt(delta)) / (2 * a);
 double root2 = (-b - Math.sqrt(delta)) / (2 * a);
System.out.println("Root 1 : " + root1);
System.out.println("Root 2 : " + root2);
} 
else if(delta == 0){
double root = -b / (2 * a);
System.out.println("Root : " + root);
}
else{
double realpart = -b / (2 * a);
double imaginarypart = Math.sqrt(-delta) / (2 * a);
System.out.println("Root1 : "+ realpart +" + "+ imaginarypart + "i");
System.out.println("Root1 : "+ realpart +" - "+ imaginarypart + "i");
}

}
}