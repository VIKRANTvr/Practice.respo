/* Weight Conversion In some UK shops grocery items sold are weighed in pounds.
Plan developing a program which converts the item weight in KG.
Where 1 Pound = 453.592 gm
Test this with entering different input in pounds and print the weight in KG */

import java.util.*;
public class WeightConversion{
public static void main(String[]args){

System.out.println("Weights Conversion from Pounds to Kilogram.");

Scanner s=new Scanner(System.in);

System.out.print("Enter weights in Pounds to Convert it into Kilograms : ");
double pounds =s.nextDouble();

double kilograms = pounds * 0.453592;

System.out.println(kilograms + " kg ");
}
}