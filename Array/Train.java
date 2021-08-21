package ArraysExercise;

import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        int [] numberOfPeople = new int[n];

        int sum = 0;

        for (int i = 0; i < n; i++) {

            int people  = Integer.parseInt(scan.nextLine());

            sum += people;

            numberOfPeople[i] = people;


        }
        for (int numberOfPerson : numberOfPeople) {
            System.out.print(numberOfPerson + " ");


        }
        System.out.println();
        System.out.println(sum);



    }
}
