package ListsExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scan.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        String command = scan.nextLine();


        while (!command.equals("end")) {

            String [] commands = command.split("\\s+");
            String first = commands[0];
            int second = Integer.parseInt(commands[1]);

            if (first.equals("Delete")) {
                for (int i = 0; i < numbers.size(); i++) {

                    if (numbers.get(i) == second) {
                        numbers.remove(numbers.get(i));
                    }

                }

            } else if (first.equals("Insert")) {
                int third = Integer.parseInt(commands[2]);
                numbers.add(third, second);
            }





            command = scan.nextLine();
        }

        System.out.print(numbers.toString().replaceAll("[\\[\\],]" , ""));


    }
}
