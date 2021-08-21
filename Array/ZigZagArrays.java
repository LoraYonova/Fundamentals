package ArraysExercise;

import java.util.Scanner;

public class ZigZagArrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        String [] firstArrays = new String[n];
        String [] secondArrays = new String[n];


        for (int i = 0; i < n; i++) {

            String [] number = scan.nextLine().split("\\s+");
            String first = number[0];
            String second = number[1];


            if ((i + 1) % 2 == 0) {
                secondArrays[i] = first;
                firstArrays[i] = second;

            } else {
                firstArrays[i] = first;
                secondArrays[i] = second;
            }

        }
        System.out.println(String.join(" " , firstArrays));
        System.out.println(String.join(" " , secondArrays));



    }
}
