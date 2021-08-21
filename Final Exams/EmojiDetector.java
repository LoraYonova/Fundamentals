package FinalExam;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmojiDetector {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        String regexName = "(?<separator>[\\\\:*])\\1(?<names>[A-Z][a-z]{2,})\\1\\1";
        String regexDigit = "(?<digit>\\d)";

        String text = scan.nextLine();

        List<String> emojis = new ArrayList<>();

        long sumDigit = 1;
        int countEmoji = 0;

        Pattern patternDigit = Pattern.compile(regexDigit);
        Matcher matcherDigit = patternDigit.matcher(text);
        while (matcherDigit.find()) {
            int digit = Integer.parseInt(matcherDigit.group("digit"));
            sumDigit *= digit;

        }

        Pattern patternName = Pattern.compile(regexName);
        Matcher matcherName = patternName.matcher(text);
        while (matcherName.find()) {
            String firstSeparator = matcherName.group("separator");
            String emoji = matcherName.group("names");
            String endSeparator = matcherName.group("separator");
            int sumOfEmoji = 0;
            countEmoji++;
            for (int i = 0; i < emoji.length(); i++) {

                int symbol = emoji.charAt(i);

                sumOfEmoji += symbol;

            }
            if (sumOfEmoji >= sumDigit) {
                String result = firstSeparator + firstSeparator + emoji + endSeparator + endSeparator;
                emojis.add(result);
            }

        }
        System.out.printf("Cool threshold: %d%n", sumDigit);

        System.out.printf("%d emojis found in the text. The cool ones are:%n", countEmoji);
        if (!emojis.isEmpty()) {

            for (String emoji : emojis) {
                System.out.println(emoji);

            }

        }

    }
}
