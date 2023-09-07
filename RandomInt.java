// Write a program that generates random number between two given integer numbers

import java.util.Random;
public class RandomInt{
public static void main(String[]args){
Random r=new Random();

int num1 = r.nextInt();
System.out.println(num1);

int num2 = r.nextInt();
System.out.println(num2);
}
}