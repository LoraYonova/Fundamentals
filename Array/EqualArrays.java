package ArraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class EqualArrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] first = Arrays.stream(scan.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int[] second = Arrays.stream(scan.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int sum = 0;
        int index = 0;
        boolean areIdentical = false;
        for (int i = 0; i < first.length; i++) {

            if (first[i] == second[i]) {
                areIdentical = true;
                sum += first[i];

            } else {
                index += i;
                areIdentical = false;
                break;

            }

        }

        if (!areIdentical) {
            System.out.printf("Arrays are not identical. Found difference at %d index." , index);
        }

        if (areIdentical) {
            System.out.printf("Arrays are identical. Sum: %d", sum);
        }
    }
}
