package BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String username = scan.nextLine();
        String password = "";

        int counter = 0;
        for (int i = username.length() - 1; i >= 0 ; i--) {

            password += username.charAt(i);
        }


        while (counter < 4) {
            String input = scan.nextLine();
            if (input.equals(password)) {
                System.out.printf("User %s logged in." , username);
                return;
            } else if (counter < 3) {
                System.out.println("Incorrect password. Try again.");
            }
            counter++;
        }

        if (counter == 4) {
            System.out.printf("User %s blocked!", username);
        }
    }
}
