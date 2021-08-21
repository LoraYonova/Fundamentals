package RegularExpressions;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SoftUniBarIncome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        String regex = "%(?<name>[A-Z][a-z]+)%[^.|$%]*<(?<product>\\w+)>[^.|$%]*\\|(?<count>\\d+)\\|[^.|$%0-9]*(?<price>[0-9]+.?[0-9]+)\\$";

        String input = scan.nextLine();


        Pattern pattern = Pattern.compile(regex);

        double sum = 0;
        while (!input.equals("end of shift")) {
            Matcher matcher = pattern.matcher(input);

            if (matcher.find()) {
                String name = matcher.group("name");
                String product = matcher.group("product");
                int count = Integer.parseInt(matcher.group("count"));
                double price = Double.parseDouble(matcher.group("price"));
                sum += count * price;

                System.out.printf("%s: %s - %.2f%n", name, product, count * price);
            }


            input = scan.nextLine();
        }

        System.out.printf("Total income: %.2f", sum);

    }
}
