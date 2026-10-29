/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Keisus_Realm;

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
}
