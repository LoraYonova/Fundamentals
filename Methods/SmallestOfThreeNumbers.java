package MethodsExercise;

import java.util.Scanner;

public class SmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scan.nextLine());
        int secondNumber = Integer.parseInt(scan.nextLine());
        int thirdNumber = Integer.parseInt(scan.nextLine());

        printSmallestNumber(firstNumber, secondNumber,thirdNumber);


    }
    private static void printSmallestNumber(int a, int b, int c) {
        if (a <= b && a <= c) {
            System.out.println(a);
        } else if (b <= a && b <= c) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }
    }
}
