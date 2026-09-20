/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Keisus_Realm;

/**
 *
 * @author eyimo
 */
public class ClassChoice {
public  String Class1 = "Rogue";
public static Object SelectedClass;
public  String Class2 = "Paladin";


public void Stats(String SelectedClass)
{
    int health = 0;
    int attack = 0;
    int defence = 0;

    //Class stats for Rogue, being light weight and a slightly heavy hitter
    if(SelectedClass.equals(Class1))
    {
        health = 85;
        attack = 15;
        defence = 15;
    }
    //Class stats for Paladin, heavy, "tank" like role. Good on health and defence
    else if(SelectedClass.equals(Class2))
    {
        health = 115;
        attack = 10;
        defence = 45;
    }
    //This will display the selected class along with the stats of ATK, HP, DF.
    System.out.println("Selected Class: " + SelectedClass);
    System.out.println("Health: " + health);
    System.out.println("Attack: " + attack);
    System.out.println("Defence: " + defence);
}


}

