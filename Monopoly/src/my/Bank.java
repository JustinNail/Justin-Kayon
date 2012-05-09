/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package my;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import my.board.Board;
import my.board.PropertySpace;

/**
 *
 * @author Justin
 */
public class Bank
{
    private int numHouse;
    private int numHotel;
    
    public void giveMoney(Player p, int amt)
    {
        p.funds+=amt;
    }
    public void takeMoney(Player p, int amt)
    {
        while(p.funds-amt <= 0)
        {
            Object[] options={"Sell Houses/Hotel","Mortgage Properties"};
            int result = (int)JOptionPane.showOptionDialog( Board.board.dialog, 
            "What do you want to do?", "BANKRUPTCY!!! OH NOES!", JOptionPane.YES_NO_OPTION, 
            JOptionPane.QUESTION_MESSAGE, null, options, null);
            
            if(result==JOptionPane.YES_OPTION)
            {
                
            }
            else if(result == JOptionPane.NO_OPTION)
            {
                //refill with owned properties
                List<String> props = new ArrayList<>();
                for(int j = 0; j<Board.spaces.size();j++)
                {
                    if(Board.spaces.get(j) instanceof PropertySpace )
                    {
                        if(PropertySpace.class.cast(Board.spaces.get(j)).property.Owner ==
                                Game.Players.get(Game.currentPlayer))
                        {
                            if(!(PropertySpace.class.cast(Board.spaces.get( j )).property.UpgradeLevel>0))
                            {
                                props.add(Board.spaces.get( j ).Name);
                            }
                            
                        }
                    }
                }
                String s = (String)JOptionPane.showInputDialog(Board.board.dialog,
                        "Pick a Property to Mortgage", "Properties",
                        JOptionPane.PLAIN_MESSAGE,null,props.toArray(),null);

                for(int j = 0; j<Board.spaces.size();j++)
                {
                    if(Board.spaces.get(j) instanceof PropertySpace )
                    {
                        if(Board.spaces.get( j ).Name.equals( s ))
                        {
                            giveMoney(p,PropertySpace.class.cast(Board.spaces.get(j)).property.Mortgage);
                            PropertySpace.class.cast(Board.spaces.get(j)).property.Owner=null;
                        }
                    }
                }
                
            }
            
        }
        
        p.funds-=amt;
        
    }
}
