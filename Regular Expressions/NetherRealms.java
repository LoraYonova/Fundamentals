package RegularExpressions;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NetherRealms {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] demonName = scan.nextLine().split(",\\s*");

        String regexName = "(?<name>[^0-9\\+\\-\\*\\/\\.]+)";

        Pattern patternName = Pattern.compile(regexName);

        Map<String, List<Double>> demonResult = new TreeMap<>();

        for (int i = 0; i < demonName.length; i++) {
            String name = demonName[i].replaceAll(" ", "");
            Matcher matcherName = patternName.matcher(name);

            double demonTotalHealth = 0;
            while (matcherName.find()) {
                String result = matcherName.group("name");
                for (int j = 0; j < result.length(); j++) {

                    demonTotalHealth += result.charAt(j);

                }
            }
                demonResult.put(name, new ArrayList<>());
                demonResult.get(name).add(demonTotalHealth);

                String regexDigit = "(?<digit>(?:\\+|-)?[0-9]+(?:\\.[0-9]+)?)";
                Pattern patternDigit = Pattern.compile(regexDigit);
                Matcher matcherDigit = patternDigit.matcher(name);
                double resultSum = 0;
                while (matcherDigit.find()) {

                    double digit = Double.parseDouble(matcherDigit.group("digit"));

                    resultSum += digit;

                }

            for (int j = 0; j < name.length(); j++) {

                char symbol = name.charAt(j);
                if(symbol == '*') {
                    resultSum *= 2;
                } else if (symbol == '/') {
                    resultSum /= 2;
                }

            }

                demonResult.get(name).add(1,resultSum);

        }

        demonResult.forEach((key, value) -> System.out.printf("%s - %.0f health, %.2f damage%n", key, value.get(0), value.get(1)));


    }
}
