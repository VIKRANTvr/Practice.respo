// Write a Program to reverse the integer number eg. Input n=231 reverse is 132

import static java.lang.Integer.reverse;

public class P_12 {
    public static void main(String[] args) {
        int n = 321;
        int reversed = reverse(n);
        System.out.println("Original number : " + n);
        System.out.println("Reversed number : " + reversed);
    }
// 
    static int reverse(int num) {
        int reversedNum = 0;
        while (num != 0) {
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num /= 10;
        }
        return reversedNum;
    }
}