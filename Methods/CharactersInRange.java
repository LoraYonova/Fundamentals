package MethodsExercise;

import java.util.Scanner;

public class CharactersInRange {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        char firstSymbol = scan.nextLine().charAt(0);
        char secondSymbol = scan.nextLine().charAt(0);

        printCharacters(firstSymbol, secondSymbol);
    }
    private static void printCharacters(char first, char second) {
        if (second < first) {
            for (char i = (char) (second + 1); i < first; i++) {
                System.out.print(i + " ");

            }
        }
        for (char i = (char) (first + 1); i < second ; i++) {
            System.out.print(i + " ");

        }
    }
}
