//Read a Number 1,10,100,1000 and display unit, ten hundred

import java.util.*;
public class P_9 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a number to Display it's Unit : ");
        int number=s.nextInt();

        int Units = number % 10;
        int Tens = (number / 10) % 10;
        int Hundreds = (number / 100) % 10;
        int Thousands = (number / 1000) % 10;

        System.out.println("Unit :" + Units);
        System.out.println("Ten :" + Tens);
        System.out.println("Hundred :" + Hundreds);
        System.out.println("Thousand :" + Thousands);

    }
}
