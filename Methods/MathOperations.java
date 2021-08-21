package MethodsLab;

import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scan.nextLine());
        String operator = scan.nextLine();
        int secondNumber = Integer.parseInt(scan.nextLine());

        double result = calculate(firstNumber, operator, secondNumber);
        System.out.printf("%.0f" , result);



    }
    private static double calculate(int a, String operator, int b) {
        double result = 0;
        switch (operator) {
            case "+":
                result = getOperatorAdd(a, b);
                break;
            case "-":
                result = getOperatorSubtract(a, b);
                break;
            case "*":
                result = getOperatorMultiply(a, b);
                break;
            case "/":
                result = getOperatorDivide(a, b);
                break;


        }
        return result;
    }



    private static double getOperatorAdd(int a, int b) {
        return a + b;
    }

    private static double getOperatorSubtract(int a, int b) {
        return a - b;
    }

    private static double getOperatorMultiply(int a, int b) {
        return a * b;
    }

    private static double getOperatorDivide(int a, int b) {
        return (double)a / b;
    }
}
