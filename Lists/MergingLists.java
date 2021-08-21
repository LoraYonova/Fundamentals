package ListsLab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MergingLists {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> firstNumber = Arrays.stream(scan.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> secondNumber = Arrays.stream(scan.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int size = Math.min(firstNumber.size(), secondNumber.size());


        for (int i = 0; i < size; i++) {
            System.out.print(firstNumber.get(i) + " " + secondNumber.get(i) + " ");


        }
        printTheRest(firstNumber, size);
        printTheRest(secondNumber, size);


    }

    private static void printTheRest(List<Integer> numbers, int beginIndex) {
        for (int i = beginIndex; i < numbers.size(); i++) {
            System.out.print(numbers.get(i) + " ");

        }
    }
}
