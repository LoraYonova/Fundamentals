package MethodsExercise;

import java.util.Scanner;

public class PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        while (!input.equals("END")) {
            System.out.println(palindromeInteger(input));


            input = scan.nextLine();
        }


    }

    private static String palindromeInteger(String input) {
        String output = "";
        String reversed = "";

        for (int i = input.length() - 1; i >= 0 ; i--) {
            reversed += input.charAt(i);

        }
        if (reversed.equals(input)) {
            output = "true";
        } else {
            output = "false";
        }

        return output;

    }
}
