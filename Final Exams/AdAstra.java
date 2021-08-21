package FinalExam;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AdAstra {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String regex = "(?<separator>[\\|\\|#])(?<itemName>[A-Za-z\\s]+)\\1(?<date>\\d{2}\\/\\d{2}\\/\\d{2})\\1(?<calories>\\d{1,5})\\1";

        String input = scan.nextLine();

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        int needCaloriesDay = 2000;
        int sum = 0;

        List<String> name = new ArrayList<>();
        while (matcher.find()) {
            String itemName = matcher.group("itemName");
            String date = matcher.group("date");
            String calories = matcher.group("calories");


            name.add(String.format("Item: %s, Best before: %s, Nutrition: %s",
                    itemName, date, calories));


            sum += Integer.parseInt(calories);

        }

        System.out.printf("You have food to last you for: %d days!%n", sum / needCaloriesDay);

        name.forEach(System.out::println);



    }
}
