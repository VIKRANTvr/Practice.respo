//Read a single Digit Number and write in word

import java.util.*;
public class P_8 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a single Digit number : ");
        int number= s.nextInt();
        String word ="10";
        switch(number){
            case 0:
            word="Zero";
            break;
            case 1:
            word ="One";
            break;
            case 2:
                word ="Two";
                break;
            case 3:
                word ="Three";
                break;
            case 4:
                word ="Four";
                break;
            case 5:
                word ="Five";
                break;
            case 6:
                word ="Six";
                break;
            case 7:
                word ="Seven";
                break;
            case 8:
                word ="Eight";
                break;
            case 9:
                word ="Nine";
                break;
            default :
                System.out.println("Invalid Number");
        }
        System.out.println(word);

    }
}
