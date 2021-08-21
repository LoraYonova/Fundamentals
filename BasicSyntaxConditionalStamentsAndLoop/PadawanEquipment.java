package BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class PadawanEquipment {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double money = Double.parseDouble(scan.nextLine());
        int countStudents = Integer.parseInt(scan.nextLine());
        double priceOfLightSabers = Double.parseDouble(scan.nextLine());
        double priceOfRobes = Double.parseDouble(scan.nextLine());
        double priceOfBelts = Double.parseDouble(scan.nextLine());

        double neededEquipment = priceOfLightSabers *  Math.ceil(countStudents +(countStudents * 0.1)) + (priceOfRobes * countStudents) + (priceOfBelts * countStudents);

        if (countStudents >= 6) {
            countStudents /= 6;
            neededEquipment -= countStudents * priceOfBelts;
        }

        if (money >= neededEquipment) {
            System.out.printf("The money is enough - it would cost %.2flv." , neededEquipment);

        } else {
            System.out.printf("George Lucas will need %.2flv more." , neededEquipment - money);
        }



    }
}
