/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package my;

import my.board.Board;
import my.board.PropertySpace;

/**
 *
 * @author Justin
 */
public class UtilityProperty extends Property
{
    public UtilityProperty(String name)
    {
        super(Property.Group.Utility,150, 75, 4,10,0,0,0,0,name);
    }
    
    @Override
    public int calcRent()
    {
        //both utilities owned by same player
        if(PropertySpace.class.cast(Board.spaces.get(12)).property.Owner == 
                PropertySpace.class.cast(Board.spaces.get(28)).property.Owner)
        {
            return Rent.get(1) * Game.players.get(Game.currentPlayer).rolled;
        }
        //owned by different players
        else
        {
            return Rent.get(0) * Game.players.get(Game.currentPlayer).rolled;
        }
    }
    
}
