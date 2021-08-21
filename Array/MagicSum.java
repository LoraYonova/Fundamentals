package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class MagicSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] array = Arrays.stream(scan.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int number = Integer.parseInt(scan.nextLine());


        for (int i = 0; i < array.length; i++) {

            for (int j = i + 1; j < array.length; j++) {

                int sum = 0;

                sum += array[i] + array[j];

                if (sum == number) {
                    System.out.println(array[i] + " " + array[j]);
                }
            }


        }


    }
}
