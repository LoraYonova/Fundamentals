package BasicSyntaxConditionalStatementsAndLoopsLab;

import java.util.Scanner;

public class EvenNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        while (true) {
            if (n % 2 != 0) {
                System.out.printf("Please write an even number.%n");

            } else {
                System.out.printf("The number is: %d" ,Math.abs(n));
                break;
            }
            n = Integer.parseInt(scan.nextLine());
        }


    }
}
