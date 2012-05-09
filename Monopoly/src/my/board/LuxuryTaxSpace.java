/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package my.board;

import javax.swing.JOptionPane;
import my.Game;

/**
 *
 * @author Justin
 */
public class LuxuryTaxSpace extends Space
{
    public LuxuryTaxSpace(String name, int xPos, int yPos)
    {
        super(name, xPos, yPos);
    }
    @Override
    public void doAction()
    {
        JOptionPane.showMessageDialog( Board.board.dialog, 
                "Pay $75 in Luxury Taxes", "Luxury Tax", 
                JOptionPane.PLAIN_MESSAGE );
        
        
        Game.bank.takeMoney( Game.Players.get( Game.currentPlayer), 75);
    }
}
