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
    public String name;
    public int location=0;
    
    Dice dice = new Dice(6);
    boolean goingToJail;
    int funds=0;
    
    public Player()
    {
    }
    public int roll()
    {
        return dice.Roll(2);
    }
        
    
    public void Move(int dist)
    {
        location = (location + dist)%Board.spaces.size();
        
    }
}
