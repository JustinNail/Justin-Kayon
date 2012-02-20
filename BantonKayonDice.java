/**
 * Name :	 		Kayon Banton
 * Class:			Software Engineering with Java
 * Filename: 		BantonKayonAssignement1.java
 * Date Written:	February 19, 2012
 * Date Due:		February 20, 2012
 * Instructor:		Lonnie Bowe
 *   
 * Operating System: Windows Vista (64 bits)    
 *********************************************************************************************************/

package RollDice;

import java.io.*;
import java.util.*;

public class BantonKayonDice
{																		
	public static void main(String args[])
	{                								
		int sides = 0, dice = 0;
		int total = 0;
		
		Scanner in = new Scanner(System.in);						// Creating a new input method
		
		System.out.println();										// Print a blank line to screen
		System.out.print("How many sides does your dice have:\t");	// Print a message to the screen
        sides = in.nextInt();       								// Accepts input from the keyboard
        
        System.out.print("How many dice are you using:\t\t");		// Print a message to the screen
        dice = in.nextInt();       									// Accepts input from the keyboard
        
        // Sends sides and dice to DiceRoll to be created and rolled.
        // The total is returned and stored in dice_total.
		DiceRollClass dice_total = new DiceRollClass();	
		
		total = dice_total.DiceRoll(sides, dice);
		
		System.out.println();										// Print a blank line to screen
		System.out.println("Your total roll is " + total);		// Print a message to the screen
	}
}