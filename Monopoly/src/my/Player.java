/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package my;

import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import my.board.Board;


/**
 *
 * @author Justin
 */
public class Player
{
    public String name;
    public int location=0;
    
    private List<Property> ownedProperties = new ArrayList();
    public boolean ChestJailCard=false;
    public boolean ChanceJailCard=false;
    
    public Dice[] dice = {new Dice(6),new Dice(6)};
    public int rolled;
    
    public int doubles=0;
    public boolean rolledDoubles=false;
    
    public boolean InJail;
    public int funds=0;
    
    public Player()
    {
    }
    public int roll()
    {
        dice[0].Roll();
        dice[1].Roll();
        
        return dice[0].result+dice[1].result;
    }
    public int takeTurn()
    {
        if(InJail)
        {
            Board.spaces.get(10).doAction();//JailSpace action
            return -1;
        }
        else
        {
            rolled = roll();
            
            if(dice[0].result==dice[1].result)
            {
                JOptionPane.showMessageDialog( Board.board.dialog, name+" Rolled Doubles!", "Yay", JOptionPane.PLAIN_MESSAGE );
                rolledDoubles=true;
                doubles++;
            }
            else
            {
                rolledDoubles=false;
                doubles=0;
            }
            if(doubles>=3)
            {
                JOptionPane.showMessageDialog( Board.board.dialog, "Going to Jail :(", "cheater", JOptionPane.PLAIN_MESSAGE );
                Game.players.get( Game.currentPlayer).InJail=true;
                Game.players.get( Game.currentPlayer).location=10; //10=JailSpace;
            }
            Move(rolled);
            
            return 0;
        }
    }
    public void Move(int dist)
    {
        if((location + dist) > Board.spaces.size())//passing, not landing on, go
        {
            Board.spaces.get(0).doAction();
        }
        location = (location + dist)%Board.spaces.size();   
        Board.spaces.get(location).doAction();
    }
    public void Buy(Property p)
    {
        //TODO: bank.TakeMoney(this,p.cost);
        ownedProperties.add( p );
    }
    public void Mortgage(Property p)
    {
        //TODO: bank.GiveMoney(this,p.Mortgage);
        ownedProperties.remove( p );
    }
}
