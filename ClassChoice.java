/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Keisus_Realm;

import java.util.Scanner;

/**
 * @author eyimo
 */
public class ClassChoice {
    private static final Scanner scanner = new Scanner(System.in);

    public String Class1 = "Warrior";
    public String Class2 = "Knight";
    public String Class3 = "Ranger";

    private String selectedClass;
    private int health;
    private int attack;
    private int defence;

    public void CharacterOpt() {
        while (true) {
            System.out.println("\nCharacter menu");
            System.out.println("1. Choose class");
            System.out.println("2. View current stats");
            System.out.println("3. Continue");
            System.out.print("Choose an option: ");

            int selection = scanner.nextInt();

            switch (selection) {
                case 1 -> chooseClass();
                case 2 -> Stats();
                case 3 -> {
                    if (selectedClass == null) {
                        System.out.println("Please choose a class before continuing.");
                    } else {
                        return;
                    }
                }
                default -> System.out.println("Invalid selection. Please try again.");
            }
        }
    }

    private void chooseClass() {
        System.out.println("""

                Warrior: Brave and strong, a front line fighter with a balance of attack and defence.

                Knight: A heavily armored tank, able to take a lot of damage and protect those weaker than themselves.

                Ranger: A long range fighter, able to attack from a distance and avoid damage with their agility.
                """);
        System.out.print("Choose a class (1, 2 or 3): ");

        int selection = scanner.nextInt();

        switch (selection) {
            case 1 -> setClass(Class1, 100, 30, 15);
            case 2 -> setClass(Class2, 130, 22, 40);
            case 3 -> setClass(Class3, 80, 25, 20);
            default -> System.out.println("Invalid selection. Please try again.");
        }
    }

    private void setClass(String className, int classHealth, int classAttack, int classDefence) {
        selectedClass = className;
        health = classHealth;
        attack = classAttack;
        defence = classDefence;
        System.out.println("Class selected: " + selectedClass);
    }

    public void Stats() {
        if (selectedClass == null) {
            System.out.println("No class selected yet.");
            return;
        }

        System.out.println("Selected Class: " + selectedClass);
        System.out.println("Health: " + health);
        System.out.println("Attack: " + attack);
        System.out.println("Defence: " + defence);
    }
}
