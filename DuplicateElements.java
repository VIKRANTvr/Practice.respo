// Java Program to print the duplicate elements of an array

public class DuplicateElements {
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 2, 5, 6, 1, 7, 8, 7};

        System.out.println("Duplicate elements in the array are:");

        for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {
                if (num[i] == num[j]) {
                    System.out.println(num[j]);
                }
            }
        }
    }
}
