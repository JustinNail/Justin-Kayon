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
public class IncomeTaxSpace extends Space
{
    public IncomeTaxSpace(String name, int xPos, int yPos)
    {
        super(name, xPos, yPos);
    }
    @Override
    public void doAction()
    {
        Object[] options={"$200","10% of wealth"};
        
        int result = (int)JOptionPane.showOptionDialog( Board.board.dialog, 
        "Pick your Tax option", "Income Tax", JOptionPane.YES_NO_OPTION, 
        JOptionPane.QUESTION_MESSAGE, null, options, null);

        if(result==JOptionPane.YES_OPTION)//$200
        {
            Game.bank.takeMoney( Game.players.get( Game.currentPlayer), 200);
        }
        else//15%
        {
            int wealth;
            wealth = Game.players.get( Game.currentPlayer).funds;
            //TODO: add property worth calculations
            int value = ( int ) ( wealth * 0.1 );
            Game.bank.takeMoney( Game.players.get( Game.currentPlayer), value);
        }         
    }
}
