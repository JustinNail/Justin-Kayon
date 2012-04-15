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
 * @author Kayon
 */
public class BankTest {
    
    public BankTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    /**
     * Test of giveMoney method, of class Bank.
     */
    @Test
    public void testGiveMoney() 
    {
        System.out.println("giveMoney");
        Player p = new Player();
        p.funds=0;
        int amt = 5;
        Bank instance = new Bank();
        instance.giveMoney(p, amt);
        assertTrue(p.funds==5);
    }

    /**
     * Test of takeMoney method, of class Bank.
     */
    @Test
    public void testTakeMoney() {
        System.out.println("takeMoney");
        Player p = new Player();
        p.funds=5;
        int amt = 5;
        Bank instance = new Bank();
        instance.takeMoney(p, amt);
        assertTrue(p.funds==0);
    }
}
