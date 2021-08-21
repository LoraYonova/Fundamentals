package BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number = Integer.parseInt(scan.nextLine());

        int counter = 0;

        if (number % 10 == 0) {
            counter = 10;

        } else if (number % 7 == 0) {
            counter = 7;

        } else if(number % 6 == 0) {
            counter = 6;

        } else if (number % 3 == 0) {
            counter = 3;

        } else if (number % 2 == 0) {
            counter = 2;

        }
        if (counter == 0) {
            System.out.println("Not divisible");
        } else {
            System.out.printf("The number is divisible by %d" , counter);
        }
    }
}
