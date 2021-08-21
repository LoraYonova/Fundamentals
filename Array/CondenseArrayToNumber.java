package ArraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class CondenseArrayToNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int [] numbers = Arrays.stream(scan.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();


        while (numbers.length > 1 ) {
            int [] newNumber = new int[numbers.length - 1];

            for (int i = 0; i < numbers.length - 1; i++) {
                newNumber[i] = numbers[i] + numbers[i + 1];
            }
            numbers = newNumber;
        }
        System.out.println(numbers[0]);





    }
}
