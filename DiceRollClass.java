package RollDice;

/**
 * This class simulates rolling has many dice as the user specifies 
 * (HowMany). The number of sides on the dice is also specified by the 
 * user (Sides).  The total number of the roll is returned.
 * 	
 * @param Sides
 * @param HowMany
 * @return total_roll
 */
public class DiceRollClass 
{	
	public int DiceRoll(int Sides, int HowMany)
	{
		  int dice[] = new int[HowMany];   							// The number of dice to roll is created.
          int total_roll = 0;   									// To store the sum of all the dice.
          
          // This for loop randomly generates the value of each die 
          // and stores it in the dice array.  The total value is
          // also calculated.
          for (int i = 0; i < HowMany; i++)		
          {
        	  dice[i] = (int)(Math.random()*Sides + 1);
              total_roll += dice[i];
              
              /*System.out.println();								// Print a blank line to screen
              // Prints the value of each die to the screen*/
              System.out.println("Dice " + (i+1) + " rolled " + dice[i]); 
          }          
          
          return total_roll;										// Returns the sum of all the dice
	}
}