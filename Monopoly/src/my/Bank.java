/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package my;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Justin
 */
public class Bank
{
    private int numHouse;
    private int numHotel;
    
    private List<Property> unownedProperties = new ArrayList();
    
    public void giveMoney(Player p, int amt)
    {
        p.funds+=amt;
    }
    public void takeMoney(Player p, int amt)
    {
        p.funds-=amt;
        
    }
}
