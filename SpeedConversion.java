/* Speed Conversion Create a program that converts speed given in kilometers per
hour (km/h) to meters per second (m/s) or vice versa.
Use the conversion factor: m/s = km/h * 1000 / 3600 */


import java.util.*;
public class SpeedConversion{
public static void main(String[]args){

Scanner s=new Scanner(System.in);

System.out.println("Enter Speed (km/h or m/s) : ");
double speed = s.nextDouble();

System.out.print("Enter 'kmh' for km/h to m/s conversion or 'ms' for m/s to km/h conversion : ");
String choice = s.next();

double convertedSpeed;

if(choice.equals("kmh")){
convertedSpeed = speed * 1000 / 3600;
System.out.println(speed + " km/h is equivalent to " + convertedSpeed + " m/s " );
}
else if(choice.equals("ms")){
convertedSpeed = speed * 3600 / 1000 ;
System.out.println(speed + "m/s is equivalent to " + convertedSpeed + " km/h ");
}
else{
System.out.println("Invalid Choice . Please enter 'kmh' or 'ms'.");
}
}
}