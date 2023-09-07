//Java Program to print the largest element in an array

public class LargestElement{
    public static void main(String[] args) {
        int[] n = {5, 2, 9, 10, 3, 1};

      
        int largest = n[0];

      
        for (int i = 1; i < n.length; i++) {
            if (n[i] > largest) {
                largest = n[i];
            }
        }

     
        System.out.println("The largest element in the array is: " + largest);
    }
}