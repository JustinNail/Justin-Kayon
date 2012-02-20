package RollDice;

import org.junit.* ;
import static org.junit.Assert.* ;

public class BantonKayonDiceTest 
{
   @Test
   public void TestDiceRollClass() 
   {
      System.out.println("Test if pricePerMonth returns Euro...") ;
      DiceRollClass dice_test = new DiceRollClass();
      
      assertTrue(dice_test.DiceRoll(6,10) <= 60);
   }  
}