package MethodsLab;

import java.util.Scanner;

public class MultiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number = Integer.parseInt(scan.nextLine());

        int result = getMultiplyOfEvensAndOdds(number);
        System.out.println(result);




    }
    private static int getMultiplyOfEvensAndOdds(int n) {
        int evenSum = getEvenSum(Math.abs(n));
        int oddSum = getOddSum(Math.abs(n));
        return evenSum * oddSum;
    }


    private static int getEvenSum(int number) {
        int evenSum = 0;
        while (number > 0) {
            int digit = number % 10;
            if (digit % 2 == 0) {
                evenSum += digit;
            }
            number = number / 10;
        }

        return evenSum;
    }

    private static int getOddSum(int number) {
        int oddSum = 0;
        while (number > 0) {
            int digit = number % 10;
            if (digit % 2 != 0) {
                oddSum += digit;
            }
            number = number / 10;
        }
        return oddSum;
    }
}
