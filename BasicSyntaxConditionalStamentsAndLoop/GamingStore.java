package BasicSyntaxConditionalStatementsAndLoopsMoreExercise;

import java.util.Scanner;

public class GamingStore {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double balance = Double.parseDouble(scan.nextLine());
        String command = scan.nextLine();
        double price = 0;
        double sum = 0;
        boolean noMoney = false;

        while (!command.equals("Game Time")) {

            if (balance <= 0) {

                noMoney = true;
                break;
            }

            if (command.equals("OutFall 4")) {
                price = 39.99;
                if (price > balance) {
                    System.out.println("Too Expensive");
                    command = scan.nextLine();
                    continue;
                }
                balance -= price;
                sum += price;

                System.out.println("Bought OutFall 4");

            } else if (command.equals("CS: OG")) {
                price = 15.99;
                if (price > balance) {
                    System.out.println("Too Expensive");
                    command = scan.nextLine();
                    continue;
                }
                balance -= price;
                sum += price;

                System.out.println("Bought CS: OG");


            } else if (command.equals("Zplinter Zell")) {
                price = 19.99;
                if (price > balance) {
                    System.out.println("Too Expensive");
                    command = scan.nextLine();
                    continue;
                }
                balance -= price;
                sum += price;

                System.out.println("Bought Zplinter Zell");

            } else if (command.equals("Honored 2")) {
                price = 59.99;
                if (price > balance) {
                    System.out.println("Too Expensive");
                    command = scan.nextLine();
                    continue;
                }
                balance -= price;
                sum += price;

                System.out.println("Bought Honored 2");

            } else if (command.equals("RoverWatch")) {
                price = 29.99;
                if (price > balance) {
                    System.out.println("Too Expensive");
                    command = scan.nextLine();
                    continue;
                }
                balance -= price;
                sum += price;

                System.out.println("Bought RoverWatch");

            } else if (command.equals("RoverWatch Origins Edition")) {
                price = 39.99;
                if (price > balance) {
                    System.out.println("Too Expensive");
                    command = scan.nextLine();
                    continue;
                }
                balance -= price;
                sum += price;

                System.out.println("Bought RoverWatch Origins Edition");

            } else {
                System.out.println("Not Found");
            }


            command = scan.nextLine();
        }

        if (noMoney || balance <= 0) {
            System.out.println("Out of money!");
        } else {
            System.out.printf("Total spent: $%.2f. Remaining: $%.2f", sum, balance);
        }

    }
}
