import java.util.Random;
import java.lang.Math;

public class DiceRoller
{
	
	public int Roll(int dice, int number)
	{
		Random r = new Random();
		int sum=0;
		for(int i=0;i<number;i++)
		{
			sum+=((Math.abs(r.nextInt()))%dice)+1;
		}
		//System.out.println("Sum= "+sum);
		return sum;
	}
}