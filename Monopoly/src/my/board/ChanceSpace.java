/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package my.board;

import java.util.*; 
import javax.swing.JOptionPane;

//import my.board.Board;
import my.Game;
import my.deck.Card;



/**
 * @author Kayon
 */
public class ChanceSpace extends Space
{   
    // Create the Chance array list 
    public static List<Card> chance = new ArrayList<>();     
    
    public ChanceSpace(String name, int xPos, int yPos)
    {
        super(name, xPos, yPos);
    }    
    
    @Override
    public void doAction()
    {
        Card drawn=chance.get(0);
        chance.remove(0);
        JOptionPane.showMessageDialog( Board.board.dialog, drawn.disc, "Chance", JOptionPane.PLAIN_MESSAGE );
        
        switch(drawn.id)
        {
           case 1://"Advance to Go (Collect $200)"
               Game.Players.get(Game.currentPlayer).location = 0;               // 0 = GoSpace;
               Game.bank.giveMoney(Game.Players.get(Game.currentPlayer), 200);
               
               chance.add(drawn);
               break;
               
           case 2://"Advance to Midgar - if you pass Go, Collect $200"
               if (Game.Players.get(Game.currentPlayer).location > 24)//already past midgar
               {
                    Board.spaces.get(0).doAction();              
               }
               Game.Players.get(Game.currentPlayer).location = 24;              // 24 = Midgar;
               Board.spaces.get(24).doAction();              
               
               chance.add(drawn);
               break;
               
           case 3://"Advance token to nearest Summon. If unowned, you "
                  // "may buy it from the Bank. If owned, throw dice and "
                  // "pay owner a total ten times the amount thrown."
               
               //if bulb util is closer (12 = Bulb Utility, 28 = Pipe Utility)
               if (Math.abs(Game.Players.get(Game.currentPlayer).location - 12) <  
                   Math.abs(Game.Players.get(Game.currentPlayer).location - 28))
               {
                   Game.Players.get(Game.currentPlayer).location = 12;          
                   if(PropertySpace.class.cast(Board.spaces.get(12)).property.Owner==null)
                   {
                       Board.spaces.get(12).doAction();
                   }
                   else if(PropertySpace.class.cast(Board.spaces.get(12)).property.Owner!=
                           Game.Players.get(Game.currentPlayer))
                   {
                       int amt = Game.Players.get(Game.currentPlayer).roll();
                       Game.bank.takeMoney(Game.Players.get(Game.currentPlayer) , amt);
                       Game.bank.giveMoney(PropertySpace.class.cast(Board.spaces.get(12)).property.Owner, amt);
                   }
               }
               else
               {
                   Game.Players.get(Game.currentPlayer).location = 28;          
                   if(PropertySpace.class.cast(Board.spaces.get(28)).property.Owner==null)
                   {
                       Board.spaces.get(28).doAction();
                   }
                   else if(PropertySpace.class.cast(Board.spaces.get(28)).property.Owner!=
                           Game.Players.get(Game.currentPlayer))
                   {
                       int amt = Game.Players.get(Game.currentPlayer).roll();
                       Game.bank.takeMoney(Game.Players.get(Game.currentPlayer) , amt);
                       Game.bank.giveMoney(PropertySpace.class.cast(Board.spaces.get(28)).property.Owner, amt);
                   }
               }   
               
               chance.add(drawn);
               break;
               
           case 4:
           case 5://"Advance token to the nearest Airship and pay owner twice "
                  // "the rental to which he/she is otherwise entitled. "
                  // "If Airship is unowned, you may buy it from the Bank. "
               
               // 5 = Airship 1, 15 = Airship 2, 25 = Airship 3, 35 = Airship 4
               
               //Airship 1 closer
               if (Math.abs(Game.Players.get(Game.currentPlayer).location - 5) > 
                   Math.abs(Game.Players.get(Game.currentPlayer).location - 15) &&
                   Math.abs(Game.Players.get(Game.currentPlayer).location - 5) > 
                   Math.abs(Game.Players.get(Game.currentPlayer).location - 25) &&
                   Math.abs(Game.Players.get(Game.currentPlayer).location - 5) > 
                   Math.abs(Game.Players.get(Game.currentPlayer).location - 35))
               {
                   Game.Players.get(Game.currentPlayer).location = 5; 
                   if(PropertySpace.class.cast(Board.spaces.get(5)).property.Owner==null)
                   {
                       Board.spaces.get(5).doAction();
                   }
                   else if(PropertySpace.class.cast(Board.spaces.get(5)).property.Owner!=
                           Game.Players.get(Game.currentPlayer))
                   {
                       int amt = 2 * PropertySpace.class.cast(Board.spaces.get(5)).property.calcRent();
                       Game.bank.takeMoney(Game.Players.get(Game.currentPlayer) , amt);
                       Game.bank.giveMoney(PropertySpace.class.cast(Board.spaces.get(5)).property.Owner, amt);
                   }
               }
               
               //Airship 2 closer
               else if (Math.abs(Game.Players.get(Game.currentPlayer).location - 15) > 
                   Math.abs(Game.Players.get(Game.currentPlayer).location - 25) &&
                   Math.abs(Game.Players.get(Game.currentPlayer).location - 15) > 
                   Math.abs(Game.Players.get(Game.currentPlayer).location - 35) &&
                   Math.abs(Game.Players.get(Game.currentPlayer).location - 15) > 
                   Math.abs(Game.Players.get(Game.currentPlayer).location - 5)
                       )
               {
                   Game.Players.get(Game.currentPlayer).location = 15;  
                   
                   if(PropertySpace.class.cast(Board.spaces.get(15)).property.Owner==null)
                   {
                       Board.spaces.get(15).doAction();
                   }
                   else if(PropertySpace.class.cast(Board.spaces.get(15)).property.Owner!=
                           Game.Players.get(Game.currentPlayer))
                   {
                       int amt = 2 * PropertySpace.class.cast(Board.spaces.get(15)).property.calcRent();
                       Game.bank.takeMoney(Game.Players.get(Game.currentPlayer) , amt);
                       Game.bank.giveMoney(PropertySpace.class.cast(Board.spaces.get(15)).property.Owner, amt);
                   }
               }
               
               //Airship 3 closer
               else if (Math.abs(Game.Players.get(Game.currentPlayer).location - 25) > 
                   Math.abs(Game.Players.get(Game.currentPlayer).location - 15) &&
                   Math.abs(Game.Players.get(Game.currentPlayer).location - 25) > 
                   Math.abs(Game.Players.get(Game.currentPlayer).location - 5) &&
                   Math.abs(Game.Players.get(Game.currentPlayer).location - 25) > 
                   Math.abs(Game.Players.get(Game.currentPlayer).location - 35)
                       )
               {
                   Game.Players.get(Game.currentPlayer).location = 25;          
                   
                   if(PropertySpace.class.cast(Board.spaces.get(25)).property.Owner==null)
                   {
                       Board.spaces.get(25).doAction();
                   }
                   else if(PropertySpace.class.cast(Board.spaces.get(25)).property.Owner!=
                           Game.Players.get(Game.currentPlayer))
                   {
                       int amt = 2 * PropertySpace.class.cast(Board.spaces.get(25)).property.calcRent();
                       Game.bank.takeMoney(Game.Players.get(Game.currentPlayer) , amt);
                       Game.bank.giveMoney(PropertySpace.class.cast(Board.spaces.get(25)).property.Owner, amt);
                   }
               }
               
               //Airship 4 cloaser
               else if (Math.abs(Game.Players.get(Game.currentPlayer).location - 35) > 
                   Math.abs(Game.Players.get(Game.currentPlayer).location - 15) &&
                   Math.abs(Game.Players.get(Game.currentPlayer).location - 35) > 
                   Math.abs(Game.Players.get(Game.currentPlayer).location - 25) &&
                   Math.abs(Game.Players.get(Game.currentPlayer).location - 35) > 
                   Math.abs(Game.Players.get(Game.currentPlayer).location - 5)
                       )
               {
                   Game.Players.get(Game.currentPlayer).location = 35;          
                   
                   if(PropertySpace.class.cast(Board.spaces.get(35)).property.Owner==null)
                   {
                       Board.spaces.get(35).doAction();
                   }
                   else if(PropertySpace.class.cast(Board.spaces.get(35)).property.Owner!=
                           Game.Players.get(Game.currentPlayer))
                   {
                       int amt = 2 * PropertySpace.class.cast(Board.spaces.get(35)).property.calcRent();
                       Game.bank.takeMoney(Game.Players.get(Game.currentPlayer) , amt);
                       Game.bank.giveMoney(PropertySpace.class.cast(Board.spaces.get(35)).property.Owner, amt);
                   }
               }
               
               chance.add(drawn);
               break;
               
           case 6://"Advance to Ancient's Library – if you pass Go, Collect $200"
               
               // 11 = Ancient's Library
               if (Game.Players.get(Game.currentPlayer).location > 11)//passing go
               {
                    Board.spaces.get(0).doAction();          
               }
               Game.Players.get(Game.currentPlayer).location = 11;              
               Board.spaces.get(11).doAction();
               
               chance.add(drawn);
               break;
               
           case 7://"Bank pays you dividend of $50"
               Game.bank.giveMoney(Game.Players.get(Game.currentPlayer), 50);
               
               chance.add(drawn);
               break;
               
           case 8://"Get out of Jail Free – this card may be kept until needed, "
                  // "or traded/sold"
               Game.Players.get(Game.currentPlayer).ChanceJailCard=true;
               break;
               
           case 9://"Go back 3 spaces"
               Game.Players.get(Game.currentPlayer).location -= 3;
               Board.spaces.get(Game.Players.get(Game.currentPlayer).location).doAction();
               
               chance.add(drawn);
               break;
               
           case 10://"Go directly to Jail – do not pass Go, do not Collect $200"
               Game.Players.get(Game.currentPlayer).location = 10;// 10 = Jail
               Game.Players.get(Game.currentPlayer).InJail = true;
               
               chance.add(drawn);
               break;
               
           case 11://"Make general repairs on all your property – "
                   //"for each house pay $25 – for each temple $100"
               
               chance.add(drawn);
               break;
               
           case 12://"Pay poor tax of $15"
               Game.bank.takeMoney(Game.Players.get(Game.currentPlayer), 15);
               
               chance.add(drawn);
               break;
               
           case 13://"Take a trip to the Highwind – if you pass Go, "
                   // "Collect $200"
               if (Game.Players.get(Game.currentPlayer).location > 5)
               {
                    Board.spaces.get(0).doAction();          
               }
               Game.Players.get(Game.currentPlayer).location = 5;               // 5 = Highwind
               Board.spaces.get(5).doAction();
               
               chance.add(drawn);
               break;
               
           case 14://"Take a pilgrimage to Zanarkand – advance token to Zanarkand"                      
               Game.Players.get(Game.currentPlayer).location = 40;              // 40 = Zanarkand
               Board.spaces.get(5).doAction();
               
               chance.add(drawn);
               break;
               
           case 15://"You have been elected chairman of the board – pay each "
                    // "player $50"
               for (int i = 0; i < Game.numPlayers; i++)
               {
                   Game.bank.takeMoney(Game.Players.get(Game.currentPlayer), 50);
                   Game.bank.giveMoney(Game.Players.get(i), 50);
               }
               
               chance.add(drawn);
               break;
               
           case 16://"Your building loan matures – Collect $150"
               Game.bank.giveMoney(Game.Players.get(Game.currentPlayer), 150);
               
               chance.add(drawn);
               break;
           case 17://"You have won a crossword competition - Collect $100"
               Game.bank.giveMoney(Game.Players.get(Game.currentPlayer), 100);
               
               chance.add(drawn);
               break;
        }
    }
    
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
        chance.add(new Card(13, "Take a trip to the Highwind Airship – if you pass Go, "
                    + "Collect $200"));
        chance.add(new Card(14, "Take a pilgrimage to Zanarkand – advance token to Zanarkand"));
        chance.add(new Card(15, "You have been elected chairman of the board – pay each "
                    + "player $50"));
        chance.add(new Card(16, "Your building loan matures – Collect $150"));
        chance.add(new Card(17, "You have won a crossword competition - Collect $100"));               
                 
        
    }   
}
