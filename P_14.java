//Write a Program to Check Vowel or Consonant

import java.util.*;
public class P_14 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a Character to check vowels or Consonant : ");

        String V =s.next();
        String vowel = switch (V) {
            case "a","e", "i","o","u","A","E","I","O","U" -> V +" "+ "is a Vowel";
            default -> "It is a Consonant";
        };
        System.out.println(vowel);
    }
}
