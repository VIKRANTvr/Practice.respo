// Java Program to print the elements of an array present on an even position

public class Even{
public static void main(String[]args){
int[] numbers={1,2,3,4,5,6,7,8,9,10};
for(int i=0; i<numbers.length;i+=2){
System.out.println("Elements at Even Position " + i + " : "+numbers[i]);
}
}
}