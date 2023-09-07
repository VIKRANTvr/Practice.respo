/* Write a program Distance that takes two integer command-line arguments x and y and prints the Euclidean distance from the point (x, y) to the origin (0, 0). The formulae to calculate distance = sqrt(x*x + y*y). Use Math.power function */

public class Euclidean_distance{
public static void main(String[]args){
if(args.length !=2){
System.out.println("Please Provide Two Integers as Comman-Line Arguments (x and y).");
return;
}
int x =Integer.parseInt(args[0]);
int y =Integer.parseInt(args[1]);
double distance = Math.sqrt(Math.pow(x,2) + Math.pow(y,2));
System.out.println("Euclidean Distance from (" + x + ","+ y + ") to the origin (0,0) is : " + distance);
}
}