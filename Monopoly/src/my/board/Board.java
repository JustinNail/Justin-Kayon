package my.board;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Justin
 */
public class Board 
{
    public static List<Space> spaces  = new ArrayList<>();
    public static Board_jFrame board = new Board_jFrame();
    
    
    public void BoardInit()
    {
        
        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater( new Runnable()
        {
            @Override
            public void run()
            {
                board.setVisible( true );
            }
        } );
    }
}
