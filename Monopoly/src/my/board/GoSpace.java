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
public class GoSpace extends Space
{
    public GoSpace(String name, int xPos, int yPos)
    {
        super(name, xPos, yPos);
    }
    @Override
    public void doAction()
    {
        JOptionPane.showMessageDialog( Board.board.dialog, "Passed Go, got $200", "Yay!", JOptionPane.PLAIN_MESSAGE );
        Game.bank.giveMoney( Game.Players.get( Game.currentPlayer),200);
    }
}
