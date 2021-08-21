package FinalExam;

import java.util.Scanner;

public class TheImitationGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        StringBuilder message = new StringBuilder(scan.nextLine());
        String input = scan.nextLine();

        while (!input.equals("Decode")) {
            String[] commands = input.split("\\|");
            String command = commands[0];

            if (command.equals("ChangeAll")) {
                String oldElement = commands[1];
                String newElement = commands[2];

                String replace = message.toString().replace(oldElement,newElement);
                message = new StringBuilder(replace);

            } else if (command.equals("Insert")) {
                int index = Integer.parseInt(commands[1]);
                String insertIndex = commands[2];

                message.insert(index,insertIndex);




            } else if (command.equals("Move")) {
                int numberOfLetters = Integer.parseInt(commands[1]);

                String  result = message.substring(0,numberOfLetters);

               message.delete(0,numberOfLetters);
               message.append(result);

                }






            input = scan.nextLine();
        }

        System.out.println("The decrypted message is: " + message);



    }
}
