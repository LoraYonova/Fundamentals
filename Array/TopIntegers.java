package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class TopIntegers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] array = Arrays.stream(scan.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();


        for (int i = 0; i < array.length; i++) {

            boolean isBigger = true;

            for (int j = i + 1; j < array.length; j++) {

                if (array[i] <= array[j]) {
                    isBigger = false;

                }

            }

            if (isBigger) {
                System.out.print(array[i] + " ");

            }
        }


    }
}
