package TextProcessing;

import java.util.Scanner;

public class CaesarCipher {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String text = scan.nextLine();

        StringBuilder encryptedText = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {

            char symbol = text.charAt(i);
            char newSymbol = (char) (symbol + 3);
            encryptedText.append(newSymbol);

        }
        System.out.println(encryptedText);



    }
}
