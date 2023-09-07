/* ComputeMarks Write a program which takes the student name, Physics,
Chemistry and Mathematics Marks of a student as input. For each subject, marks
are out of 100. Compute the total marks of that student, percentage in each
subject and total percentage.
Print the out as “[Student Name] obtained following % of marks in PCM:
Physics: [% in Physics ], Chemistry : [% in Chem], Maths : [% in Maths]
Total : [Total %]”  */

import java.util.*;

public class Marks{
public static void main(String[]args){

Scanner s =new Scanner(System.in);
System.out.print("Enter Student Name : ");
String StudentName=s.next();

System.out.println("Enter Marks Out Of 100");

System.out.print("Enter Physics Marks: ");
Double PhysicsMarks= s.nextDouble();

System.out.print("Enter Chemistry Marks : ");
Double ChemistryMarks= s.nextDouble();

System.out.print("Enter Maths Marks : ");
Double MathsMarks= s.nextDouble();

System.out.print("Enter Biology Marks : ");
Double BiologyMarks= s.nextDouble();

double TotalMarks = (PhysicsMarks + ChemistryMarks + MathsMarks + BiologyMarks ) / 400 ;
double Total = TotalMarks * 100;


System.out.println(StudentName + " " +"Obtained the Following % in PCMB : " + Total + " % ");
}
}