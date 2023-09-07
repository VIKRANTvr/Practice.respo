//Java Program to print the smallest element in an array

public class SmallestElement {
    public static void main(String[] args) {
        int[] n = {5, 2, 9, 10, 3, 1};

       
        int smallest = n[0];

       
        for (int i = 1; i < n.length; i++) {
            if (n[i] < smallest) {
                smallest = n[i];
            }
        }

      
        System.out.println("The smallest element in the array is: " + smallest);
    }
}