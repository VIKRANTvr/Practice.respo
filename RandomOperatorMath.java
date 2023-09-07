/* RandomOperatorMath Write a program that generates two random integers
between 1 and 10 and a random arithmetic operator (+, -, *, or /), then prints the
equation and the result of the operation. */

import java.util.*;

public class RandomOperatorMath{

public static void main(String[]args){
Random r = new Random();

int num1 = r.nextInt(10)+ 1;
int num2 = r.nextInt(10)+ 1;

char operator;

int operatorChoice = r.nextInt(4);

switch(operatorChoice){
case 0 : 
operator = '+';
break;

case 1 : 
operator = '-';
break;

case 2 : 
operator = '*';
break;

case 3 : 
operator = '/';
break;

default :
System.out.println("Please Enter a Valid Operator");
}
double result;

switch(operator){
case '+' :
result = num1 + num2;
break;

case '-' :
result = num1 - num2;
break;

case '*' :
result = num1 * num2;
break;

case '/' :
if(num2 !=0){
result = (double) num1 / num2;
}
else{
System.out.println("Division by zero,result is undefined.");
return;
}
break;
}
System.out.println("Random Equation : " + num1 + " " + operator + " " + num2);
System.out.println("Result : " + result);
}
}