/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package my;

import javax.swing.ImageIcon;
import my.board.Board;


/**
 *
 * @author Justin
 */
public class Player
{
    public int location=0;
    
    ImageIcon avatar;
   
    Dice dice = new Dice(6);
    
    boolean goingToJail;
    
    public Player()
    {
    }
    public int roll()
    {
        return dice.Roll(2);
    }
    public void Move(int dist)
    {
        location+=dist;
        if (location>=Board.spaces.size())
        {
            location=0;
            if(!goingToJail)
            {
                
            }
        }
    }
}
