package FinalExam;

import java.util.*;

public class ThePianist {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numberOfPieces = Integer.parseInt(scan.nextLine());

        Map<String, List<String>> pieces = new LinkedHashMap<>();

        for (int i = 0; i < numberOfPieces; i++) {
            String input = scan.nextLine();
            String[] commands = input.split("\\|");
            String piece = commands[0];
            String composer = commands[1];
            String key = commands[2];

            pieces.put(piece, new ArrayList<>());
            pieces.get(piece).add(composer);
            pieces.get(piece).add(key);

        }
       String input = scan.nextLine();

        while (!input.equals("Stop")) {
            String[] commands = input.split("\\|");
            String command = commands[0];

            if (command.equals("Add")) {
                String piece = commands[1];
                String composer = commands[2];
                String key = commands[3];

                if (!pieces.containsKey(piece)) {
                    pieces.put(piece, new ArrayList<>());
                    pieces.get(piece).add(composer);
                    pieces.get(piece).add(key);
                    System.out.printf("%s by %s in %s added to the collection!%n", piece, composer,key);
                } else {
                    System.out.printf("%s is already in the collection!%n", piece);
                }
            } else if (command.equals("Remove")) {
                String piece = commands[1];

                if (pieces.containsKey(piece)) {
                    pieces.remove(piece);
                    System.out.printf("Successfully removed %s!%n" , piece);
                } else {
                    System.out.printf("Invalid operation! %s does not exist in the collection.%n", piece);
                }

            } else if (command.equals("ChangeKey")) {
                String piece = commands[1];
                String newKey = commands[2];

                if (pieces.containsKey(piece)) {
                    pieces.get(piece).set(1,newKey);
                    System.out.printf("Changed the key of %s to %s!%n", piece,newKey);
                } else {
                    System.out.printf("Invalid operation! %s does not exist in the collection.%n", piece);
                }
            }



            input = scan.nextLine();
        }
        pieces.entrySet().stream().sorted((name1, name2) -> {
            int result = name1.getKey().compareTo(name2.getKey());
            if (result == 0) {
                result = name2.getValue().get(0).compareTo(name1.getValue().get(0));

            }
            return result;
        }).forEach(entry -> System.out.printf("%s -> Composer: %s, Key: %s%n" , entry.getKey(), entry.getValue().get(0), entry.getValue().get(1)));

    }
}
