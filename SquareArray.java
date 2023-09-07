// Generate an array of squares of numbers from 1 to 10

public class SquareArray{
    public static void main(String[]args){
        int[] squares = new int[10];
        for(int i =1 ; i<=10;i++){
            squares[i-1] = square(i);
        } // not understand squares[i-1] = square(i); this part
        System.out.println("Array of squares from 1- 10 : ");
        for(int square : squares){

            System.out.println(square + " ");
        }

    }
    public static int square(int num){
        return num * num;
    }
}