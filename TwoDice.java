/* Write a program SumOfTwoDice that prints the sum of two random integers
between 1 and 6 (such as you might get when rolling dice). */

import java.util.Random;
public class TwoDice{
public static void main(String[]args){
Random r = new Random();

int dice1= r.nextInt(6) + 1;
int dice2= r.nextInt(6) + 1;

int sum = dice1 + dice2;
System.out.println("Rolling Two Dice....");
System.out.println("Dice 1 : "+ dice1);
System.out.println("Dice 2 : "+ dice2);
System.out.println("Sum of Two Dice : " + sum);
}
}