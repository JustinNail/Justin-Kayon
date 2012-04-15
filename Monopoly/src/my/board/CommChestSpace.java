/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package my.board;

import java.util.*;
import my.Game;
import my.deck.Card;

/**
 *
 * @author Kayon
 */
public class CommChestSpace extends Space
{
    public CommChestSpace(String name, int xPos, int yPos)
    {
        super(name, xPos, yPos);
    }

    
    
    @Override
    public void doAction()
    {
        Card drawn=comchest.get(0);
        
        switch(drawn.id)
        {
           case 1:
           case 2:
           case 3:
           case 4:        
           case 5:
           case 6:
           case 7:
           case 8:
           case 9:
           case 10:        
           case 11:
           case 12:
           case 13:
           case 14:
           case 15:
           case 16:        
           case 17:               
        }
    }
    
    // Create the Community Chest array list 
    public static List<Card> comchest = new ArrayList<>();
    
    public static void PopulateCommChest()
    {
        // Add elements to the Community Chest array list 
        comchest.add(new Card(1, "Advance to Go (Collect $200)"));
        comchest.add(new Card(2, "Bank error in your favor – Collect $200"));
        comchest.add(new Card(3, "Healer's fees – Pay $50"));
        comchest.add(new Card(4, "Get Out of Jail Free – this card may be kept until needed, "
                    + "or sold"));
        comchest.add(new Card(5, "Go to Jail – go directly to jail – Do not pass Go, do not "
                    + "Collect $200"));
        comchest.add(new Card(6, "It is your birthday - Collect $10 from each player"));
        comchest.add(new Card(7, "Grand Opera Night – collect $50 from every player for "
                    + "opening night seats"));
        comchest.add(new Card(8, "Income Tax refund – Collect $20"));
        comchest.add(new Card(9, "Life Insurance Matures – Collect $100"));
        comchest.add(new Card(10, "Pay Hospital Fees of $100"));
        comchest.add(new Card(11, "Pay School Fees of $50"));
        comchest.add(new Card(12, "Receive $25 Consultancy Fee"));
        comchest.add(new Card(13, " You are assessed for street repairs – $40 per house, $115 "
                    + "per temple"));
        comchest.add(new Card(14, "You have won second prize in a beauty contest– Collect $10"));
        comchest.add(new Card(15, "You inherit $100"));
        comchest.add(new Card(16, "From sale of stock you get $50"));
        comchest.add(new Card(17, "Holiday Fund matures - Receive $100"));
                       
        /*temp.Shuffle(temp.comchest, "Community Chest"); 
        System.out.println();*/
        
       /* // display the array list 
        System.out.println("Contents of comchest: " + comchest);    
        System.out.println("Size of comchest after additions: " + comchest.size()); */
    }
    
    
    
    
}
