package FinalExam;


import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SantaNewList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        Map<String, Integer> children = new LinkedHashMap<>();
        Map<String, Integer> presents = new LinkedHashMap<>();

        while (!input.equals("END")) {

            String[] commands = input.split("->");
            String name = commands[0];
            String present = commands[1];

            if (!name.equals("Remove")) {
            int amount = Integer.parseInt(commands[2]);
                if (!children.containsKey(name)) {
                    children.put(name, amount);

                } else {
                    children.put(name, children.get(name) + amount);

                }

                if (!presents.containsKey(present)) {
                    presents.put(present, amount);

                } else {
                    presents.put(present, presents.get(present) + amount);

                }
            } else {
                children.remove(present);
            }


            input = scan.nextLine();
        }
        System.out.println("Children:");
        children.entrySet().stream().sorted((points1, points2) -> {
            int result = points2.getValue() - points1.getValue();
            if (result == 0) {
                result = points1.getKey().compareTo(points2.getKey());

            }
            return result;
        }).forEach(entry -> System.out.printf("%s -> %d%n", entry.getKey(),entry.getValue()));
        System.out.println("Presents:");
        for (Map.Entry<String, Integer> entry : presents.entrySet()) {
            System.out.printf("%s -> %d%n", entry.getKey(), entry.getValue());
        }

    }
}
