/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package my;

import java.util.Random;

/**
 *
 * @author Justin
 */
public class Dice
{
    static Random r=new Random();
    int sides;
    int result;
    
    public Dice(int s)
    {
        sides=s;
    }
    
    public void Roll()
    {
	result=((Math.abs(r.nextInt()))%sides)+1;
    }
}
