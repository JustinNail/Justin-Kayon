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
        System.out.println( "addPlayer" );
        boolean result = Game.addPlayer();
        assertTrue( result );
        fail( "Failed to add player" );
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
        fail( "Failed to start game" );
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
        fail( "Failed to not start game" );
    }
    /**
     * Test of Start method, of class Game. With too many players
     */
    @Test
    public void testStartBig()
    {
        System.out.println( "Start: Too many" );
        Game instance = new Game();
        instance.numPlayers=8;
        boolean result = instance.Start();
        assertTrue(!result);
        fail( "Failed to not start game" );
    }
}
