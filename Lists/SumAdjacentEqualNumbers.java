package ListsLab;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SumAdjacentEqualNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Double> number = Arrays.stream(scan.nextLine().split(" "))
                .map(Double::parseDouble)
                .collect(Collectors.toList());


        for (int i = 0; i < number.size() - 1; i++) {

            if (number.get(i).equals(number.get(i + 1))) {
                double sum = number.get(i) + number.get(i + 1);
                number.set(i, sum);
                number.remove(i + 1);
                i = -1;
            }

        }


        DecimalFormat decimalFormat = new DecimalFormat("0.#");
        for (Double numbers : number) {
            System.out.print(decimalFormat.format(numbers) + " ");

        }


    }
}
