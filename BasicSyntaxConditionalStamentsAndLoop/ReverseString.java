package BasicSyntaxConditionalStatementsAndLoopsMoreExercise;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String world = scan.nextLine();

        for (int i = world.length(); i > 0; i--) {
            char symbol = world.charAt(i - 1);

            System.out.print(symbol);
        }


    }
}
