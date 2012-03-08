/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package my;

import java.util.ArrayList;
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
    static int curPlayers = 0;
    public static int currentPlayer;
    
    static public boolean addPlayer()
    {
        if(curPlayers<=maxPlayers)
        {
            curPlayers++;
            players.add( new Player());
            players.get(curPlayers).location=0;
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public void Start()
    {
        board.BoardInit();
        currentPlayer = 0;
    }
}
