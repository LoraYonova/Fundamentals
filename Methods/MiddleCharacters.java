package MethodsExercise;

import java.util.Scanner;

public class MiddleCharacters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String text = scan.nextLine();


        printMiddleCharacters(text);

    }

    private static void printMiddleCharacters(String text) {

        if (text.length() % 2 == 0) {
            char symbol1 = text.charAt((text.length() / 2) - 1);
            char symbol2 = text.charAt(text.length() / 2);
            System.out.printf("%c%c" , symbol1, symbol2);


        } else {
            char symbol2 = text.charAt(text.length() / 2);
            System.out.printf("%c" , symbol2);
        }


    }
}
