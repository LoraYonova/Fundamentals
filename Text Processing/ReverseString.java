package TextProcessing;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String line = scan.nextLine();

        while (!line.equals("end")) {

            StringBuilder reversed = new StringBuilder();
            for (int i = line.length() - 1; i >= 0 ; i--) {
                reversed.append(line.charAt(i));
            }

            System.out.printf("%s = %s%n", line, reversed.toString());




            line = scan.nextLine();
        }



    }
}