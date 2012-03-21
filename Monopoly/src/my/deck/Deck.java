/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package my.deck;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



/**
 *
 * @author Justin
 */
public class Deck
{
    List<Card> deck = new ArrayList<>();
    
    public void Shuffle()
    {
        Collections.shuffle( deck );
    }
}
