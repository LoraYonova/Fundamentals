package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int [] numbers = Arrays.stream(scan.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int maxCount = 0;
        int digit = 0;
        int counter = 0;


        for (int i = 0; i < numbers.length - 1; i++) {


            if (numbers[i] == numbers[i + 1 ] ) {
                counter++;

                if (counter > maxCount) {
                    maxCount = counter;
                    digit = numbers[i];
                }

            } else {
                counter = 0;
            }

        }

        for (int i = 0; i <= maxCount; i++) {
            System.out.print(digit + " ");
        }


    }
}
