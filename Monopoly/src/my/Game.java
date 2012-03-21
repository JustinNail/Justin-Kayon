/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package my;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import my.board.Board;

/**
 *
 * @author Justin
 */
public class Game
{
    Board board = new Board();
    public static List<Player> players  = new ArrayList<>();
    
    static final int maxPlayers = 8;
    static final int minPlayers = 2;
    public static int numPlayers = 0;
    public static int currentPlayer;
    
    public static boolean started = false;
    
    static public boolean addPlayer()
    {
        if (!started)
        {
            if(numPlayers<=maxPlayers)
            {
                numPlayers++;
                players.add( new Player());
                players.get(numPlayers).location=0;
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
            started=true;
        }
        return started;
    }
}
