package MidExamRitake;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Problem3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> numberOfThePaintings = Arrays.stream(scan.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        String command = scan.nextLine();

        while (!command.equals("END")) {
            String[] type = command.split("\\s+");
            String firstCommand = type[0];

            if (firstCommand.equals("Change")) {
                int paintingNumber = Integer.parseInt(type[1]);
                int changedNumber = Integer.parseInt(type[2]);
                if (numberOfThePaintings.contains(paintingNumber)) {
                    int firstIndex = numberOfThePaintings.indexOf(paintingNumber);
                    numberOfThePaintings.set(firstIndex, changedNumber);
                }


            } else if (firstCommand.equals("Hide")) {

                int paintingNumber = Integer.parseInt(type[1]);
                if (numberOfThePaintings.contains(paintingNumber)) {

                    int index = numberOfThePaintings.indexOf(paintingNumber);
                    numberOfThePaintings.remove(index);
                }


            } else if (firstCommand.equals("Switch")) {

                int paintingNumber = Integer.parseInt(type[1]);
                int paintingNumber2 = Integer.parseInt(type[2]);

                if (numberOfThePaintings.contains(paintingNumber) && numberOfThePaintings.contains(paintingNumber2)) {
                    int first = numberOfThePaintings.indexOf(paintingNumber);
                    int second = numberOfThePaintings.indexOf(paintingNumber2);
                    numberOfThePaintings.set(first, paintingNumber2);
                    numberOfThePaintings.set(second, paintingNumber);
                }


            } else if (firstCommand.equals("Insert")) {
                int place = Integer.parseInt(type[1]);
                int paintingNumber = Integer.parseInt(type[2]);
                if (place + 1 < numberOfThePaintings.size()) {

                    numberOfThePaintings.add(place + 1, paintingNumber);

                }


            } else if (firstCommand.equals("Reverse")) {
                Collections.reverse(numberOfThePaintings);

            }


            command = scan.nextLine();
        }
        for (Integer painting : numberOfThePaintings) {
            System.out.print(painting + " ");
        }


    }
}
