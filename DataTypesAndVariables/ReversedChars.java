package DataTypesAndVariablesLab;

import java.util.Scanner;

public class ReversedChars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        char firstLetter = scan.nextLine().charAt(0);
        char secondLetter = scan.nextLine().charAt(0);
        char thirdLetter = scan.nextLine().charAt(0);

        System.out.printf("%c %c %c", thirdLetter, secondLetter, firstLetter);


    }
}
