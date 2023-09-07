//Write a Program for the sum of n natural numbers eg. Input N=5 output 1+2+3+4+5


import java.util.*;
public class P_10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a Natural number : ");
        int n = s.nextInt();
        if (n < 1) {
            System.out.println("Please Enter a Positive Number");
        } else {
            int sum = 0;
            for (int i = 1; i <= n; i++) {
                sum += i;
            }
            System.out.println("The SUm of First " + n + " Natural number is : ");
            for (int i = 1; i <= n; i++) {
                System.out.println(i);
                if (i < n) {
                    System.out.println("+");
                }
            }
            System.out.println(" = "+ sum);
        }
    }
}