package JavaFundamentalsExercise.PracticeTests;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class HeroesOfCodeAndLogicVII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lines = Integer.parseInt(scanner.nextLine());

        Map<String, Hero> heroes = new LinkedHashMap<>();

        for (int i = 0; i < lines; i++) {
            String[] line = scanner.nextLine().split(" ");
            if (Integer.parseInt(line[1]) <= 100 && Integer.parseInt(line[2]) <= 200) {
                Hero hero = new Hero(line[0], Integer.parseInt(line[1]), Integer.parseInt(line[2]));
                heroes.put(line[0], hero);
            }
        }
        String command = scanner.nextLine();

        while (!command.equals("End")) {
            String[] com = command.split(" - ");
            String hero = com[1];
            switch (com[0]){
                case "CastSpell":
                    //"CastSpell – {hero name} – {MP needed} – {spell name}"
                    int MPNeeded = Integer.parseInt(com[2]);
                    String spellName = com[3];
                    if (MPNeeded <= heroes.get(hero).MP){
                        heroes.get(hero).setMP(heroes.get(hero).MP - MPNeeded);
                        System.out.printf("%s has successfully cast %s and now has %d MP!%n", heroes.get(hero).name, spellName, heroes.get(hero).MP);
                    }else {
                        System.out.printf("%s does not have enough MP to cast %s!%n", heroes.get(hero).name, spellName);
                    }
                    break;
                case "TakeDamage":
                    //"TakeDamage – {hero name} – {damage} – {attacker}"
                    int damage = Integer.parseInt(com[2]);
                    String attacker = com[3];
                    if (damage < heroes.get(hero).HP){
                        heroes.get(hero).setHP(heroes.get(hero).HP - damage);
                        System.out.printf("%s was hit for %d HP by %s and now has %d HP left!%n", hero, damage, attacker, heroes.get(hero).HP);
                    }else {
                        System.out.printf("%s has been killed by %s!%n", hero, attacker);
                        heroes.remove(hero);
                    }
                    break;
                case "Recharge":
                    int amountMP = Integer.parseInt(com[2]);
                    if (heroes.get(hero).MP + amountMP <= 200){
                        heroes.get(hero).setMP(heroes.get(hero).MP + amountMP);
                        System.out.printf("%s recharged for %d MP!%n", hero, amountMP);
                    }else {
                        System.out.printf("%s recharged for %d MP!%n", hero, 200 - heroes.get(hero).MP);
                        heroes.get(hero).setMP(200);
                    }
                    break;
                case "Heal":
                    int amountHP = Integer.parseInt(com[2]);
                    if (heroes.get(hero).HP + amountHP <= 100){
                        heroes.get(hero).setHP(heroes.get(hero).HP + amountHP);
                        System.out.printf("%s healed for %d HP!%n", hero, amountHP);
                    }else {
                        System.out.printf("%s healed for %d HP!%n", hero,100 - heroes.get(hero).HP);
                        heroes.get(hero).setHP(100);
                    }
                    break;
            }
            command = scanner.nextLine();
        }
        heroes.forEach((s, hero) -> {
            System.out.println(s);
            System.out.printf(" HP: %d%n", hero.HP);
            System.out.printf(" MP: %d%n", hero.MP);
        });

    }

    static class Hero {
        String name;
        int HP;
        int MP;

        public int getHP() {
            return HP;
        }

        public int getMP() {
            return MP;
        }

        public void setHP(int HP) {
            this.HP = HP;
        }

        public void setMP(int MP) {
            this.MP = MP;
        }

        public Hero(String name, int HP, int MP) {
            this.name = name;
            this.HP = HP;
            this.MP = MP;
        }
    }
}
