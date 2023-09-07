//  Find 2nd Largest Number in an Array

public class SecondLargestNUm{
public static void main(String[]args){

int[] numbers={2,5,4,9,1,10,8};

int largest=Integer.MIN_VALUE;
int SecondLargest=Integer.MIN_VALUE;

for(int number : numbers){
if(number>largest){
  SecondLargest=largest;
  largest=number;
}
else if(number > SecondLargest && number!=largest){
SecondLargest=number;
}
}
if(SecondLargest!=Integer.MIN_VALUE){
System.out.println("The Second Largest Number is : "+SecondLargest);
}
else{
System.out.println("No Second Largest Number Found");
}
}
}