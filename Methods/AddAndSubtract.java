package MethodsExercise;

import java.util.Scanner;

public class AddAndSubtract {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int first = Integer.parseInt(scan.nextLine());
        int second = Integer.parseInt(scan.nextLine());
        int third = Integer.parseInt(scan.nextLine());

        int sum = sumTwoInteger(first,second);




        int subtract = subtract(third);
        System.out.println(sum - subtract);


    }
    private static int sumTwoInteger(int first, int second) {

        return first + second;
    }

    private static int subtract(int third) {
        return third;
    }
}
