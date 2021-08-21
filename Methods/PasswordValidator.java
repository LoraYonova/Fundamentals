package MethodsExercise;

import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String pass = scan.nextLine();
        int countLetters = 0;
        int countDigit = 0;
        int countSign = 0;

        int letters = passMustBe6And10Characters(pass, countLetters);
        int digit = passMustHave2Digit(pass, countDigit);
        int sign = passMustConsistLettersAndDigit(pass,countSign);


        if (letters >= 6 && letters <= 10 && digit >= 2 && sign == 0) {
            System.out.println("Password is valid");
        }
        if ((letters < 6 || letters > 10) && sign == 0) {
            System.out.println("Password must be between 6 and 10 characters");
        }
        if (sign > 0) {
            System.out.println("Password must consist only of letters and digits");
        }
        if (digit < 2) {
            System.out.println("Password must have at least 2 digits");
        }


    }



    private static int passMustBe6And10Characters(String pass, int countLetters) {

        for (int i = 0; i < pass.length(); i++) {

            char symbol = pass.charAt(i);

            if ((symbol >= 65 && symbol <= 90) || (symbol >= 97 && symbol <= 122)) {
                countLetters++;
            }
        }

        return countLetters;
    }


    private static int passMustHave2Digit(String pass, int countDigit) {
        for (int i = 0; i < pass.length(); i++) {
            char symbol = pass.charAt(i);

            if (symbol >= 48 && symbol <= 57) {
                countDigit++;

            }
        }

        return countDigit;
    }


    private static int passMustConsistLettersAndDigit(String pass, int countSign) {

        for (int i = 0; i < pass.length(); i++) {
            char symbol = pass.charAt(i);

            if (!(symbol >= 65 && symbol <= 90 || symbol >= 97 && symbol <= 122 || symbol >= 48 && symbol <= 57)) {
                countSign++;
            }
        }

        return countSign;
    }
}
