package ListsLab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationBasics {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        List<Integer> number = Arrays.stream(scan.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());


        List<String> command = Arrays.asList(scan.nextLine().split(" "));


        String  commands = command.get(0);



        while (!commands.equals("end")) {
            String first = command.get(1);

            if (commands.equals("Add")) {
                number.add(Integer.parseInt(first));
            } else if (commands.equals("Remove")) {
                number.remove(Integer.valueOf(first));
            } else if (commands.equals("RemoveAt")) {
                number.remove(Integer.parseInt(first));
            } else if (commands.equals("Insert")) {
                String second = command.get(2);
                number.add(Integer.parseInt(second), Integer.parseInt(first));

            }

            command = Arrays.asList(scan.nextLine().split(" "));
            commands = command.get(0);

        }

        System.out.print(number.toString().replaceAll("[\\[\\],]", ""));


    }
}
