package Final;

import java.util.*;

public class Problem3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] text = scan.nextLine().split(" \\| ");
        String[] onlyWords = scan.nextLine().split(" \\| ");
        Map<String, List<String>> information = new TreeMap<>();

        for (int i = 0; i < text.length; i++) {
            String command = text[i];
            String[] words = command.split(": ");
            String word1 = words[0];
            String word2 = words[1];
            if (!information.containsKey(word1)) {
                information.put(word1, new ArrayList<>());
                information.get(word1).add(word2);
            } else {
                information.get(word1).add(word2);
            }
        }
        String command = scan.nextLine();

        if (command.equals("Test")) {
            for (int i = 0; i < onlyWords.length; i++) {
                String word = onlyWords[i];

                if (information.containsKey(word)) {
                    for (Map.Entry<String, List<String>> entry : information.entrySet()) {
                        if (entry.getKey().equals(word)) {
                            System.out.println(word + ":");
                            entry.getValue().stream().sorted((e1,e2) -> {
                                int result = e2.length() - e1.length();
                                if (result == 0) {
                                    result = e1.length() - e2.length();
                                }
                                return result;
                            }).forEach(ent -> System.out.printf(" -%s%n", ent));
                        }
                    }

                }

            }
        } else if (command.equals("Hand Over")) {
            for (String set : information.keySet()) {

                System.out.print(set + " ");
            }
        }


    }
}
