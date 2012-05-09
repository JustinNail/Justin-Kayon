/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package my.board;

import javax.swing.JOptionPane;
import my.Game;
import my.deck.Card;

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
        if(Game.Players.get( Game.currentPlayer).InJail)
        {
            Object[] options={"try to roll doubles","pay bail","Use Get Out of Jail Free Card"};
            int result = (int)JOptionPane.showOptionDialog( Board.board.dialog, 
            "Try to get free", "In Jail :(", JOptionPane.YES_NO_CANCEL_OPTION, 
            JOptionPane.QUESTION_MESSAGE, null, options, null);

            if(result==JOptionPane.YES_OPTION)
            {
                Game.Players.get( Game.currentPlayer).roll();
                if(Game.Players.get( Game.currentPlayer).dice[0].result ==
                        Game.Players.get( Game.currentPlayer).dice[1].result)
                {
                    JOptionPane.showMessageDialog( 
                            Board.board.dialog, "You're Free!", "Yay!", JOptionPane.PLAIN_MESSAGE );
                    
                    Game.Players.get( Game.currentPlayer).InJail=false;
                    
                    Game.Players.get( Game.currentPlayer).Move(
                            Game.Players.get( Game.currentPlayer).rolled);
                }
                else
                {
                    JOptionPane.showMessageDialog( 
                            Board.board.dialog, "You're Still in Jail", "Aww", JOptionPane.PLAIN_MESSAGE );
                }
                
            }
            else if (result==JOptionPane.NO_OPTION)
            {
                Game.bank.takeMoney( Game.Players.get( Game.currentPlayer), 50);
                JOptionPane.showMessageDialog( Board.board.dialog, "You're Free!", "Yay!", JOptionPane.PLAIN_MESSAGE );
                Game.Players.get( Game.currentPlayer).InJail=false;
                
                Game.Players.get( Game.currentPlayer).takeTurn();
            }
            
            else
            {
                if(Game.Players.get( Game.currentPlayer).ChanceJailCard)
                {
                   Game.Players.get( Game.currentPlayer).ChanceJailCard=false;
                    JOptionPane.showMessageDialog( Board.board.dialog, "You're Free!", "Yay!", JOptionPane.PLAIN_MESSAGE );
                    Game.Players.get( Game.currentPlayer).InJail=false;
                    
                    ChanceSpace.chance.add(new Card(8, "Get out of Jail Free – this card may be kept until needed, "
                    + "or traded/sold"));
                    
                    Game.Players.get( Game.currentPlayer).takeTurn();
                }
                else if(Game.Players.get( Game.currentPlayer).ChestJailCard)
                {
                    Game.Players.get( Game.currentPlayer).ChestJailCard=false;
                    JOptionPane.showMessageDialog( Board.board.dialog, "You're Free!", "Yay!", JOptionPane.PLAIN_MESSAGE );
                    Game.Players.get( Game.currentPlayer).InJail=false;
                    
                    CommChestSpace.comchest.add(new Card(4, "Get Out of Jail Free – this card may be kept until needed, "
                    + "or sold"));
                    
                    Game.Players.get( Game.currentPlayer).takeTurn();
                }
                else
                {
                    JOptionPane.showMessageDialog( Board.board.dialog, "You have no Get Out of Jail Free Cards", 
                            "Sorry :(", JOptionPane.PLAIN_MESSAGE );
                }
            }
        }
    }
}
