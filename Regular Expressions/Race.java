package RegularExpressions;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Race {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String regexName = "[A-Za-z]";
        String regexDigit = "[0-9]";

        List<String> name = Arrays.stream(scan.nextLine().split(",\\s+")).collect(Collectors.toList());

        Map<String, Integer> races = new LinkedHashMap<>();

        name.forEach(racer -> races.put(racer,0));

        String input = scan.nextLine();

        Pattern patternLetter = Pattern.compile(regexName);
        Pattern patternDigit = Pattern.compile(regexDigit);


        while (!input.equals("end of race")) {

            StringBuilder nameRace = new StringBuilder();
            Matcher matcherName = patternLetter.matcher(input);

            while (matcherName.find()) {
                nameRace.append(matcherName.group());
            }
            int distance = 0;
            Matcher matcherDigit = patternDigit.matcher(input);
            while (matcherDigit.find()) {
                distance += Integer.parseInt(matcherDigit.group());
            }
            String nameRacer = nameRace.toString();
            if (races.containsKey(nameRacer)) {
                int currentDistance = races.get(nameRacer);
                races.put(nameRacer,currentDistance + distance);

            }


            input = scan.nextLine();
        }

        List<String> firstTreeNames = races.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .limit(3)
                .map(entry -> entry.getKey())
                .collect(Collectors.toList());




        System.out.println("1st place: " + firstTreeNames.get(0));
        System.out.println("2nd place: " + firstTreeNames.get(1));
        System.out.println("3rd place: " + firstTreeNames.get(2));

    }
}
