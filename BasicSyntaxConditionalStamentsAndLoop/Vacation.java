package BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int group = Integer.parseInt(scan.nextLine());
        String typeOfGroup = scan.nextLine();
        String day = scan.nextLine();
        double sum = 0;

        if (day.equals("Friday")) {
            if (typeOfGroup.equals("Students")) {
                sum = group * 8.45;
            } else if(typeOfGroup.equals("Business")) {
                sum = group * 10.90;
                if (group >= 100) {
                    group -= 10;
                    sum = group * 10.90;
                }
            } else if (typeOfGroup.equals("Regular")) {
                sum = group * 15;
            }
        } else if (day.equals("Saturday")) {
            if (typeOfGroup.equals("Students")) {
                sum = group * 9.80;
            } else if (typeOfGroup.equals("Business")) {
                sum = group * 15.60;
                if (group >= 100) {
                    group -= 10;
                    sum = group * 15.60;
                }
            } else if (typeOfGroup.equals("Regular")) {
                sum = group * 20;
            }
        } else if(day.equals("Sunday")) {
            if (typeOfGroup.equals("Students")) {
                sum = group * 10.46;
            } else if (typeOfGroup.equals("Business")) {
                sum = group * 16;
                if (group >= 100) {
                    group -= 10;
                    sum = group * 16;
                }
            } else if (typeOfGroup.equals("Regular")) {
                sum = group * 22.50;
            }
        }

        if (typeOfGroup.equals("Students") && group >= 30) {
            sum *= 0.85;
        }
        if (typeOfGroup.equals("Business") && group >= 100) {

            System.out.printf("Total price: %.2f" , sum);

        }
        if (typeOfGroup.equals("Regular") && (group >= 10 && group <= 20)) {
            sum *= 0.95;
        }
        System.out.printf("Total price: %.2f" , sum);
    }
}
