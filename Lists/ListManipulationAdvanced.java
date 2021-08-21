package ListsLab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        List<Integer> numbers = Arrays.stream(scan.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());


        String [] command = scan.nextLine().split(" ");

        while (true) {

            String first = command[0];

            if (first.equals("end")) {
                break;
            }
            String second = command[1];


            if (first.equals("Contains")) {
                printContainsNumber(second, numbers);

            } else if (first.equals("Print") && second.equals("even")) {
                printEvenSum(numbers);

            } else if (first.equals("Print") && second.equals("odd")) {
                printOddSum(numbers);

            } else if (first.equals("Get") && second.equals("sum")) {
                printGetSum(numbers);

            } else if (first.equals("Filter")) {

                if (second.equals(">=")) {
                    printBiggerOrEqual(numbers, command);

                } else if (second.equals("<=")) {
                    printLessOrEqual(numbers,command);

                } else if (second.equals(">")) {
                    printLarger(numbers,command);

                } else if (second.equals("<")) {
                    printLittle(numbers, command);
                }

            }

            command = scan.nextLine().split(" ");
        }



    }

    private static void printContainsNumber(String second , List<Integer> numbers) {

        if (numbers.contains(Integer.parseInt(second))) {
            System.out.println("Yes");
        } else {
            System.out.println("No such number");
        }

    }

    private static void printEvenSum(List<Integer> numbers) {

        for (int i = 0; i < numbers.size(); i++) {

            if (numbers.get(i) % 2 == 0) {
                System.out.print(numbers.get(i) + " ");
            }

        }
        System.out.println();

    }

    private static void printOddSum(List<Integer> numbers) {

        for (int i = 0; i < numbers.size(); i++) {

            if (numbers.get(i) % 2 != 0) {
                System.out.print(numbers.get(i) + " ");
            }

        }
        System.out.println();
    }

    private static void printGetSum(List<Integer> numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.size(); i++) {

            sum += numbers.get(i);

        }
        System.out.println(sum);

    }
    private static void printBiggerOrEqual(List<Integer> numbers, String[] command) {
        String third = command[2];

        for (int i = 0; i < numbers.size(); i++) {

            if (numbers.get(i) >= Integer.parseInt(third)) {
                System.out.print(numbers.get(i) + " ");
            }

        }
        System.out.println();
    }

    private static void printLessOrEqual(List<Integer> numbers, String[] command) {
        String third = command[2];

        for (int i = 0; i < numbers.size(); i++) {

            if (numbers.get(i) <= Integer.parseInt(third)) {
                System.out.print(numbers.get(i) + " ");
            }

        }
        System.out.println();


    }

    private static void printLarger(List<Integer> numbers, String[] command) {

        String third = command[2];

        for (int i = 0; i < numbers.size(); i++) {

            if (numbers.get(i) > Integer.parseInt(third)) {
                System.out.print(numbers.get(i) + " ");
            }

        }
        System.out.println();


    }

    private static void printLittle(List<Integer> numbers, String[] command) {

        String third = command[2];

        for (int i = 0; i < numbers.size(); i++) {

            if (numbers.get(i) < Integer.parseInt(third)) {
                System.out.print(numbers.get(i) + " ");
            }

        }
        System.out.println();

    }
}
