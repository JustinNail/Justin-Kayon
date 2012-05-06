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
public class RailProperty extends Property
{
    public RailProperty(String name)
    {
        super(Property.Group.Rail,200,100,25,50,100,200,0,0,name);
    }
    
    @Override
    public int calcRent()
    {
        int r=25;
        if(Owner==PropertySpace.class.cast(Board.spaces.get(5)).property.Owner &&
                PropertySpace.class.cast(Board.spaces.get(5)).property != this)
        {
            r*=2;
        }
        if(Owner==PropertySpace.class.cast(Board.spaces.get(15)).property.Owner &&
                PropertySpace.class.cast(Board.spaces.get(15)).property != this)
        {
            r*=2;
        }
        if(Owner==PropertySpace.class.cast(Board.spaces.get(25)).property.Owner &&
                PropertySpace.class.cast(Board.spaces.get(25)).property != this)
        {
            r*=2;
        }
        if(Owner==PropertySpace.class.cast(Board.spaces.get(35)).property.Owner &&
                PropertySpace.class.cast(Board.spaces.get(35)).property != this)
        {
            r*=2;
        }
        
        return r;
    }
}
