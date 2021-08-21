package TextProcessing;

import java.util.Scanner;

public class TextFilter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] forbiddenWord = scan.nextLine().split(", ");
        String text = scan.nextLine();

        for (String forbiddenWords : forbiddenWord) {
            String wordOfStart = convertWordToStart(forbiddenWords);
            text = text.replace(forbiddenWords, wordOfStart);

        }

        System.out.println(text);





    }

    private static String convertWordToStart(String forbiddenWords) {
        StringBuilder wordOfStart = new StringBuilder();
        for (int i = 0; i < forbiddenWords.length(); i++) {

            wordOfStart.append("*");

        }
        return wordOfStart.toString();
    }
}
