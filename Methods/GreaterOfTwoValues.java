package MethodsLab;

import java.util.Scanner;

public class GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String type = scan.nextLine();

        if (type.equals("int")) {

            int a = Integer.parseInt(scan.nextLine());
            int b = Integer.parseInt(scan.nextLine());
            int result = getMax(a, b);
            System.out.println(result);

        } else if (type.equals("char")) {
            char a = scan.nextLine().charAt(0);
            char b = scan.nextLine().charAt(0);
            char result = getMax(a, b);
            System.out.println(result);

        } else if (type.equals("string")) {
            String a = scan.nextLine();
            String b = scan.nextLine();
            String result  = getMax(a, b);
            System.out.println(result);
        }



    }

    static int getMax(int firstNumber, int secondNumber) {
        if (firstNumber > secondNumber) {
            return firstNumber;
        }
        return secondNumber;
    }

    static char getMax(char first, char second) {
        if (first > second) {
            return first;
        }
        return second;
    }

    static String getMax(String first, String second) {
        if (first.compareTo(second) >= 0) {
            return first;
        }
        return second;
    }
}
