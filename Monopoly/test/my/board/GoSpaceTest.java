/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package my.board;

import my.Player;
import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;

/**
 *
 * @author Kayon
 */
public class GoSpaceTest {
    
    public GoSpaceTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    /**
     * Test of doAction method, of class GoSpace.
     */
    @Test
    public void OnGo() {
        String go = "go";
        GoSpace loc = new GoSpace(go, 0, 0);
        Player instance = new Player();
        if (instance.location == loc.XPos)
            System.out.println("On Go");        
        // TODO review the generated test code and remove the default call to fail.
        assertTrue(instance.location == 0);
    }    
}
