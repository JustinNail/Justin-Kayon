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
    
    Dice dice = new Dice(6);
    boolean InJail;
    public int funds=0;
    
    public Player()
    {
    }
    public int roll()
    {
        return dice.Roll(2);
    }
    public int takeTurn()
    {
        if(InJail)
        {
            return -1;
        }
        else
        {
            int d = roll();
            Move(d);
            return d;
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
