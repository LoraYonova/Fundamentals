package Final;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        String regex = "(?<separator>[U\\$]+)(?<name>[A-Z][a-z]{2,})\\1(?<separatorPas>[P@\\$]+)(?<password>[A-Z]*[a-z]{5,}\\d+)\\3";
        int successful = 0;
        for (int i = 0; i < n; i++) {

            String input = scan.nextLine();



            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(input);

            if (matcher.find()) {
                successful++;
                String name = matcher.group("name");
                String password = matcher.group("password");
                System.out.println("Registration was successful");
                System.out.printf("Username: %s, Password: %s%n", name, password);
            } else {
                System.out.println("Invalid username or password");
            }


        }
        System.out.println("Successful registrations: " + successful);


    }
}
