/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package my.board;

import java.util.*; 

//import my.board.Board;
import my.Game;
import my.deck.Card;



/**
 * @author Kayon
 */
public class ChanceSpace extends Space
{        
    public ChanceSpace(String name, int xPos, int yPos)
    {
        super(name, xPos, yPos);
    }    
    
    @Override
    public void doAction()
    {
        Card drawn=chance.get(0);
        
        switch(drawn.id)
        {
           case 1:
               Game.players.get(Game.currentPlayer).location = 0;               // 0 = GoSpace;
               Game.bank.giveMoney(Game.players.get(Game.currentPlayer), 200);              
               break;
               
           case 2:
               if (Game.players.get(Game.currentPlayer).location > 24)
                    Board.spaces.get(0).doAction();              
               Game.players.get(Game.currentPlayer).location = 24;              // 24 = Midgar;
               break;
               
           case 3:
               if (Game.players.get(Game.currentPlayer).location > 12 && 
                       Game.players.get(Game.currentPlayer).location < 28)
                   Game.players.get(Game.currentPlayer).location = 28;          // 28 = Pipe Utility;
               else 
               {
                   Board.spaces.get(0).doAction();  
                   Game.players.get(Game.currentPlayer).location = 12;          // 12 = Bulb Utility;
               }   
               break;
               
           case 4:
               if (Game.players.get(Game.currentPlayer).location > 5 && 
                       Game.players.get(Game.currentPlayer).location < 15)
                   Game.players.get(Game.currentPlayer).location = 15;          // 15 = Airship 2
               else
                   if (Game.players.get(Game.currentPlayer).location > 15 && 
                            Game.players.get(Game.currentPlayer).location < 25)
                       Game.players.get(Game.currentPlayer).location = 25;      // 25 = Airship 3
                   else
                       if (Game.players.get(Game.currentPlayer).location > 25 && 
                                Game.players.get(Game.currentPlayer).location < 35)
                           Game.players.get(Game.currentPlayer).location = 35;  // 35 = Airship 4
                       else
                       {
                           Board.spaces.get(0).doAction();  
                           Game.players.get(Game.currentPlayer).location = 5;   // 5 = Airship 1
                       }                  
               break;
               
           case 5:
               if (Game.players.get(Game.currentPlayer).location > 5 && 
                       Game.players.get(Game.currentPlayer).location < 15)
                   Game.players.get(Game.currentPlayer).location = 15;          // 15 = Airship 2
               else
                   if (Game.players.get(Game.currentPlayer).location > 15 && 
                            Game.players.get(Game.currentPlayer).location < 25)
                       Game.players.get(Game.currentPlayer).location = 25;      // 25 = Airship 3
                   else
                       if (Game.players.get(Game.currentPlayer).location > 25 && 
                                Game.players.get(Game.currentPlayer).location < 35)
                           Game.players.get(Game.currentPlayer).location = 35;  // 35 = Airship 4
                       else
                       {
                           Board.spaces.get(0).doAction();  
                           Game.players.get(Game.currentPlayer).location = 5;   // 5 = Airship 1
                       }           
               break;
               
           case 6:
               if (Game.players.get(Game.currentPlayer).location > 11)
                    Board.spaces.get(0).doAction();          
               Game.players.get(Game.currentPlayer).location = 11;              // 11 = Ancient's Library
               break;
               
           case 7:
               Game.bank.giveMoney(Game.players.get(Game.currentPlayer), 50);
               break;
               
           case 8:
               break;
               
           case 9:
               Game.players.get(Game.currentPlayer).location -= 3;
               break;
               
           case 10:   
               Game.players.get(Game.currentPlayer).InJail = true;
               Game.players.get(Game.currentPlayer).location = 10;              // 10 = Jail
               break;
               
           case 11:
               break;
               
           case 12:
               Game.bank.takeMoney(Game.players.get(Game.currentPlayer), 15);
               break;
               
           case 13:
               if (Game.players.get(Game.currentPlayer).location > 5)
                    Board.spaces.get(0).doAction();          
               Game.players.get(Game.currentPlayer).location = 5;               // 5 = Fahrenheit Airship
               break;
               
           case 14:                      
               Game.players.get(Game.currentPlayer).location = 40;              // 40 = Zanarkand
               break;
               
           case 15:
               for (int i = 1; i <= Game.numPlayers; i++)
               {
                   Game.bank.takeMoney(Game.players.get(Game.currentPlayer), 15);
                   Game.bank.giveMoney(Game.players.get(i), 15);
               }
               break;
               
           case 16:        
               Game.bank.giveMoney(Game.players.get(Game.currentPlayer), 150);
               break;
           case 17:               
               Game.bank.giveMoney(Game.players.get(Game.currentPlayer), 100);
               break;
        }
    }
    
    
    // Create the Chance array list 
    public static List<Card> chance = new ArrayList<>();     
    
    
    public static void PopulateChance()
    {
        // Adding elements to the chance array list 
        
        chance.add(new Card(1,"Advance to Go (Collect $200)"));
        
        chance.add(new Card(2,"Advance to Midgar - if you pass Go, Collect $200"));
        chance.add(new Card(3, "Advance token to nearest Utility. If unowned, you "
                    + "may buy it from the Bank. If owned, throw dice and "
                    + "pay owner a total ten times the amount thrown.")); 
        chance.add(new Card(4, "Advance token to the nearest Airship and pay owner twice "
                    + "the rental to which he/she is otherwise entitled. "
                    + "If Airship is unowned, you may buy it from the Bank. "));
        chance.add(new Card(5, "Advance token to the nearest Airship and pay owner twice "
                    + "the rental to which he/she is otherwise entitled. "
                    + "If Airship is unowned, you may buy it from the Bank. "));            
        chance.add(new Card(6, "Advance to Ancient's Library – if you pass Go, Collect $200")); 
        chance.add(new Card(7, "Bank pays you dividend of $50")); 
        chance.add(new Card(8, "Get out of Jail Free – this card may be kept until needed, "
                    + "or traded/sold"));
        chance.add(new Card(9, "Go back 3 spaces"));
        chance.add(new Card(10, "Go directly to Jail – do not pass Go, do not Collect $200"));
        chance.add(new Card(11, "Make general repairs on all your property – "
                    + "for each house pay $25 – for each temple $100"));
        chance.add(new Card(12, "Pay poor tax of $15"));
        chance.add(new Card(13, "Take a trip to the Fahrenheit Airship – if you pass Go, "
                    + "Collect $200"));
        chance.add(new Card(14, "Take a walk on the Zanarkand – advance token to Zanarkand"));
        chance.add(new Card(15, "You have been elected chairman of the board – pay each "
                    + "player $50"));
        chance.add(new Card(16, "Your building loan matures – Collect $150"));
        chance.add(new Card(17, "You have won a crossword competition - Collect $100"));               
                 
        /*temp.Shuffle(temp.chance, "Chance");
        System.out.println(); */      
            
        /*// display the array list 
        System.out.println("Contents of chance: " + chance);     
        System.out.println("Size of chance after additions: " + chance.size()); */
    }   
}
