package FinalExam;

import java.util.*;
import java.util.stream.Collectors;

public class HeroesOfCodeAndLogic {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());


        Map<String, List<Integer>> heroesHpMp = new LinkedHashMap<>();


        for (int i = 0; i < n; i++) {
            List<String> heroes = Arrays.stream(scan.nextLine().split("\\s+")).collect(Collectors.toList());
            String name = heroes.get(0);
            int hp = Integer.parseInt(heroes.get(1));
            int mp = Integer.parseInt(heroes.get(2));

            heroesHpMp.put(name, new ArrayList<>());
            heroesHpMp.get(name).add(hp);
            heroesHpMp.get(name).add(mp);


        }

        String input = scan.nextLine();

        while (!input.equals("End")) {

            String[] command = input.split(" - ");

            String firstCommand = command[0];
            String nameOfHero = command[1];

            if (firstCommand.equals("Heal")) {
                int amount = Integer.parseInt(command[2]);

                int hp = heroesHpMp.get(nameOfHero).get(0);

                if (amount + hp > 100) {
                    heroesHpMp.get(nameOfHero).set(0, 100);
                    System.out.printf("%s healed for %d HP!%n", nameOfHero, 100 - hp);

                } else {
                    heroesHpMp.get(nameOfHero).set(0, hp + amount);
                    System.out.printf("%s healed for %d HP!%n", nameOfHero, amount);
                }

            } else if (firstCommand.equals("Recharge")) {
                int amount = Integer.parseInt(command[2]);

                int mp = heroesHpMp.get(nameOfHero).get(1);

                if (amount + mp > 200) {
                    heroesHpMp.get(nameOfHero).set(1, 200);
                    System.out.printf("%s recharged for %d MP!%n", nameOfHero, 200 - mp);
                } else {
                    heroesHpMp.get(nameOfHero).set(1, mp + amount);
                    System.out.printf("%s recharged for %d MP!%n", nameOfHero, amount);
                }

            } else if (firstCommand.equals("TakeDamage")) {
                int damage = Integer.parseInt(command[2]);
                String attacker = command[3];

                int hp = heroesHpMp.get(nameOfHero).get(0);

                if (hp - damage > 0) {
                    heroesHpMp.get(nameOfHero).set(0, hp - damage);
                    System.out.printf("%s was hit for %d HP by %s and now has %d HP left!%n", nameOfHero, damage, attacker, hp - damage);

                } else {
                    heroesHpMp.remove(nameOfHero);
                    System.out.printf("%s has been killed by %s!%n", nameOfHero, attacker);
                }

            } else if (firstCommand.equals("CastSpell")) {
                int mpNeeded = Integer.parseInt(command[2]);
                String spellName = command[3];
                int mp = heroesHpMp.get(nameOfHero).get(1);

                if (mp >= mpNeeded) {
                    heroesHpMp.get(nameOfHero).set(1, mp - mpNeeded);
                    System.out.printf("%s has successfully cast %s and now has %d MP!%n", nameOfHero, spellName, mp - mpNeeded);
                } else {
                    System.out.printf("%s does not have enough MP to cast %s!%n", nameOfHero, spellName);
                }

            }


            input = scan.nextLine();
        }


        heroesHpMp.entrySet()
                .stream()
                .sorted((hero1, hero2) -> {
                    int result = hero2.getValue().get(0) - hero1.getValue().get(0);

                    if (result == 0) {
                        result = hero1.getKey().compareTo(hero2.getKey());

                    }
                    return result;
                }).forEach(entry -> System.out.printf("%s%n  HP: %d%n  MP: %d%n", entry.getKey(),entry.getValue().get(0),entry.getValue().get(1)));


    }
}


