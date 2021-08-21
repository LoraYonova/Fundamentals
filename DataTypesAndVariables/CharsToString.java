package DataTypesAndVariablesLab;

import java.util.Scanner;

public class CharsToString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String firstSymbol = scan.nextLine();
        String secondSymbol = scan.nextLine();
        String thirdSymbol = scan.nextLine();

        System.out.printf("%s%s%s", firstSymbol, secondSymbol, thirdSymbol);


    }
}
