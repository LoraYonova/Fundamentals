package MidExamRitake;

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int journeyWillCost = Integer.parseInt(scan.nextLine());
        
        int numberOfMonth = Integer.parseInt(scan.nextLine());
        double sum = 0;

        for (int i = 1; i <= numberOfMonth; i++) {

            if (i % 4 == 0) {
                double bonus = sum * 0.25;
                sum += bonus;
            }


            if (i % 2 != 0 && i != 1) {
                double result = sum * 0.16;
                sum += (journeyWillCost * 0.25) - result;

            } else {

                sum += journeyWillCost * 0.25;
            }


        }
        if (sum >= journeyWillCost) {
            System.out.printf("Bravo! You can go to Disneyland and you will have %.2flv. for souvenirs.%n", sum - journeyWillCost);
        } else {
            System.out.printf("Sorry. You need %.2flv. more.%n", journeyWillCost - sum);
        }
    }
}
