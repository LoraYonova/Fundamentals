package TextProcessing;

import java.util.Scanner;

public class CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] arguments = scan.nextLine().split("\\s+");

        String first = arguments[0];
        String second = arguments[1];
        int firstLength = first.length();
        int secondLength = second.length();

        long sum = 0;

        if (firstLength >= secondLength) {

            for (int i = 0; i < first.length(); i++) {

                if (secondLength <= i) {
                    sum += first.charAt(i);
                } else {

                    sum += (long) first.charAt(i) * second.charAt(i);
                }



            }
        } else {
            for (int i = 0; i < second.length(); i++) {

                if (firstLength <= i) {
                    sum += second.charAt(i);
                } else {

                    sum += (long) first.charAt(i) * second.charAt(i);
                }




            }
        }

        System.out.println(sum);

    }
}
