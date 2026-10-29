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
public String Class1 = "Soldier";
public String Class2 = "Warrior";
public String Class3 = "Ranger";
public static Object SelectedClass;

public void Stats(String SelectedClass)
{
    int health = 0;
    int attack = 0;
    int defence = 0;

    // Warrior: upfront attack-based class
    if(SelectedClass.equals(Class1))
    {
        health = 100;
        attack = 30;
        defence = 15;
    }
    // Knight: defensive tank with a strong attack
    else if(SelectedClass.equals(Class2))
    {
        health = 130;
        attack = 22;
        defence = 40;
    }
    // Ranger: long-range class with light defence
    else if(SelectedClass.equals(Class3))
    {
        health = 80;
        attack = 25;
        defence = 20;
    }
    //This will display the selected class along with the stats of ATK, HP, DF.
    System.out.println("Selected Class: " + SelectedClass);
    System.out.println("Health: " + health);
    System.out.println("Attack: " + attack);
    System.out.println("Defence: " + defence);
}


}
