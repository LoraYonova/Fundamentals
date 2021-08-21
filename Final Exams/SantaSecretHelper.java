package FinalExam;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SantaSecretHelper {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        int n = Integer.parseInt(scan.nextLine());

        String input = scan.nextLine();
        StringBuilder decrypt = new StringBuilder();

        while (!input.equals("end")) {

            for (int i = 0; i < input.length(); i++) {
                char symbol = input.charAt(i);
                symbol -= n;
                decrypt.append(symbol);
            }


            input = scan.nextLine();
        }
        String regex = "@(?<name>[A-Za-z]+)(?<separator>[^@\\-!:>]+)!(?<behavior>[GN])!";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(decrypt);
        while (matcher.find()) {
            String name = matcher.group("name");
            String behavior = matcher.group("behavior");
            if (behavior.equals("G")) {
                System.out.println(name);
            }
        }

    }
}
