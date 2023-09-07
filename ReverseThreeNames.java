/* Write a program “PrintThreeNames” that takes three of your friends’ names as input arguments and prints out a proper sentence  with the names in the reverse of the order given. 
For example, 
           "java PrintThreeNames Mohan,  Dilip,  Manu" 
     gives 
          "Hi!, my friends are : Manu, Diliip and Manu."*/

import java.util.*;
public class ReverseThreeNames{

public static void main(String[]args){

System.out.println("Enter Your Three Friends Names.");

Scanner s = new Scanner(System.in);

String name1 = s.next();
System.out.println("Enter name of First Friend : ");

String name2 =s.next();
System.out.println("Enter name of Second Friend : ");

String name3 =s.next();
System.out.println("Enter name of third Friend : ");

System.out.println("Hii My Friends are : " + name3 + " , "+ name2 + " and " + name1 +  " . "); 
}
}