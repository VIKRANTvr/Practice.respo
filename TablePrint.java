/* Number Table Develop a program which generates a table of a number given
and prints the same.
Eg. Input : 5
Output :
5 X 1 = 5
5 X 2 = 10
5 X 3 =15
....
5 X 10 = 50 */

import java.util.*;
public class TablePrint{
public static void main(String[]args){
Scanner s= new Scanner(System.in);
System.out.println("Enter a number : ");
int number = s.nextInt();

System.out.println("Multiplication table for " + number + " : ");

for(int i =1;i<=10;i++){
int result = number * i;
System.out.println(number + " x " + i + " = " + result);
}
}
}