package DataTypesAndVariablesLab;

import java.util.Scanner;

public class LowerOrUpper {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String upperOrLower = scan.nextLine();


        String upper = upperOrLower.toUpperCase();


        if (upper.equals(upperOrLower)) {
            System.out.println("upper-case");
        } else {
            System.out.println("lower-case");
        }



    }
}
