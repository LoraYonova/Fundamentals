package TextProcessing;

import java.util.Scanner;

public class ValidUsernames {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] userNames = scan.nextLine().split(", ");

        boolean isValid = true;

        for (String userName : userNames) {
            if (isValidWord(userName)) {
                System.out.println(userName);
            }

        }


    }

    private static boolean isValidWord(String userName) {

        if (!(userName.length() >= 3 && userName.length() <= 16)) {
            return false;
        }
        for (char symbol : userName.toCharArray()) {
            if (!(Character.isLetterOrDigit(symbol) || symbol == '-' || symbol == '_')) {
                return false;
            }

        }
        return true;

    }
}
