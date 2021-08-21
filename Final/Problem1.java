package Final;

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        StringBuilder text = new StringBuilder(scan.nextLine());
        String input = scan.nextLine();

        while (!input.equals("End")) {

            String[] commands = input.split("\\s+");
            String command = commands[0];

            if (command.equals("Translate")) {
                String element = commands[1];
                String replacement = commands[2];

              text  = new StringBuilder(text.toString().replace(element,replacement));


                System.out.println(text);

            } else if (command.equals("Includes")) {
                String includes = commands[1];

                if (text.toString().contains(includes)) {
                    System.out.println("True");
                } else {
                    System.out.println("False");
                }

            } else if (command.equals("Start")) {
                String start = commands[1];
                String result = "";
                result = text.substring(0,start.length());

               if (result.equals(start)) {
                   System.out.println("True");
               } else {
                   System.out.println("False");
               }


            } else if (command.equals("Lowercase")) {
                text = new StringBuilder(text.toString().toLowerCase());
                System.out.println(text);

            } else if (command.equals("FindIndex")) {
                String element = commands[1];

               int result = text.lastIndexOf(element);
                System.out.println(result);

            } else if (command.equals("Remove")) {
                int startIndex = Integer.parseInt(commands[1]);
                int count = Integer.parseInt(commands[2]);
                int endIndex = count + startIndex;

                text = new StringBuilder(text.delete(startIndex,endIndex));
                System.out.println(text);

            }






            input = scan.nextLine();
        }




    }
}
