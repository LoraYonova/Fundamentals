package FinalExam;

import java.util.Scanner;

public class WorldTour {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        StringBuilder stops = new StringBuilder(scan.nextLine());

        String input = scan.nextLine();

        while (!input.equals("Travel")) {
            String[] token = input.split(":");
            String command = token[0];

            if (command.equals("Add Stop")) {
                int index = Integer.parseInt(token[1]);
                String country = token[2];

                if (index >= 0 && index < stops.length()) {
                    stops.insert(index, country);
                    System.out.println(stops);
                }

            } else if (command.equals("Remove Stop")) {
                int startIndex = Integer.parseInt(token[1]);
                int endIndex = Integer.parseInt(token[2]);

                if (startIndex >= 0 && startIndex < stops.length() && endIndex >= 0 && endIndex < stops.length()) {
                    stops.delete(startIndex, endIndex + 1);
                }
                System.out.println(stops);


            } else if (command.equals("Switch")) {
                String oldStop = token[1];
                String newStop = token[2];

                String destinationAsString = stops.toString();
                destinationAsString = destinationAsString.replaceAll(oldStop,newStop);
                stops = new StringBuilder(destinationAsString);
                System.out.println(stops);


            }


            input = scan.nextLine();
        }
        System.out.println("Ready for world tour! Planned stops: " + stops);

    }
}
