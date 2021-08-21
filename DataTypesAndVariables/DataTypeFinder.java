package DataTypesAndVariablesMoreExercise;

import java.util.Scanner;

public class DataTypeFinder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        String command = scan.nextLine();

        while (!command.equals("END")) {



                if (command.matches("([-+]?)[0-9]*")) {
                    System.out.printf("%s is integer type%n", command);

                } else if (command.matches("([-+]?)[0-9]*\\.([0-9]*)?")) {
                    System.out.printf("%s is floating point type%n" , command);

                } else if (command.length() == 1) {
                    System.out.printf("%s is character type%n" , command);

                } else if (command.equalsIgnoreCase("true") || command.equalsIgnoreCase("false")) {
                    System.out.printf("%s is boolean type%n" , command);

                } else {
                    System.out.printf("%s is string type%n", command);
                }



                command = scan.nextLine();



        }
    }
}