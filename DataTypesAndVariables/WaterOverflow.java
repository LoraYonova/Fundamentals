package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class WaterOverflow {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numbersLine = Integer.parseInt(scan.nextLine());

        int capacity = 255;
        int result = 0;


        for (int i = 1; i <= numbersLine; i++) {
            int quantities = Integer.parseInt(scan.nextLine());

            if (capacity >= quantities) {
                capacity -= quantities;
                result += quantities;

            } else {
                System.out.println("Insufficient capacity!");
            }



        }
        System.out.println(result);

    }
}
