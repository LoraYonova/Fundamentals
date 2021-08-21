package BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        double sum = 0;
        while (!input.equals("Start")) {
            double coins = Double.parseDouble(input);
            if (coins == 0.1 || coins == 0.2 || coins == 0.5 || coins == 1 || coins == 2) {
                sum += coins;
            } else {
                System.out.printf("Cannot accept %.2f%n" , coins);
            }
            input = scan.nextLine();
        }
        String end = scan.nextLine();
        while (!end.equals("End")) {

            if (end.equals("Nuts")) {
                if (sum < 2) {
                    System.out.println("Sorry, not enough money");

                } else {
                    sum -= 2;
                    System.out.println("Purchased Nuts");
                }

            } else if (end.equals("Water")) {
                if (sum < 0.7) {
                    System.out.println("Sorry, not enough money");

                } else {
                    sum -= 0.7;
                    System.out.println("Purchased Water");
                }

            } else if (end.equals("Crisps")) {
                if (sum < 1.5) {
                    System.out.println("Sorry, not enough money");

                } else {
                    sum -= 1.5;
                    System.out.println("Purchased Crisps");
                }

            } else if (end.equals("Soda")) {
                if (sum < 0.8) {
                    System.out.println("Sorry, not enough money");

                } else {
                    sum -= 0.8;
                    System.out.println("Purchased Soda");
                }

            } else if (end.equals("Coke")) {
                if (sum < 1) {
                    System.out.println("Sorry, not enough money");

                } else {
                    sum -= 1;
                    System.out.println("Purchased Coke");
                }
            } else {
                System.out.println("Invalid product");
            }



            end = scan.nextLine();
        }

        System.out.printf("Change: %.2f" , sum);

    }
}
