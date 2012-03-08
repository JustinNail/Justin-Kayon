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
    
    public Dice(int s)
    {
        sides=s;
    }
    
    public int Roll(int number)
    {
	int sum=0;
	for(int i=0;i<number;i++)
	{
            sum+=((Math.abs(r.nextInt()))%sides)+1;
	}
	//System.out.println("Sum= "+sum);
	return sum;
    }
}
