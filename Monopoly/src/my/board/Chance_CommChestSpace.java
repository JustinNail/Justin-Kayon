/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package my.board;

import java.util.*; 
//import my.board.Board;
import my.Game;

/**
 * @author Kayon
 */
public class Chance_CommChestSpace extends Space
{    
    Chance_CommChestSpace temp = new Chance_CommChestSpace();    
   
    /*public Chance_CommChestSpace(String name, int xPos, int yPos)
    {
        super(name, xPos, yPos);
    }*/

    public void Chance_CommChestSpace() {}
    
    @Override
    public void doAction()
    {
        /*System.out.println();
        temp.PopulateChance();
        System.out.println();
        temp.PopulateCommChest();
        System.out.println();*/
        
        temp.Shuffle(temp.chance, "Chance");
        System.out.println();
        temp.Shuffle(temp.comchest, "Community Chest");
        System.out.println();        
    }
    
    // Create the Community Chest array list 
    private ArrayList comchest = new ArrayList();
    // Create the Chance array list 
    private ArrayList chance = new ArrayList();     
    
    
    public void PopulateChance()
    {
        // Adding elements to the chance array list 
        chance.add("1 Advance to Go (Collect $200)"); 
        chance.add("2 Advance to Midgar - if you pass Go, Collect $200"); 
        chance.add("3 Advance token to nearest Utility. If unowned, you "
                    + "may buy it from the Bank. If owned, throw dice and "
                    + "pay owner a total ten times the amount thrown."); 
        chance.add("4 Advance token to the nearest Airship and pay owner twice "
                    + "the rental to which he/she is otherwise entitled. "
                    + "If Airship is unowned, you may buy it from the Bank. ");
        chance.add("5 Advance token to the nearest Airship and pay owner twice "
                    + "the rental to which he/she is otherwise entitled. "
                    + "If Airship is unowned, you may buy it from the Bank. ");            
        chance.add("6 Advance to Ancient's Library – if you pass Go, Collect $200"); 
        chance.add("7 Bank pays you dividend of $50"); 
        chance.add("8 Get out of Jail Free – this card may be kept until needed, "
                    + "or traded/sold");
        chance.add("9 Go back 3 spaces");
        chance.add("10 Go directly to Jail – do not pass Go, do not Collect $200");
        chance.add("11 Make general repairs on all your property – "
                    + "for each house pay $25 – for each temple $100");
        chance.add("12 Pay poor tax of $15");
        chance.add("13 Take a trip to the Fahrenheit Airship – if you pass Go, "
                    + "Collect $200");
        chance.add("14 Take a walk on the Zanarkand – advance token to Zanarkand");
        chance.add("15 You have been elected chairman of the board – pay each "
                    + "player $50");
        chance.add("16 Your building loan matures – Collect $150");
        chance.add("17 You have won a crossword competition - Collect $100");               
                 
        /*temp.Shuffle(temp.chance, "Chance");
        System.out.println(); */      
            
        /*// display the array list 
        System.out.println("Contents of chance: " + chance);     
        System.out.println("Size of chance after additions: " + chance.size()); */
    }
    
    public void PopulateCommChest()
    {
        // Add elements to the Community Chest array list 
        comchest.add("1 Advance to Go (Collect $200)");
        comchest.add("2 Bank error in your favor – Collect $200");
        comchest.add("3 Healer's fees – Pay $50");
        comchest.add("4 Get Out of Jail Free – this card may be kept until needed, "
                    + "or sold");
        comchest.add("5 Go to Jail – go directly to jail – Do not pass Go, do not "
                    + "Collect $200");
        comchest.add("6 It is your birthday - Collect $10 from each player");
        comchest.add("7 Grand Opera Night – collect $50 from every player for "
                    + "opening night seats");
        comchest.add("8 Income Tax refund – Collect $20");
        comchest.add("9 Life Insurance Matures – Collect $100");
        comchest.add("10 Pay Hospital Fees of $100");
        comchest.add("11 Pay School Fees of $50");
        comchest.add("12 Receive $25 Consultancy Fee");
        comchest.add("13 You are assessed for street repairs – $40 per house, $115 "
                    + "per temple");
        comchest.add("14 You have won second prize in a beauty contest– Collect $10");
        comchest.add("15 You inherit $100");
        comchest.add("16 From sale of stock you get $50");
        comchest.add("17 Holiday Fund matures - Receive $100");
                       
        /*temp.Shuffle(temp.comchest, "Community Chest"); 
        System.out.println();*/
        
       /* // display the array list 
        System.out.println("Contents of comchest: " + comchest);    
        System.out.println("Size of comchest after additions: " + comchest.size()); */
    }
    
    /* To shuffle elements of Java ArrayList use, static void shuffle(List list) 
     * method of Collections class.
     */
    public void Shuffle(ArrayList stack, String name)
    {
        Collections.shuffle(stack);
        System.out.println("After shuffling, " + name + " contains : " + stack);    
    }
    
    public static void main(String[] args)
    {
        
    }
    
}
