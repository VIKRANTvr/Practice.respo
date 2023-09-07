/* Refactor the Code to write a function to get work hours
Explain in detail when to use the function. How to pass parameters. Return value.
Parameter passing by address or by value concepts
Take few more simple example like carrying out addition, subtraction, multiplication & division  in separate functions with 2 double variable inputs and printing the return from the main program */


public class ArithmeticOperations {

    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }

    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }

    public static double divide(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Cannot divide by zero.");
            return 0;
        }
        return num1 / num2;
    }

    public static void main(String[] args) {
        double number1 = 10.0;
        double number2 = 5.0;

        System.out.println("Addition result: " + add(number1, number2));
        System.out.println("Subtraction result: " + subtract(number1, number2));
        System.out.println("Multiplication result: " + multiply(number1, number2));
        System.out.println("Division result: " + divide(number1, number2));
    }
}