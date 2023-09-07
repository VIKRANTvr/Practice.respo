/* Write a Program to find Palindrome Number
eg. Input n=121 then after reverse output is same 121 then it is a palindrome.
eg. Input n=321 then after reverse output is not same it's 123 then it is not a palindrome number.
*/
public class P_13 {
    public static void main(String[] args) {
 int n =321;
 boolean ip=isPalindrome(n);
        System.out.println("Input number : "+ n );
        if(ip)
        {
        
            System.out.println("It is a Palindrome number.");
        }
        else{
            System.out.println("It is not a Palindrome number.");
        }
    }
    private static boolean isPalindrome(int num) {
        int OriginalNum =num;
        int reversedNum = 0;
        while(num!=0){
            int digit =num%10;
            reversedNum=reversedNum * 10 +digit;
            num /=10;
        }
        return OriginalNum==reversedNum;
    }
}