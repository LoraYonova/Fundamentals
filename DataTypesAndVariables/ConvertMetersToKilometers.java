package DataTypesAndVariablesLab;

import java.util.Scanner;

public class ConvertMetersToKilometers {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            int meters = Integer.parseInt(scan.nextLine());

            double km = (double)meters / 1000;

            System.out.printf("%.2f", km);




        }
}
