package FinalExam;

import java.util.*;
import java.util.stream.Stream;

public class Pirates {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String cities = scan.nextLine();

        Map<String, List<Integer>> information = new LinkedHashMap<>();


        while (!cities.equals("Sail")) {
            String[] citiesGoldPopulation = cities.split("\\|\\|");

            String city = citiesGoldPopulation[0];
            int population = Integer.parseInt(citiesGoldPopulation[1]);
            int gold = Integer.parseInt(citiesGoldPopulation[2]);

            if (information.containsKey(city)) {
                List<Integer> currentCityData = information.get(city);
                int currentCityPopulation = currentCityData.get(0);
                int currentCityGold = currentCityData.get(1);
                currentCityData.set(0, currentCityPopulation + population);
                currentCityData.set(1, currentCityGold + gold);
                information.put(city, currentCityData);

            } else {
                information.put(city, Arrays.asList(population, gold));
            }

            cities = scan.nextLine();

        }
        cities = scan.nextLine();

        while (!cities.equals("End")) {
            String[] command = cities.split("=>");

            String firstCommand = command[0];
            String city = command[1];

            if (firstCommand.equals("Plunder")) {
                int people = Integer.parseInt(command[2]);
                int gold = Integer.parseInt(command[3]);

                if (information.containsKey(city)) {
                    List<Integer> currentCity = information.get(city);
                    int currentCityPeople = currentCity.get(0);
                    int currentGold = currentCity.get(1);
                    currentCity.set(0, currentCityPeople - people);
                    currentCity.set(1, currentGold - gold);
                    information.put(city, currentCity);

                    if (!(currentCity.get(0) > 0 && currentCity.get(1) > 0)) {
                        information.remove(city);
                        System.out.printf("%s plundered! %d gold stolen, %d citizens killed.%n", city, gold, people);
                        System.out.printf("%s has been wiped off the map!%n", city);

                    } else {
                        System.out.printf("%s plundered! %d gold stolen, %d citizens killed.%n", city, gold, people);

                    }


                }
            } else if (firstCommand.equals("Prosper")) {
                int gold = Integer.parseInt(command[2]);

                if (gold < 0) {
                    System.out.println("Gold added cannot be a negative number!");
                    cities = scan.nextLine();
                    continue;
                }

                if (information.containsKey(city)) {
                    List<Integer> currentCity = information.get(city);
                    int currentGold = currentCity.get(1);
                    currentCity.set(1, currentGold + gold);
                    information.put(city, currentCity);
                    String result = currentCity.get(1).toString().replaceAll("[\\[\\],]", "");
                    int totalGold = Integer.parseInt(result);
                    System.out.printf("%d gold added to the city treasury. %s now has %d gold.%n", gold, city, totalGold);

                }


            }


            cities = scan.nextLine();
        }

        if (information.isEmpty()) {

            System.out.println("Ahoy, Captain! All targets have been plundered and destroyed!");
        } else {

            information.entrySet().stream().sorted((left, right) -> {
                int result = right.getValue().get(1).compareTo(left.getValue().get(1));
                if (result == 0) {
                    result = left.getKey().compareTo(right.getKey());
                }
                return result;
            }).forEach(entry -> System.out.printf("%s -> Population: %d citizens, Gold: %d kg%n" , entry.getKey(), entry.getValue().get(0), entry.getValue().get(1)));


        }
    }


}

