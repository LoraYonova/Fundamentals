package FinalExam;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FancyBarcodes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String regexBarcode = "@#+(?<barcode>[A-Z][A-Za-z\\d]{4,}[A-Z])@#+";
        String regexDigit = "(?<digit>\\d)";
        int n = Integer.parseInt(scan.nextLine());


        for (int i = 0; i < n; i++) {
            String input = scan.nextLine();

            boolean isFindDigit = false;

            Pattern patternBarcode = Pattern.compile(regexBarcode);
            Matcher matcherBarcode = patternBarcode.matcher(input);

            if (matcherBarcode.find()) {

                Pattern patternDigit = Pattern.compile(regexDigit);
                Matcher matcherDigit = patternDigit.matcher(input);
                StringBuilder digitConcat = new StringBuilder();
                while (matcherDigit.find()) {
                    String digit = matcherDigit.group("digit");
                    digitConcat.append(digit);
                    isFindDigit = true;


                }

                if (isFindDigit) {
                    System.out.println("Product group: " + digitConcat);
                } else {

                    System.out.println("Product group: 00");
                }


            } else {
                System.out.println("Invalid barcode");
            }

        }


    }
}
