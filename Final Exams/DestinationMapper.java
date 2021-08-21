package FinalExam;

import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DestinationMapper {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String regex = "(?<separator>[=|\\/])(?<word>[A-Z][A-Za-z]{2,})\\1";

        String text = scan.nextLine();

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        List<String> namesDestinations = new ArrayList<>();
        int sum = 0;
        while (matcher.find()) {
            String word = matcher.group("word");
            namesDestinations.add(word);
            int result = word.length();
            sum += result;

        }
       // int travelPoint = namesDestinations.stream().mapToInt(String::length).sum();
      String destinations = String.join(", ", namesDestinations);
        System.out.printf("Destinations: %s%n", destinations);
        System.out.printf("Travel Points: %d", sum);



    }
}
