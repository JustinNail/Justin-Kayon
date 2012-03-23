/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package my;

import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;

/**
 *
 * @author Justin
 */
public class GameTest
{
    
    public GameTest()
    {
    }

    @BeforeClass
    public static void setUpClass() throws Exception
    {
    }

    @AfterClass
    public static void tearDownClass() throws Exception
    {
    }

    /**
     * Test of addPlayer method, of class Game.
     */
    @Test
    public void testAddPlayer()
    {
        Game.numPlayers=0;
        Game.players.clear();
        Game.started=false;
        System.out.println( "addPlayer" );
        boolean result = Game.addPlayer();
        assertTrue( result );

    }

    /**
     * Test of Start method, of class Game. With valid number of players
     */
    @Test
    public void testStartValid()
    {
        System.out.println( "Start: Valid" );
        Game instance = new Game();
        instance.numPlayers=4;
        boolean result = instance.Start();
        assertTrue(result);

    }
    /**
     * Test of Start method, of class Game. With not enough players
     */
    @Test
    public void testStartSmall()
    {
        System.out.println( "Start: not enough" );
        Game instance = new Game();
        instance.numPlayers=1;
        boolean result = instance.Start();
        assertTrue(!result);

    }
    /**
     * Test of Start method, of class Game. With too many players
     */
    @Test
    public void testStartBig()
    {
        System.out.println( "Start: Too many" );
        Game instance = new Game();
        instance.numPlayers=9;
        boolean result = instance.Start();
        assertTrue(!result);

    }
    /**
     * Test of Start method, of class Game. Check for random order
     */
    @Test
    public void testStartRandom()
    {
        System.out.println( "Start: Random Order" );
        
        boolean HorseCar=false;
        boolean CarHorse=false;
        
        for(int i=0;i<100;i++)
        {
            Game.numPlayers=0;
            Game.players.clear();
            Game.started=false;
            
            Game.addPlayer();
            Game.players.get(Game.numPlayers-1).name="Car";

            Game.addPlayer();
            Game.players.get(Game.numPlayers-1).name="Horse";

            Game.Start();

            String first = Game.players.get(Game.currentPlayer).name;
            String second = Game.players.get(Game.currentPlayer+1).name;

            if("Horse".equals( first )&&"Car".equals( second ))
            {
                HorseCar=true; 
            }
            if("Car".equals( first )&&"Horse".equals( second ))
            {
                CarHorse=true; 
            }
        }
        assertTrue(HorseCar && CarHorse);
    }
    @Test
    public void TestRounds()
    {
        Game.numPlayers=0;
        Game.players.clear();
        Game.started=false;
        Game.addPlayer();
        Game.players.get(Game.numPlayers-1).name="Horse";
        Game.addPlayer();
        Game.players.get(Game.numPlayers-1).name="Car";
        Game.Start();
        System.out.println( "Game Rounds" );
        assertTrue(Game.playRound());
    }
}
