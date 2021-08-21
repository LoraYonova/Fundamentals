package BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class RageExpenses {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int lostGameCount = Integer.parseInt(scan.nextLine());
        double headsetPrice = Double.parseDouble(scan.nextLine());
        double mousePrice = Double.parseDouble(scan.nextLine());
        double keyboardPrice = Double.parseDouble(scan.nextLine());
        double displayPrice = Double.parseDouble(scan.nextLine());


        double headSetCost = (lostGameCount / 2) * headsetPrice;
        double mouseCost = (lostGameCount / 3) * mousePrice;
        double keyboardCost = ( lostGameCount / 6 ) * keyboardPrice;
        double displayCost = (lostGameCount / 12) * displayPrice;
        double expenses = headSetCost + mouseCost + keyboardCost + displayCost;

        System.out.printf("Rage expenses: %.2f lv." , expenses);

    }
}
