package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int [] numbers = Arrays.stream(scan.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();

        int rotation = Integer.parseInt(scan.nextLine());


        for (int i = 0; i < rotation; i++) {

            int temp1 = numbers[0];

            for (int j = 0; j < numbers.length - 1; j++) {

                numbers[j] = numbers[j +1];

            }
            numbers[numbers.length - 1] = temp1;



        }

        for (int number : numbers) {
            System.out.print(number + " ");

        }

    }
}
