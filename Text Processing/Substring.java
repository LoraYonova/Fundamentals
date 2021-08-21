package TextProcessing;

import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String wordToRemove = scan.nextLine();
        String input = scan.nextLine();


        while (input.contains(wordToRemove)) {
            input = input.replace(wordToRemove, "");
        }

        System.out.println(input);




    }
}
