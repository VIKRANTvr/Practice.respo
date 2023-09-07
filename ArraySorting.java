//  Java Program to sort the elements of an array in ascending order  

import java.util.Arrays;

public class ArraySorting {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 9, 10, 3, 1};
          Arrays.sort(numbers);

        System.out.println("Sorted array in ascending order:");
        for(int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
