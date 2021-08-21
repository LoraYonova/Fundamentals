package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number = Integer.parseInt(scan.nextLine());
        double sum = 0;
        double first = 0;


        while (true){

            first = number % 10;
            sum += first;

            number /= 10;


            if (number <= 0) {
                break;
            }



        }
        System.out.printf("%.0f" , sum);

    }
}
