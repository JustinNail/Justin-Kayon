/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package my.board;

/**
 *
 * @author Justin
 */
public abstract class Space
{
    public String Name;
    public int XPos, YPos;
    
    public Space(String name, int xPos, int yPos)
    {
        Name = name;
        XPos=xPos;
        YPos=yPos;
    }
     public abstract void doAction();
}
