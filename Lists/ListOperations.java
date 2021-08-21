package ListsExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scan.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        String command = scan.nextLine();


        while (!command.equals("End")) {

            String [] commands = command.split("\\s+");
            String first = commands[0];
            String second = commands[1];

            if (first.equals("Add")) {
                numbers.add(Integer.parseInt(second));

            } else if (first.equals("Insert")) {
                int third = Integer.parseInt(commands[2]);
                if (third > numbers.size() || third < 0) {
                    System.out.println("Invalid index");
                } else {

                    numbers.add(third,Integer.parseInt( second));
                }

            } else if (first.equals("Remove")) {
                int index = Integer.parseInt(second);
                if (index > numbers.size() || index < 0) {
                    System.out.println("Invalid index");
                } else {
                    numbers.remove(index);
                }


            } else if (first.equals("Shift")) {
                int count = Integer.parseInt(commands[2]);
                int counter = 0;
                if (second.equals("left")) {
                    for (int i = 0; i < count; i++) {
                        counter++;
                        numbers.add(numbers.get(i));
                        numbers.remove(numbers.get(i));
                        i--;
                        if (count == counter) {
                            break;
                        }


                    }
                } else if (second.equals("right")) {

                    for (int i = 0; i < count; i++) {
                        counter++;
                        int result = numbers.get(numbers.size() -1);
                        numbers.add(i , result);
                        numbers.remove(numbers.size() - 1);
                        i--;
                        if (count == counter) {
                            break;
                        }



                    }
                }
            }

            command = scan.nextLine();
        }

        System.out.print(numbers.toString().replaceAll("[\\[\\],]" , ""));





    }
}
