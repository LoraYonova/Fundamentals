package ListsExercise;

import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

public class HouseParty {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int input = Integer.parseInt(scan.nextLine());

        List<String> guests = new ArrayList<>();


        for (int i = 0; i < input; i++) {
            String command = scan.nextLine();
            String[] commands = command.split("\\s+");
            String name = commands[0];
            String goingNot = commands[2];


            if (goingNot.equals("going!")) {
                if (guests.contains(name)) {
                    System.out.printf("%s is already in the list!%n", name);

                } else {
                    guests.add(name);

                }

            } else if (goingNot.equals("not")) {
                if (guests.contains(name)) {
                    guests.remove(name);

                } else {
                    System.out.printf("%s is not in the list!%n" , name);
                }
            }

        }

        for (String guest : guests) {
            System.out.println(guest);
        }


    }
}
