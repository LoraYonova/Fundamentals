package BasicSyntaxConditionalStatementsAndLoopsLab;

import java.util.Scanner;

public class MultiplicationTable2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int x = Integer.parseInt(scan.nextLine());
        int result = 0;



        if (x > 10) {
            result = n * x;
            System.out.printf("%d X %d = %d%n", n, x, result);
        }

        for (int i = x; i <= 10; i++) {

            result = n * x;
            System.out.printf("%d X %d = %d%n", n, x, result);
            x++;

        }

    }
}
