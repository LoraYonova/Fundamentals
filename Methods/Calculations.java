package MethodsLab;

import java.util.Scanner;

public class Calculations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String command = scan.nextLine();
        int firstNumber = Integer.parseInt(scan.nextLine());
        int secondNumber = Integer.parseInt(scan.nextLine());

        if (command.equals("add")) {
            printAdd(firstNumber, secondNumber);
        } else if (command.equals("subtract")) {
            printSubtract(firstNumber, secondNumber);
        } else if (command.equals("multiply")) {
            printMultiply(firstNumber, secondNumber);
        } else if (command.equals("divide")) {
            printDivide(firstNumber, secondNumber);
        }


    }

    private static void printAdd(int first, int second) {
        System.out.println(first + second);

    }

    private static void printSubtract(int first, int second) {
        System.out.println(first - second);
    }

    private static void printMultiply(int first, int second) {
        System.out.println(first * second);
    }

    private static void printDivide(int first, int second) {
        System.out.println(first / second);
    }
}
