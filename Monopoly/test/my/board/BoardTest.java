/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package my.board;

import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;

/**
 *
 * @author Justin
 */
public class BoardTest
{
    
    public BoardTest()
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
     * Test of BoardInit method, of class Board.
     */
    @Test
    public void testBoardInit()
    {
        System.out.println( "BoardInit" );
        Board instance = new Board();
        instance.BoardInit();
        // TODO review the generated test code and remove the default call to fail.
        fail( "The test case is a prototype." );
    }
}
