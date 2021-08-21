package MethodsLab;

import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String product = scan.nextLine();
        int quantity = Integer.parseInt(scan.nextLine());

        switch (product) {
            case "coffee":
                printCoffee(quantity);
                break;
            case "water":
                printWater(quantity);
                break;
            case "coke":
                printCoke(quantity);
                break;
            case "snacks":
                printSnacks(quantity);
                break;
        }

    }
    private static void printCoffee(double price) {
        price *= 1.50;
        System.out.printf("%.2f" , price);

    }
    private static void printWater(double price) {
        price *= 1.00;
        System.out.printf("%.2f" , price);

    }
    private static void printCoke(double price) {
        price *= 1.40;
        System.out.printf("%.2f" ,price);

    }
    private static void printSnacks(double price) {
        price *= 2.00;
        System.out.printf("%.2f" ,price);

    }
}
