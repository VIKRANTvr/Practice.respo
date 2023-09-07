/* Write a program to check two strings are equal or not. 
1.4 To find the sum of command-line arguments and count the invalid integers entered./*

import java.util.*;
    public class P_3 {
    public static void main(String[] args) {
    Scanner s= new Scanner(System.in);
        System.out.print("Enter First String : ");
        String str1=s.next();
        System.out.print("Enter Second String : ");
        String str2=s.next();
        if(str1.equals(str2)){
            System.out.print("The Two Strings are Equal");
        }
        else{
            System.out.print("The Two Strings are Notequal");
        }
}
}
