package FinalExam;

import java.util.Scanner;

public class SecretChat {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        StringBuilder concealedMessage = new StringBuilder(scan.nextLine());

        String input = scan.nextLine();

        while (!input.equals("Reveal")) {

            String[] command = input.split(":\\|:");

            String firstCommand = command[0];

            if (firstCommand.equals("ChangeAll")) {

                String substring = command[1];
                String replacement = command[2];

                concealedMessage = new StringBuilder(concealedMessage.toString().replaceAll(substring, replacement));

                System.out.println(concealedMessage);

            } else if (firstCommand.equals("Reverse")) {
                String substring = command[1];

                if (concealedMessage.toString().contains(substring)) {
                    int indexStart = concealedMessage.indexOf(substring);
                    int end = indexStart + substring.length();
                    concealedMessage.delete(indexStart, end);
                    StringBuilder reverseText = new StringBuilder(substring);

                    reverseText.reverse();
                    concealedMessage.append(reverseText);
                    System.out.println(concealedMessage);

                } else {
                    System.out.println("error");
                }
            } else if (firstCommand.equals("InsertSpace")) {
                int index = Integer.parseInt(command[1]);

                concealedMessage.insert(index, " ");

                System.out.println(concealedMessage);


            }


            input = scan.nextLine();
        }

        System.out.println("You have a new text message: " + concealedMessage);
    }
}
