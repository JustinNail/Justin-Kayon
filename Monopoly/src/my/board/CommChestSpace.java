/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package my.board;

import java.util.*;
import javax.swing.JOptionPane;
import my.Game;
import my.deck.Card;

/**
 *
 * @author Kayon
 */
public class CommChestSpace extends Space
{
    // Create the Community Chest array list 
    public static List<Card> comchest = new ArrayList<>();
    
    public CommChestSpace(String name, int xPos, int yPos)
    {
        super(name, xPos, yPos);
    }    
    
    @Override
    public void doAction()
    {
        Card drawn=comchest.get(0);
        
        comchest.remove(0);
        JOptionPane.showMessageDialog( Board.board.dialog, drawn.disc, "Community Chest", JOptionPane.PLAIN_MESSAGE );
        
        switch(drawn.id)
        {
           case 1://"Advance to Go (Collect $200)"
               Game.Players.get(Game.currentPlayer).location = 0;               // 0 = GoSpace;
               Game.bank.giveMoney(Game.Players.get(Game.currentPlayer), 200); 
               
               comchest.add(drawn);
               break;
               
           case 2://"Bank error in your favor – Collect $200"
               Game.bank.giveMoney(Game.Players.get(Game.currentPlayer), 200);
               
               comchest.add(drawn);
               break;
               
           case 3://"Healer's fees – Pay $50"
               Game.bank.takeMoney(Game.Players.get(Game.currentPlayer), 50);
               
               comchest.add(drawn);
               break;
               
           case 4://"Get Out of Jail Free – this card may be kept until needed, "
                  //"or sold"  
               Game.Players.get(Game.currentPlayer).ChestJailCard=true;
               break;
               
           case 5://"Go to Jail – go directly to jail – Do not pass Go, do not "
                  // "Collect $200"
               Game.Players.get(Game.currentPlayer).location = 10;              // 10 = Jail               
               Game.Players.get(Game.currentPlayer).InJail = true;
               
               comchest.add(drawn);
               break;
               
           case 6://"It is your birthday - Collect $10 from each player"
               for (int i = 1; i < Game.numPlayers; i++)
               {                                      
                   Game.bank.takeMoney(Game.Players.get(i), 10);
                   Game.bank.giveMoney(Game.Players.get(Game.currentPlayer), 10);
               }
               
               comchest.add(drawn);
               break;
               
           case 7://"Grand Opera Night – collect $50 from every player for "
                  //"opening night seats"
               for (int i = 0; i < Game.numPlayers; i++)
               {                                      
                   Game.bank.takeMoney(Game.Players.get(i), 50);
                   Game.bank.giveMoney(Game.Players.get(Game.currentPlayer), 50);
               }
               
               comchest.add(drawn);
               break;
               
           case 8://"Income Tax refund – Collect $20"
               Game.bank.giveMoney(Game.Players.get(Game.currentPlayer), 20);
               
               comchest.add(drawn);
               break;
               
           case 9://"Life Insurance Matures – Collect $100"
               Game.bank.giveMoney(Game.Players.get(Game.currentPlayer), 100);
               
               comchest.add(drawn);
               break;
               
           case 10://"Pay Hospital Fees of $100"
               Game.bank.takeMoney(Game.Players.get(Game.currentPlayer), 100);
               
               comchest.add(drawn);
               break;
               
           case 11://"Pay School Fees of $50"
               Game.bank.takeMoney(Game.Players.get(Game.currentPlayer), 50);
               
               comchest.add(drawn);
               break;
               
           case 12://"Receive $25 Consultancy Fee"
               Game.bank.giveMoney(Game.Players.get(Game.currentPlayer), 25);
               
               comchest.add(drawn);
               break;
               
           case 13://" You are assessed for street repairs – $40 per house, $115 "
                    //"per temple"
               
               comchest.add(drawn);
               break;
               
           case 14://"You have won second prize in a beauty contest– Collect $10"             
               Game.bank.giveMoney(Game.Players.get(Game.currentPlayer), 10);
               
               comchest.add(drawn);
               break;
               
           case 15://"You inherit $100"
               Game.bank.giveMoney(Game.Players.get(Game.currentPlayer), 100);
               
               comchest.add(drawn);
               break;
               
           case 16://"From sale of stock you get $50"
               Game.bank.giveMoney(Game.Players.get(Game.currentPlayer), 50);
               
               comchest.add(drawn);
               break;
               
           case 17://"Holiday Fund matures - Receive $100"              
               Game.bank.giveMoney(Game.Players.get(Game.currentPlayer), 100);
               
               comchest.add(drawn);
               break;
        }
    }
    
    
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
                       
        
    }
    
    
    
    
}
