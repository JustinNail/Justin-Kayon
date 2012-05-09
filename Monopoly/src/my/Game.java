/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package my;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.JOptionPane;
import my.board.Board;
import my.board.ChanceSpace;
import my.board.CommChestSpace;

/**
 *
 * @author Justin
 */
public class Game
{
    public static Board board = new Board();
    public static List<Player> Players  = new ArrayList<>();
    public static Bank bank = new Bank();  
    
    static final int maxPlayers = 8;
    static final int minPlayers = 2;
    public static int numPlayers = 0;
    public static int currentPlayer;
    
    
    public static int currentRound=0;
    
    public static boolean started = false;
    
    static public boolean addPlayer()
    {
        if (!started)
        {
            if(numPlayers <= maxPlayers)
            {
                numPlayers++;
                Players.add( new Player());
                Players.get(numPlayers-1).location=0;
                return true;
            }
            else
            {
                return false;
            }
        }
        else
        {
            return false;
        }
        
    }
    public static boolean playRound()
    {
        for(int i = 0; i < Players.size(); i++)
        {
            if(Players.get(i).funds<=0)
            {
                Players.remove( i );
                numPlayers--;
            }
        }
        
        return numPlayers >=2;
    }
    public void Init()
    {
        board.BoardInit();
    }
    public static boolean Start()
    {
        if(numPlayers>maxPlayers || numPlayers<minPlayers)
        {
            started = false;
        }
        else
        {
            Collections.shuffle( Players );
            currentPlayer = 0;
            for(int i = 0; i < Players.size(); i++)
            {
                bank.giveMoney( Players.get(i), 1500);
            }            
            ChanceSpace.PopulateChance();
            Collections.shuffle( ChanceSpace.chance);
            CommChestSpace.PopulateCommChest();
            Collections.shuffle( CommChestSpace.comchest);
           
            started=true;
        }
        return started;
    }
}
