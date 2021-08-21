package FinalExam;

import java.util.*;
import java.util.stream.Collectors;

public class PlantDiscovery {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int lines = Integer.parseInt(scan.nextLine());
        Map<String, Integer> rarities = new TreeMap<>();
        Map<String, List<Integer>> ratings = new TreeMap<>();
        while (lines-- > 0) {
            String[] info = scan.nextLine().split("<->");
            String plant = info[0];
            int rarity = Integer.parseInt(info[1]);
            rarities.put(plant, rarity);
            ratings.put(plant, new ArrayList<>());
        }
        String input = "";
        while (!(input = scan.nextLine()).equals("Exhibition")) {
            String[] commands = input.split(": ");
            String currPlant = commands[1].split(" - ")[0];
            switch (commands[0]) {
                case "Rate":
                    int rating = Integer.parseInt(commands[1].split(" - ")[1]);
                    if (ratings.containsKey(currPlant)) {
                        ratings.get(currPlant).add(rating);
                    } else {
                        System.out.println("error");
                    }
                    break;
                case "Update":
                    int newRarity = Integer.parseInt(commands[1].split(" - ")[1]);
                    if (ratings.containsKey(currPlant)) {
                        rarities.put(currPlant, newRarity);
                    } else {
                        System.out.println("error");
                    }
                    break;
                case "Reset":
                    if (ratings.containsKey(currPlant)) {
                        ratings.put(currPlant, new ArrayList<>());
                    } else {
                        System.out.println("error");
                    }
                    break;
                default:
                    System.out.println("error");
                    break;
            }
        }
        Map<String, Double> avgRatigns = new LinkedHashMap<>();
        ratings.forEach((k, v) -> avgRatigns.put(k, v.stream().mapToInt(e -> e).average().orElse(0.0)));

        System.out.println("Plants for the exhibition:");
        rarities.entrySet().stream().sorted((f, s) -> {
            int result = Integer.compare(s.getValue(), f.getValue());
            if (result == 0) {
                result = Double.compare(avgRatigns.get(s.getKey()), avgRatigns.get(f.getKey()));
            }
            return result;
        }).forEach(e ->
                System.out.printf("- %s; Rarity: %d; Rating: %.2f\n",
                        e.getKey(), e.getValue(), avgRatigns.get(e.getKey())));


    }
}
