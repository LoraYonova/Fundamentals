package ArraysMoreExercise;

import java.util.Arrays;
import java.util.Scanner;

public class EncryptSortAndPrintArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number = Integer.parseInt(scan.nextLine());
        int [] numbers = new int[number];


        for (int i = 0; i < number; i++) {
            String names = scan.nextLine();
            int sum = 0;
            int name = names.length();


            for (int j = 0; j < names.length(); j++) {
                char symbol = names.charAt(j);


                if (symbol == 'a' || symbol == 'e' || symbol == 'i' || symbol == 'o' || symbol == 'u' || symbol == 'A' || symbol == 'E' || symbol == 'I'
                        || symbol == 'O' || symbol == 'U') {
                    sum += name * symbol;

                } else {
                    sum += symbol / name;
                }

            }
            numbers[i] = sum;

        }
        Arrays.sort(numbers);
        for (int i : numbers) {
            System.out.println(i);

        }


    }
}
