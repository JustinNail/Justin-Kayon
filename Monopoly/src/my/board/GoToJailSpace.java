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
public class GoToJailSpace extends Space
{
    public GoToJailSpace(String name, int xPos, int yPos)
    {
        super(name, xPos, yPos);
    }
    @Override
    public void doAction()
    {
        JOptionPane.showMessageDialog( Board.board.dialog, "Going to Jail :(", "uh oh", JOptionPane.PLAIN_MESSAGE );
        Game.players.get( Game.currentPlayer).location=10;//10=JailSpace;
        Board.spaces.get(10).doAction();
    }
}
