package FinalExam;


import java.util.Scanner;

public class ActivationKeys {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        StringBuilder activationKeys = new StringBuilder(scan.nextLine());

        String command = scan.nextLine();

        while (!command.equals("Generate")) {

            String[] commands = command.split(">>>");

            String firstCommand = commands[0];

            if (firstCommand.equals("Contains")) {

                String substring = commands[1];
                String toString = activationKeys.toString();

                if (toString.contains(substring)) {
                    System.out.println(activationKeys + " contains " + substring);
                } else {
                    System.out.println("Substring not found!");
                }


            } else if (firstCommand.equals("Slice")) {
                int startIndex = Integer.parseInt(commands[1]);
                int endIndex = Integer.parseInt(commands[2]);


                activationKeys.delete(startIndex, endIndex);

                System.out.println(activationKeys);

            } else if (firstCommand.equals("Flip")) {

                String upperOrLower = commands[1];
                int startIndex = Integer.parseInt(commands[2]);
                int endIndex = Integer.parseInt(commands[3]);


                if (upperOrLower.equals("Upper")) {
                    String upper = activationKeys.substring(startIndex, endIndex).toUpperCase();
                    activationKeys.replace(startIndex, endIndex, upper);

                    System.out.println(activationKeys);


                } else if (upperOrLower.equals("Lower")) {
                    String lower = activationKeys.substring(startIndex, endIndex).toLowerCase();
                    activationKeys.replace(startIndex, endIndex, lower);
                    System.out.println(activationKeys);
                }


            }


            command = scan.nextLine();
        }

        System.out.println("Your activation key is: " + activationKeys);


    }
}
