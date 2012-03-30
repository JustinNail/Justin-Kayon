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
                "Pay 10% of wealth in Luxury Taxes", "Luxury Tax", 
                JOptionPane.PLAIN_MESSAGE );
        
        int wealth;
        wealth = Game.players.get( Game.currentPlayer).funds;
        //TODO: add property worth calculations
        int value = ( int ) ( wealth * 0.10 );
        Game.bank.takeMoney( Game.players.get( Game.currentPlayer), value);
    }
}
