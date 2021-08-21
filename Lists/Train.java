package ListsExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> wagons = Arrays.stream(scan.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        int maxCapacity = Integer.parseInt(scan.nextLine());

        String command = scan.nextLine();


        while (!command.equals("end")) {

            String [] token = command.split("\\s+");
            String first = token[0];

            if (first.equals("Add")) {
                String second = token[1];
                wagons.add(Integer.parseInt(second));

            } else {
                for (int i = 0; i < wagons.size(); i++) {
                    int sum = wagons.get(i) + Integer.parseInt(first);
                    if (maxCapacity >= sum) {
                        wagons.set(i, sum);
                        break;
                    }

                }
            }



            command = scan.nextLine();
        }

        System.out.print(wagons.toString().replaceAll("[\\[\\],]" , ""));


    }
}
