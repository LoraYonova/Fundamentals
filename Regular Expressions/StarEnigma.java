package RegularExpressions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StarEnigma {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numberOfMassages = Integer.parseInt(scan.nextLine());


        List<String> attackedPlanet = new ArrayList<>();
        int countAttack = 0;
        List<String> destroyedPlanet = new ArrayList<>();
        int countDestroyed = 0;

        for (int i = 0; i < numberOfMassages; i++) {
            int count = 0;
            String encryptedText = scan.nextLine();

            for (int j = 0; j < encryptedText.length(); j++) {

                if (encryptedText.charAt(j) == 'S' || encryptedText.charAt(j) == 'T' || encryptedText.charAt(j) == 'A' || encryptedText.charAt(j) == 'R'
                        || encryptedText.charAt(j) == 's' || encryptedText.charAt(j) == 't' || encryptedText.charAt(j) == 'a' || encryptedText.charAt(j) == 'r') {
                    count++;
                }

            }
            StringBuilder decrypt = new StringBuilder();

            for (int j = 0; j < encryptedText.length(); j++) {

                char symbol = encryptedText.charAt(j);
                char newSymbol = (char) (symbol - count);
                decrypt.append(newSymbol);


            }

            String regex = "@(?<namePlanet>[A-Za-z]+)[^@\\-!:>]*:(?<planetPopulation>[0-9]+)[^@\\-!:>]*!(?<attackType>[AD])![^@\\-!:>]*->(?<soldierCount>[0-9]+)";

            Pattern pattern = Pattern.compile(regex);

            Matcher matcher = pattern.matcher(decrypt);

            if (matcher.find()) {
                String namePlanet = matcher.group("namePlanet");

                String attackType = matcher.group("attackType");


                if (attackType.equals("A")) {
                    attackedPlanet.add(namePlanet);
                    countAttack++;

                } else if (attackType.equals("D")) {
                    destroyedPlanet.add(namePlanet);
                    countDestroyed++;
                }
            }


        }
        System.out.printf("Attacked planets: %d%n", countAttack);
        if (!attackedPlanet.isEmpty()) {

            attackedPlanet.stream().sorted(String::compareTo).forEach(e -> System.out.println("-> " + e));
        }
        System.out.printf("Destroyed planets: %d%n", countDestroyed);
        if (!destroyedPlanet.isEmpty()) {

            destroyedPlanet.stream().sorted(String::compareTo).forEach(e -> System.out.println("-> " + e));
        }


    }
}
