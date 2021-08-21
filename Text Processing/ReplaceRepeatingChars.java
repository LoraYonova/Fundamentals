package TextProcessing;

import java.util.Scanner;

public class ReplaceRepeatingChars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String text = scan.nextLine();

        StringBuilder newText = new StringBuilder();


        for (int i = 0; i < text.length(); i++) {
            if (i == 0) {
                newText.append(text.charAt(i));
            } else {
                char symbol = text.charAt(i);

                if (symbol != newText.charAt(newText.length() - 1)) {

                    newText.append(text.charAt(i));
                }


            }

        }

        System.out.println(newText);


    }
}
