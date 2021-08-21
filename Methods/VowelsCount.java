package MethodsExercise;

import java.util.Scanner;

public class VowelsCount {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String vowels = scan.nextLine().toLowerCase();
        int result = countVowels(vowels);
        System.out.println(result);

    }
    private static int countVowels(String vowels) {
        int count = 0;

        for (int i = 0; i < vowels.length(); i++) {
            char vowel = vowels.charAt(i);

            if (vowel == 'a') {
                count++;
            } else if (vowel == 'o') {
                count++;
            } else if (vowel == 'e') {
                count++;
            } else if (vowel == 'i') {
                count++;
            } else if (vowel == 'u') {
                count++;
            }

        }
        return count;

    }
}
