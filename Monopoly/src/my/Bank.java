/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package my;

/**
 *
 * @author Justin
 */
public class Bank
{
    public void giveMoney(Player p, int amt)
    {
        p.funds+=amt;
    }
    public void takeMoney(Player p, int amt)
    {
        p.funds-=amt;
        
    }
}
