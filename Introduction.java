/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Keisus_Realm;

import java.util.Scanner;



/**
 *
 * @author eyimo
 * 
 */
public class Introduction 
{
    public static String Greeting = "Welcome to";
    public static String Location = "Keisu's Realm!";
    public static String Role1 = "Rogue: A slient Assassin born into the life of secrecy and stealth.";
    public static String Role2 = "Paladin: A holy knight taking on the brunt of attacks for their comrades";
    static Scanner scanner = new Scanner(System.in);
    static ClassChoice info = new ClassChoice();

    
    
    public static void Display()
    {
        {
            System.out.println(Greeting);
            //This "try" segment is to delay the oncoming text on screen. I attempt to give it more of a slow opening RPG feel and will be use quite frequently to fit the style.
            try{
                Thread.sleep( 1500); // to imagine the game opening will the title card I will add soon but after open with "Welcome to..."

            }    catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            System.out.println(Location); //Then the name of the game.

            try{
                Thread.sleep( 2000);

            }    catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            System.out.println("You are set in a mystic world. Destined to defeat the FAIRY King; Bixlou. The lost souls of Terina count you, Goodluck Travler "); 
            
            try{
                Thread.sleep( 1750);

            }    catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            System.out.println("[TRAVELLING TO TAVERN...]");

            try{
                Thread.sleep( 1750);

            }    catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }


        }
    }
    // add a menu describing both class options potentionally future ones aswell
    public static void CharacterOpt()
    {
        try {
            Thread.sleep(750);
        } catch (InterruptedException e) {
        Thread.currentThread().interrupt();
        }


        System.out.print("G'morning Traveller! welcome to the tavern Hall of Scalvondir. What are you enrolling as? (press 1 or 2): ");
        
        try {
            Thread.sleep(750);
        } catch (InterruptedException e) {
        Thread.currentThread().interrupt();
        }

        System.out.println
        ("""

        Rogue: A slient Assassin born into the life of secrecy and stealth.

        Paladin: A holy knight taking on the brunt of attacks for their comrades
    
        """);

        String SelectedClass;

        int Selection = scanner.nextInt();

        switch (Selection) {
            case 1 -> SelectedClass = info.Class1; // depending on the selected class it will display the classes stats and the name of the class
            case 2 -> SelectedClass = info.Class2;
            default -> {
                System.out.println("Invalid selection");
                return;
            }
        }
        info.Stats(SelectedClass);
        /*Future Additions
        make a return choice menu if the user want to see the stats of the other role
        or have the stats displayed under each role with brackets dividing for viewing purposese
         */


    }

}   



