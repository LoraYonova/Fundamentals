package DataTypesAndVariablesLab;

import java.util.Scanner;

public class TownInfo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nameTown = scan.nextLine();
        int population = Integer.parseInt(scan.nextLine());
        double area = Double.parseDouble(scan.nextLine());

        System.out.printf("Town %s has population of %d and area %.0f square km.", nameTown, population, area);


    }
}
