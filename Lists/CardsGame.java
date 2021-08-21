package ListsExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CardsGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> firstPlayer = Arrays.stream(scan.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> secondPlayer = Arrays.stream(scan.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        int sum = 0;
        String wins = "";

        for (int i = 0; i < firstPlayer.size(); ) {
            int card1 = firstPlayer.get(i);
            for (int j = 0; j < secondPlayer.size(); ) {
                int card2 = secondPlayer.get(i);

                if (firstPlayer.get(i) > secondPlayer.get(j)) {
                    firstPlayer.remove(firstPlayer.get(i));
                    firstPlayer.add(card1);
                    secondPlayer.remove(secondPlayer.get(j));
                    firstPlayer.add(card2);
                    wins = "First";
                    i = 0;
                    j = 0;
                    break;

                } else if (secondPlayer.get(j) > firstPlayer.get(i)) {
                    secondPlayer.remove(secondPlayer.get(j));
                    secondPlayer.add(card2);
                    firstPlayer.remove(firstPlayer.get(i));
                    secondPlayer.add(card1);
                    wins = "Second";
                    i = 0;
                    j = 0;
                    break;
                } else {
                    firstPlayer.remove(firstPlayer.get(i));
                    secondPlayer.remove(secondPlayer.get(i));
                    i = 0;
                    j = 0;
                    break;
                }

            }
                if (firstPlayer.isEmpty() || secondPlayer.isEmpty()) {
                    break;
                }
        }


        for (Integer integer : secondPlayer) {
            sum += integer;
        }
        for (Integer integer : firstPlayer) {
            sum += integer;
        }

        System.out.printf("%s player wins! Sum: %d" , wins, sum);


    }
}
