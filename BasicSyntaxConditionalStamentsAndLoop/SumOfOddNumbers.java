package BasicSyntaxConditionalStatementsAndLoopsLab;

import java.util.Scanner;

public class SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int sum = 0;
        int num = 1;
        for (int i = n; i > 0; i--) {
            sum += num;
            System.out.println(num);
            num += 2;
        }

        System.out.printf("Sum: %d", sum);

    }
}
