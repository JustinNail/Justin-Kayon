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
    Board_jFrame board = new Board_jFrame();
    
    
    
    
    public void BoardInit()
    {
        try
        {
            for ( javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels() )
            {
                if ( "Nimbus".equals( info.getName() ) )
                {
                    javax.swing.UIManager.setLookAndFeel( info.getClassName() );
                    break;
                }
            }
        }
        catch ( ClassNotFoundException ex )
        {
            java.util.logging.Logger.getLogger( Board_jFrame.class.getName() ).log( java.util.logging.Level.SEVERE, null, ex );
        }
        catch ( InstantiationException ex )
        {
            java.util.logging.Logger.getLogger( Board_jFrame.class.getName() ).log( java.util.logging.Level.SEVERE, null, ex );
        }
        catch ( IllegalAccessException ex )
        {
            java.util.logging.Logger.getLogger( Board_jFrame.class.getName() ).log( java.util.logging.Level.SEVERE, null, ex );
        }
        catch ( javax.swing.UnsupportedLookAndFeelException ex )
        {
            java.util.logging.Logger.getLogger( Board_jFrame.class.getName() ).log( java.util.logging.Level.SEVERE, null, ex );
        }

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater( new Runnable()
        {
            public void run()
            {
                new Board_jFrame().setVisible( true );
            }
        } );
    }
}
