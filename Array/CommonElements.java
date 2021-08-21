package ArraysExercise;

import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String [] firstArrays = scan.nextLine().split("\\s+");

        String [] secondArrays = scan.nextLine().split("\\s+");


        for (int i = 0; i < secondArrays.length; i++) {

            for (int j = 0; j < firstArrays.length; j++) {

                if (secondArrays[i].equals(firstArrays[j])) {
                    System.out.print(secondArrays[i] + " ");
                }

            }

        }



    }
}
