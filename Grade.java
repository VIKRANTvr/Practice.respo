/* Grading System Write a program that takes a student's numerical score as input
and outputs their corresponding letter grade (A, B, C, D, F) using the following
ranges: A (90-100), B (80-89), C (70-79), D (60-69), F (0-59). */

import java.util.*;

public class Grade{
public static void main(String[]args){

Scanner s =new Scanner(System.in);

System.out.println("Enter Your Score : ");
int score = s.nextInt();

char Grade =' ' ;

if(score >= 90 && score <= 100){
Grade = 'A';
}

else if(score >= 80 && score <= 89){
Grade = 'B';
}

else if(score >= 70 && score <= 79){
Grade = 'C';
}

else if(score >= 60 && score <= 69){
Grade = 'D';
}
else if(score >= 0 && score <= 59){
Grade = 'F';
}
else{
System.out.println("Invalid score, Score should be entered between 0-100.");
}
System.out.println("The Student's grade is : " + Grade);
}
}