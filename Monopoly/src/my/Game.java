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

/**
 *
 * @author Justin
 */
public class Game
{
    public static Board board = new Board();
    public static List<Player> players  = new ArrayList<>();
    public static Bank bank = new Bank();
    
    static final int maxPlayers = 8;
    static final int minPlayers = 2;
    public static int numPlayers = 0;
    public static int currentPlayer;
    
    static final int maxRound = 20;
    public static int currentRound=0;
    
    public static boolean started = false;
    
    static public boolean addPlayer()
    {
        if (!started)
        {
            if(numPlayers<=maxPlayers)
            {
                numPlayers++;
                players.add( new Player());
                players.get(numPlayers-1).location=0;
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
        if(started)
        {
            if(currentRound < maxRound)
            {
                currentRound++;
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
            Collections.shuffle( players );
            currentPlayer = 0;
            for(int i = 0; i < players.size(); i++)
            {
                bank.giveMoney( players.get(i), 1500);
            }
            started=true;
        }
        return started;
    }
}
