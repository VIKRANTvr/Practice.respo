/* Write a TemperatureConversion program, given the temperature in Fahrenheit as input outputs the temperature in Celsius or vice versa using the formula
Celsius to Fahrenheit:   (°C × 9/5) + 32 = °F
Fahrenheit to Celsius:   (°F − 32) x 5/9 = °C */

import java.util.*;
public class TempConversion{
public static void main(String[]args){

Scanner input = new Scanner(System.in);
System.out.println("Temperature Conversion Program.");
System.out.println("1.Convert celsius to Fahrenheit");
System.out.println("2.Convert Fahrenheit to celsius");
System.out.println("Enter your choice (1 or 2) : ");

int choice = input.nextInt();

if(choice == 1){
System.out.println("Enter Temperature in Celsius : ");
double Celsius = input.nextDouble();
double Fahrenheit =(Celsius * 9/5) + 32 ;
System.out.println("Temperature in Fahrenheit : " + Fahrenheit + " F ");
}
else if(choice == 2){
System.out.println("Enter Temperature in Fahrenheit : ");
double Fahrenheit = input.nextDouble();
double Celsius = (Fahrenheit - 32) * 5/9 ; 
System.out.println("Temperature in Celsius : "+ Celsius + " C");
}
else{
System.out.println("Invalid Choice , Please Enter 1 or 2.");
}
}
}