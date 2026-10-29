/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package Keisus_Realm;
import java.util.Scanner;

/**
 *
 * @author eyimo
 */
public class TextRPG {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*I will have a separate menu with other option in the main such
        being able to input your own user name and having the program use it throughout the story.
        Easter eggs could be a secret ending or for a special class.
        */

        while (true) {
            System.out.print("Start game? (yes/no): ");
            String startGame = scan.nextLine().trim();

            if (startGame.equalsIgnoreCase("yes")) {
                Introduction.Display();
                ClassChoice classChoice = new ClassChoice();
                classChoice.CharacterOpt();
                break;
            } else if (startGame.equalsIgnoreCase("no")) {
                System.out.println("See you soon Travelor!");
                break;
            } else {
                System.out.println("Invalid choice. Please enter yes or no.");
            }
        }
        }

    }
