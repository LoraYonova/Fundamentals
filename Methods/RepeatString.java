package MethodsLab;

import java.util.Scanner;

public class RepeatString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String repeat = scan.nextLine();
        int number = Integer.parseInt(scan.nextLine());

        repeatString(repeat, number);


    }
    private static String repeatString(String str, int count) {
        String result = "";
        for (int i = 0; i < count; i++) {
            result = str;
            System.out.print(result);

        }
        return result;
    }
}
