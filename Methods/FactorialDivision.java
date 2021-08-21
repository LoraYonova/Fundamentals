package MethodsExercise;

import java.util.Scanner;

public class FactorialDivision {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scan.nextLine());
        int secondNumber = Integer.parseInt(scan.nextLine());
        long factorial1 = factorialDivision(firstNumber);
        long factorial2 = factorialDivision(secondNumber);
        double result = factorial1 * 1.0 / factorial2;
        System.out.printf("%.2f" , result);
    }
    static long factorialDivision(long number) {
        long result = 1;
        for (int i = 1; i <= number ; i++) {


            result *= i;

        }

        return result;

    }
}
