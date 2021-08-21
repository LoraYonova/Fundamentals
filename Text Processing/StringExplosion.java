package TextProcessing;

import java.util.Scanner;

public class StringExplosion {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        StringBuilder result = new StringBuilder();
        int strength = 0;

        for (int i = 0; i < input.length(); i++) {

            char symbol = input.charAt(i);

            if (symbol == '>') {
                result.append(symbol);
                int nextSymbol = Integer.parseInt(String.valueOf(input.charAt(i + 1)));


                for (int j = 0; j < nextSymbol + strength; j++) {
                    if (input.charAt(i + 1) == '>') {
                        strength += nextSymbol - j;

                        break;
                    } else {

                        i++;
                    }

                }

            } else {
                result.append(symbol);
            }


        }
        System.out.println(result);


    }
}
