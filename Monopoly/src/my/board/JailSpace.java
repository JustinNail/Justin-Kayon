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
public class JailSpace extends Space
{
    public JailSpace(String name, int xPos, int yPos)
    {
        super(name, xPos, yPos);
    }
    @Override
    public void doAction()
    {
        if(Game.players.get( Game.currentPlayer).InJail)
        {
            Object[] options={"try to roll doubles","pay bail"};
            int result = (int)JOptionPane.showOptionDialog( Board.board.dialog, 
            "Try to get free", "In Jail :(", JOptionPane.YES_NO_OPTION, 
            JOptionPane.QUESTION_MESSAGE, null, options, null);

            if(result==JOptionPane.YES_OPTION)
            {
                Game.players.get( Game.currentPlayer).roll();
                if(Game.players.get( Game.currentPlayer).dice[0] ==
                        Game.players.get( Game.currentPlayer).dice[1])
                {
                    Game.players.get( Game.currentPlayer).InJail=false;
                }
            }
            else
            {
                Game.bank.takeMoney( Game.players.get( Game.currentPlayer), 50);
                Game.players.get( Game.currentPlayer).InJail=false;
            }
        }
    }
}
