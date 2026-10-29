/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Keisus_Realm;

import java.util.Scanner;

/**
 * @author eyimo
 */
public class Introduction {

    public static String Greeting = "Welcome to";
    public static String Location = """
                                    +=======================================================================================+ 
                                    |                                                                                       |
                                    |   __          .__                      __________              .__                    |
                                    |   |  | __ ____ |__| ________ __  ______ \\______   \\ ____ _____  |  |   _____          |
                                    |   |  |/ // __ \\|  |/  ___/  |  \\/  ___/  |       _// __ \\\\__  \\ |  |  /     \\         |
                                    |   |    <\\  ___/|  |\\___ \\|  |  /\\___ \\   |    |   \\  ___/ / __ \\|  |_|  Y Y  \\        |
                                    |   |__|_ \\\\___  >__/____  >____//____  >  |____|_  /\\___  >____  /____/__|_|  /        |
                                    |        \\/    \\/        \\/           \\/          \\/     \\/     \\/           \\/         |
                                    |                                                                                       |
                                    +=======================================================================================+""";

    // Text block used for the title border and title.
    public static String Role1 = "Rogue: A slient Assassin born into the life of secrecy and stealth.";
    public static String Role2 = "Paladin: A holy knight taking on the brunt of attacks for their comrades";

    static Scanner scanner = new Scanner(System.in);
    static ClassChoice info = new ClassChoice();

    public static void Display() {
        System.out.println(Greeting);

        // Delay the opening text to create a slower RPG-style introduction.
        try {
            Thread.sleep(1750);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println(Location);

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println("You are set in a mystic world. Destined to defeat the FAIRY King; Bixlou. The lost souls of Valerius count you, Goodluck Travler ");

        try {
            Thread.sleep(1750);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println("[TRAVELLING TO TAVERN...]");

        try {
            Thread.sleep(1750);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    // Display the available character classes and show the selected class stats.
    public static void CharacterOpt() {
        try {
            Thread.sleep(750);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.print("G'morning Traveller! welcome to the tavern Hall of Scalvondir. What are you enrolling as? (press 1, 2 or 3): ");
        try {
            Thread.sleep(750);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("""

        Warrior: Brave and strong, a front line fighter with a balance of attack and defence.

        Knight: A heavily armored tank, able to take a lot of damage and protect those weaker than themselves.

        Ranger: A long range fighter, able to attack from a distance and avoid damage with their agility.
        """);

        String SelectedClass;
        int Selection = scanner.nextInt();

        switch (Selection) {
            // Display the selected class and its stats.
            case 1 -> SelectedClass = info.Class1;
            case 2 -> SelectedClass = info.Class2;
            case 3 -> SelectedClass = info.Class3;
            default -> {
                System.out.println("Invalid selection");
                return;
            }
        }
        info.Stats(SelectedClass);
        System.out.println("Selected Class: " + SelectedClass);
    }
}
