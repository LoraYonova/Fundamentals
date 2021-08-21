package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class IntegerOperations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scan.nextLine());
        int secondNumber = Integer.parseInt(scan.nextLine());
        int thirdNumber = Integer.parseInt(scan.nextLine());
        int fourthNumber = Integer.parseInt(scan.nextLine());



        int firstAndSecond = firstNumber + secondNumber;
        double divide = Math.floor((double)firstAndSecond / thirdNumber);
        double multiply = divide * fourthNumber;


        System.out.printf("%.0f" ,Math.floor(multiply));




    }
}
