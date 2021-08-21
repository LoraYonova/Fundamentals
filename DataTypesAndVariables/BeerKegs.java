package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class BeerKegs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        double maxKeg = Double.MIN_VALUE;
        String model = "";

        for (int i = 0; i < n; i++) {
            String models = scan.nextLine();
            double radius = Double.parseDouble(scan.nextLine());
            int height = Integer.parseInt(scan.nextLine());

            double volume = Math.PI * Math.pow(radius, 2) * height;

            if (maxKeg < volume) {
                maxKeg = volume;
                model = models;
            }

        }
        System.out.println(model);


    }
}
