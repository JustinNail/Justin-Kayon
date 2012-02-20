import org.junit.* ;
import static org.junit.Assert.* ;

public class DiceRollerTest
{
	@Test
	public void test_Roll()
	{
		DiceRoller dr = new DiceRoller();
		for(int i=0; i<1000; i++)
		{
			assertTrue(dr.Roll(6,2)>0 && dr.Roll(6,2)<13);
		}
	}
}