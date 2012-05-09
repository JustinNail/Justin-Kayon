/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package my.board;

import javax.swing.JOptionPane;
import my.Property;
import my.Game;
/**
 *
 * @author Justin
 */
public class PropertySpace extends Space
{
    
    public Property property;
    
    public PropertySpace(String name, int xPos, int yPos, Property p)
    {
        super(name, xPos, yPos);
        property=p;
    }
    @Override
    public void doAction()
    {
        if(property.Owner == Game.Players.get( Game.currentPlayer ))
        {
            JOptionPane.showMessageDialog( Board.board.dialog, 
                    "You own "+property.Name, property.Name, JOptionPane.PLAIN_MESSAGE );
        }
        else if(property.Owner == null)
        {
            int result = (int)JOptionPane.showOptionDialog( Board.board.dialog, 
                "No one owns "+property.Name+". Do you want to buy it? \n Cost: "+property.Cost, property.Name, JOptionPane.YES_NO_OPTION, 
                JOptionPane.QUESTION_MESSAGE, null, null, null);
            
            if(result==JOptionPane.YES_OPTION)
            {
                Game.bank.takeMoney( Game.Players.get( Game.currentPlayer), property.Cost);
                property.Owner = Game.Players.get( Game.currentPlayer);
            }
        }
        else
        {
            JOptionPane.showMessageDialog( Board.board.dialog, 
                    property.Owner.name+" owns "+property.Name+". You must pay rent of "+ property.calcRent(), property.Name, JOptionPane.PLAIN_MESSAGE );
            
            Game.bank.takeMoney( Game.Players.get( Game.currentPlayer), property.calcRent());
        }
    }
}
