package FinalExam;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MirrorWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String regex = "(?<separator>[@|#])(?<firstWord>[A-Za-z]{3,})\\1\\1(?<secondWord>[A-Za-z]{3,})\\1";

        String text = scan.nextLine();

        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(text);

        Map<String, String> mirrorWord = new LinkedHashMap<>();
        int countValid = 0;

        while (matcher.find()) {
            countValid++;
            String firstWord = matcher.group("firstWord");
            String secondWord = matcher.group("secondWord");
            StringBuilder wordReverse = new StringBuilder(secondWord);
            wordReverse.reverse();


            if(firstWord.contentEquals(wordReverse)) {
                mirrorWord.put(firstWord,secondWord);
            }

        }
        if (countValid > 0) {
            System.out.printf("%d word pairs found!%n", countValid);
        } else {
            System.out.println("No word pairs found!");
        }

        if (!mirrorWord.isEmpty()) {
            System.out.println("The mirror words are:");
            int count = 0;
            for (Map.Entry<String, String> entry : mirrorWord.entrySet()) {
                System.out.print(entry.getKey() + " <=> " + entry.getValue());
                count++;

                if (count < mirrorWord.size()) {
                    System.out.print(", ");
                }

            }
            System.out.println();
        } else {
            System.out.println("No mirror words!");
        }



    }
}
