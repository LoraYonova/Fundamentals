package MidExamRitake;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Problem2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        String[] input = scan.nextLine().split("\\|");
        double budget = Double.parseDouble(scan.nextLine());
        double allSum = budget;

        List<Double> newPrice = new ArrayList<>();

        for (int i = 0; i < input.length; i++) {

            String[] command = input[i].split("->");
            String type = command[0];
            double maxPrice = Double.parseDouble(command[1]);

            if (type.equals("Clothes") && maxPrice <= 50) {
                if (allSum >= maxPrice) {
                    newPrice.add(maxPrice);
                    allSum -= maxPrice;

                }


            } else if (type.equals("Shoes") && maxPrice <= 35) {
                if (allSum >= maxPrice) {
                    newPrice.add(maxPrice);
                    allSum -= maxPrice;
                }


            } else if (type.equals("Accessories") && maxPrice <= 20.50) {
                if (allSum >= maxPrice) {
                    newPrice.add(maxPrice);
                    allSum -= maxPrice;

                }
            }

        }
        double profit = 0;
        for (int i = 0; i < newPrice.size(); i++) {
            double oldPrice = newPrice.get(i);
            double result = newPrice.get(i) * 0.40;
            newPrice.set(i,oldPrice + result);
            profit += result;

        }
        double forTicket = 0;
        for (Double aDouble : newPrice) {
            System.out.printf("%.2f ", aDouble);
            forTicket += aDouble;

        }
        System.out.println();
        System.out.printf("Profit: %.2f%n", profit);

        forTicket += allSum;

        if (forTicket >= 150) {
            System.out.println("Hello, France!");

        } else {
            System.out.println("Not enough money.");
        }



    }
}
