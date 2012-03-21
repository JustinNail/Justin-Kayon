/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package my;

import javax.swing.ImageIcon;
import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;

/**
 *
 * @author Justin
 */
public class PlayerTest
{
    
    public PlayerTest()
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
     * Test of roll method, of class Player.
     */
    @Test
    public void testRoll()
    {
        System.out.println( "roll" );
        Player instance = new Player();
        int minValue = 2;
        int maxValue = 12;
        int result = instance.roll();
        assertTrue(result<maxValue && result>minValue);
        fail( "Roll failed, outside of [2,12]" );
    }

    /**
     * Test of getAvatar method, of class Player.
     */
    @Test
    public void testGetAvatar()
    {
        System.out.println( "getAvatar" );
        Player instance = new Player();
        ImageIcon result = instance.getAvatar();
        assertTrue( result != null);
        fail( "Avatar returned null" );
    }

    /**
     * Test of Move method, of class Player. Starting from Go
     */
    @Test
    public void testMoveGo()
    {
        System.out.println( "Move: from Go" );
        int dist = 7;
        Player instance = new Player();
        instance.Move( dist );
        assertTrue(instance.location == dist);
        fail( "failed to move correct distance" );
    }
    /**
     * Test of Move method, of class Player. Looping around Go
     */
    @Test
    public void testMoveLoop()
    {
        System.out.println( "Move: loop around Go" );
        int dist = 6;
        Player instance = new Player();
        instance.location=39;
        instance.Move( dist );
        assertTrue(instance.location == 5);
        fail( "failed to loop around correctly" );
    }
}
