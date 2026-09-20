/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Kelniar_Realm;

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


    if(SelectedClass.equals(Class1))
    {
        health = 85;
        attack = 20;
        defence = 15;
    }

    else if(SelectedClass.equals(Class2))
    {
        health = 115;
        attack = 10;
        defence = 45;
    }

    System.out.println("Selected Class: " + SelectedClass);
    System.out.println("Health: " + health);
    System.out.println("Attack: " + attack);
    System.out.println("Defence: " + defence);
}


}
