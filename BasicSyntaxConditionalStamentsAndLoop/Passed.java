package BasicSyntaxConditionalStatementsAndLoopsLab;

import java.util.Scanner;

public class Passed {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double input = Double.parseDouble(scan.nextLine());

        if (input >= 3.00) {
            System.out.println("Passed!");
        }


    }
}
