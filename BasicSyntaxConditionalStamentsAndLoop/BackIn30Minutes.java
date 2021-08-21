package BasicSyntaxConditionalStatementsAndLoopsLab;

import java.util.Scanner;

public class BackIn30Minutes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int hours = scan.nextInt();
        int minutes = scan.nextInt();

        minutes += 30;
        if (minutes >= 60) {
            minutes -= 60;
            hours++;
            if (hours >= 24) {
                hours -= 24;
            }
        }
        System.out.printf("%d:%02d%n" , hours , minutes);
    }
}
