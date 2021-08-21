package FinalExam;


import java.util.Scanner;

public class PasswordReset {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        String text = scan.nextLine();

        String input = scan.nextLine();

        StringBuilder newPassword = new StringBuilder();

        while (!input.equals("Done")) {

            String[] command = input.split("\\s+");
            String firstCommand = command[0];

            if (firstCommand.equals("TakeOdd")) {

                for (int i = 1; i < text.length(); i += 2) {
                    newPassword.append(text.charAt(i));
                }
                text = newPassword.toString();
                System.out.println(text);

            } else if (firstCommand.equals("Cut")) {

                int index = Integer.parseInt(command[1]);
                int length = Integer.parseInt(command[2]);

                text = new StringBuilder(text).delete(index, index + length).toString();

                System.out.println(text);


            } else if (firstCommand.equals("Substitute")) {
                String substring = command[1];
                String substitute = command[2];

                if (text.contains(substring)) {

                    text = text.replaceAll(substring, substitute);

                    System.out.println(text);

                } else {
                    System.out.println("Nothing to replace!");
                }

            }

            input = scan.nextLine();
        }

        System.out.println("Your password is: " + text);


    }
}
