/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package my.board;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;
import my.Game;
/**
 *
 * @author Justin
 */
public class Board_jFrame extends javax.swing.JFrame
{

    /**
     * Creates new form Board
     */
    List<JLabel> playerLabels = new ArrayList();
    List<JLabel> playerNames = new ArrayList();
    List<JTextField> playerFunds = new ArrayList();
    List<JTextField> playerLocations = new ArrayList();
    
    public JLayeredPane dialog = new JLayeredPane();
    
    public Board_jFrame()
    {
        initComponents();
        spaces_Init();
        players_Init();
        dialog = jLayeredPane1;
    }

    private void players_Init()
    {
        jLabel_Player1.setVisible(false);
        
        jLabel_Player1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/board_Resources/Car.png")));
        playerLabels.add(jLabel_Player1);
        
        playerNames.add(jLabel_Player1Name);
        playerFunds.add(jTextField_Player1Money);
        playerLocations.add(jTextField_Player1Location);
        
        
        jLabel_Player2.setVisible(false);
        jLabel_Player1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/board_Resources/Hat.png")));
        playerLabels.add(jLabel_Player2);
        playerNames.add(jLabel_Player2Name);
        playerFunds.add(jTextField_Player2Money);
        playerLocations.add(jTextField_Player2Location);
        
        
        jLabel_Player3.setVisible(false);
        jLabel_Player1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/board_Resources/Dog.png")));
        playerLabels.add(jLabel_Player3);
        playerNames.add(jLabel_Player3Name);
        playerFunds.add(jTextField_Player3Money);
        playerLocations.add(jTextField_Player3Location);
        
        
        jLabel_Player4.setVisible(false);
        jLabel_Player1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/board_Resources/Iron.png")));
        playerLabels.add(jLabel_Player4);
        playerNames.add(jLabel_Player4Name);
        playerFunds.add(jTextField_Player4Money);
        playerLocations.add(jTextField_Player4Location);
        
        
        jLabel_Player5.setVisible(false);
        jLabel_Player1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/board_Resources/Shoe.png")));
        playerLabels.add(jLabel_Player5);
        playerNames.add(jLabel_Player5Name);
        playerFunds.add(jTextField_Player5Money);
        playerLocations.add(jTextField_Player5Location);
        
        
        jLabel_Player6.setVisible(false);
        jLabel_Player1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/board_Resources/Ship.png")));
        playerLabels.add(jLabel_Player6);
        playerNames.add(jLabel_Player6Name);
        playerFunds.add(jTextField_Player6Money);
        playerLocations.add(jTextField_Player6Location);
        
        
        jLabel_Player7.setVisible(false);
        jLabel_Player1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/board_Resources/Thimble.png")));
        playerLabels.add(jLabel_Player7);
        playerNames.add(jLabel_Player7Name);
        playerFunds.add(jTextField_Player7Money);
        playerLocations.add(jTextField_Player7Location);
        
        
        jLabel_Player8.setVisible(false);
        jLabel_Player1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/board_Resources/WheelBarrow.png")));
        playerLabels.add(jLabel_Player8);
        playerNames.add(jLabel_Player8Name);
        playerFunds.add(jTextField_Player8Money);
        playerLocations.add(jTextField_Player8Location);
    }
    private void spaces_Init()
    {
        Board.spaces.add( new GoSpace("Go",jButton_Go.getX(),jButton_Go.getY()));
        Board.spaces.add( new PropertySpace("Flying Fortress",jButton_Purple1.getX(),jButton_Purple1.getY()));
        Board.spaces.add( new CardSpace("Community Chest",jButton_Chest1.getX(),jButton_Chest1.getY()));
        Board.spaces.add( new PropertySpace("Pandemonium",jButton_Purple2.getX(),jButton_Purple2.getY()));
        Board.spaces.add( new IncomeTaxSpace("Income Tax",jButton_Tax_Income.getX(),jButton_Tax_Income.getY()));
        Board.spaces.add( new PropertySpace("*Rail1*",jButton_Rail1.getX(),jButton_Rail1.getY()));
        Board.spaces.add( new PropertySpace("Floating Continent",jButton_Teal1.getX(),jButton_Teal1.getY()));
        Board.spaces.add( new CardSpace("Chance",jButton_Chance1.getX(),jButton_Chance1.getY()));
        Board.spaces.add( new PropertySpace("Crystal Tower",jButton_Teal2.getX(),jButton_Teal2.getY()));
        Board.spaces.add( new PropertySpace("Baron",jButton_Teal3.getX(),jButton_Teal3.getY()));
        Board.spaces.add( new JailSpace("Jail",jButton_Jail.getX(),jButton_Jail.getY()));
        Board.spaces.add( new PropertySpace("Ancient's Library",jButton_Pink1.getX(),jButton_Pink1.getY()));
        Board.spaces.add( new PropertySpace("Electric Company",jButton_Utility_Electric.getX(),jButton_Utility_Electric.getY()));
        Board.spaces.add( new PropertySpace("Exdeath's Castle",jButton_Pink2.getX(),jButton_Pink2.getY()));
        Board.spaces.add( new PropertySpace("Castle Kuza",jButton_Pink3.getX(),jButton_Pink3.getY()));
        Board.spaces.add( new PropertySpace("*Rail2*",jButton_Rail2.getX(),jButton_Rail2.getY()));
        Board.spaces.add( new PropertySpace("Figaro Castle",jButton_Orange1.getX(),jButton_Orange1.getY()));
        Board.spaces.add( new CardSpace("Community Chest",jButton_Chest2.getX(),jButton_Chest2.getY()));
        Board.spaces.add( new PropertySpace("Imperial Palace",jButton_Orange2.getX(),jButton_Orange2.getY()));
        Board.spaces.add( new PropertySpace("Kefka's Tower",jButton_Orange3.getX(),jButton_Orange3.getY()));
        Board.spaces.add( new FreeParkingSpace("Free Parking",jButton_FreeParking.getX(),jButton_FreeParking.getY()));
        Board.spaces.add( new PropertySpace("Golden Saucer",jButton_Red1.getX(),jButton_Red1.getY()));
        Board.spaces.add( new CardSpace("Chance",jButton_Chance2.getX(),jButton_Chance2.getY()));
        Board.spaces.add( new PropertySpace("Junon",jButton_Red2.getX(),jButton_Red2.getY()));
        Board.spaces.add( new PropertySpace("Midgar",jButton_Red3.getX(),jButton_Red3.getY()));
        Board.spaces.add( new PropertySpace("*Rail3*",jButton_Rail3.getX(),jButton_Rail3.getY()));
        Board.spaces.add( new PropertySpace("Balamb",jButton_Yellow1.getX(),jButton_Yellow1.getY()));
        Board.spaces.add( new PropertySpace("Esthar",jButton_Yellow2.getX(),jButton_Yellow2.getY()));
        Board.spaces.add( new PropertySpace("Water Works",jButton_Utility_Water.getX(),jButton_Utility_Water.getY()));
        Board.spaces.add( new PropertySpace("Lunatic Pandora",jButton_Yellow3.getX(),jButton_Yellow3.getY()));
        Board.spaces.add( new GoToJailSpace("Go to Jail",jButton_GoToJail.getX(),jButton_GoToJail.getY()));
        Board.spaces.add( new PropertySpace("Alexandria",jButton_Green1.getX(),jButton_Green1.getY()));
        Board.spaces.add( new PropertySpace("Burmecia",jButton_Green2.getX(),jButton_Green2.getY()));
        Board.spaces.add( new CardSpace("Community Chest",jButton_Chest3.getX(),jButton_Chest3.getY()));
        Board.spaces.add( new PropertySpace("Ban Bal",jButton_Green3.getX(),jButton_Green3.getY()));
        Board.spaces.add( new PropertySpace("*Rail4*",jButton_Rail4.getX(),jButton_Rail4.getY()));
        Board.spaces.add( new CardSpace("Chance",jButton_Chance3.getX(),jButton_Chance3.getY()));
        Board.spaces.add( new PropertySpace("Besaid",jButton_Blue1.getX(),jButton_Blue1.getY()));
        Board.spaces.add( new LuxuryTaxSpace("Luxury Tax",jButton_Tax_Lux.getX(),jButton_Tax_Lux.getY()));
        Board.spaces.add( new PropertySpace("Zanarkand",jButton_Blue2.getX(),jButton_Blue2.getY()));
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings( "unchecked" )
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLabel_Player1 = new javax.swing.JLabel();
        jLabel_Player2 = new javax.swing.JLabel();
        jLabel_Player3 = new javax.swing.JLabel();
        jLabel_Player4 = new javax.swing.JLabel();
        jLabel_Player5 = new javax.swing.JLabel();
        jLabel_Player6 = new javax.swing.JLabel();
        jLabel_Player7 = new javax.swing.JLabel();
        jLabel_Player8 = new javax.swing.JLabel();
        jButton_Rail1 = new javax.swing.JButton();
        jButton_Rail2 = new javax.swing.JButton();
        jButton_Rail3 = new javax.swing.JButton();
        jButton_Rail4 = new javax.swing.JButton();
        jButton_Utility_Electric = new javax.swing.JButton();
        jButton_Utility_Water = new javax.swing.JButton();
        jButton_Go = new javax.swing.JButton();
        jButton_FreeParking = new javax.swing.JButton();
        jButton_Jail = new javax.swing.JButton();
        jButton_GoToJail = new javax.swing.JButton();
        jButton_Tax_Income = new javax.swing.JButton();
        jButton_Tax_Lux = new javax.swing.JButton();
        jButton_Chest1 = new javax.swing.JButton();
        jButton_Chest2 = new javax.swing.JButton();
        jButton_Chest3 = new javax.swing.JButton();
        jButton_Chance1 = new javax.swing.JButton();
        jButton_Chance2 = new javax.swing.JButton();
        jButton_Chance3 = new javax.swing.JButton();
        jButton_Purple1 = new javax.swing.JButton();
        jButton_Purple2 = new javax.swing.JButton();
        jButton_Teal1 = new javax.swing.JButton();
        jButton_Teal2 = new javax.swing.JButton();
        jButton_Teal3 = new javax.swing.JButton();
        jButton_Pink1 = new javax.swing.JButton();
        jButton_Pink2 = new javax.swing.JButton();
        jButton_Pink3 = new javax.swing.JButton();
        jButton_Orange1 = new javax.swing.JButton();
        jButton_Orange2 = new javax.swing.JButton();
        jButton_Orange3 = new javax.swing.JButton();
        jButton_Red1 = new javax.swing.JButton();
        jButton_Red2 = new javax.swing.JButton();
        jButton_Red3 = new javax.swing.JButton();
        jButton_Yellow1 = new javax.swing.JButton();
        jButton_Yellow2 = new javax.swing.JButton();
        jButton_Yellow3 = new javax.swing.JButton();
        jButton_Green1 = new javax.swing.JButton();
        jButton_Green2 = new javax.swing.JButton();
        jButton_Green3 = new javax.swing.JButton();
        jButton_Blue1 = new javax.swing.JButton();
        jButton_Blue2 = new javax.swing.JButton();
        Center = new javax.swing.JLabel();
        jPanel_Player1 = new javax.swing.JPanel();
        jLabel_Funds = new javax.swing.JLabel();
        jTextField_Player1Money = new javax.swing.JTextField();
        jTextField_Player1Location = new javax.swing.JTextField();
        jLabel_Location = new javax.swing.JLabel();
        jLabel_Player1Name = new javax.swing.JLabel();
        jPanel_Player3 = new javax.swing.JPanel();
        jTextField_Player3Money = new javax.swing.JTextField();
        jLabel_Funds1 = new javax.swing.JLabel();
        jLabel_Location2 = new javax.swing.JLabel();
        jTextField_Player3Location = new javax.swing.JTextField();
        jLabel_Player3Name = new javax.swing.JLabel();
        jPanel_Player7 = new javax.swing.JPanel();
        jTextField_Player7Money = new javax.swing.JTextField();
        jLabel_Funds6 = new javax.swing.JLabel();
        jLabel_Location6 = new javax.swing.JLabel();
        jTextField_Player7Location = new javax.swing.JTextField();
        jLabel_Player7Name = new javax.swing.JLabel();
        jPanel_Player5 = new javax.swing.JPanel();
        jTextField_Player5Money = new javax.swing.JTextField();
        jLabel_Funds4 = new javax.swing.JLabel();
        jLabel_Location4 = new javax.swing.JLabel();
        jTextField_Player5Location = new javax.swing.JTextField();
        jLabel_Player5Name = new javax.swing.JLabel();
        jPanel_Player8 = new javax.swing.JPanel();
        jTextField_Player8Money = new javax.swing.JTextField();
        jLabel_Funds7 = new javax.swing.JLabel();
        jLabel_Location7 = new javax.swing.JLabel();
        jTextField_Player8Location = new javax.swing.JTextField();
        jLabel_Player8Name = new javax.swing.JLabel();
        jPanel_Player6 = new javax.swing.JPanel();
        jTextField_Player6Money = new javax.swing.JTextField();
        jLabel_Funds5 = new javax.swing.JLabel();
        jLabel_Location5 = new javax.swing.JLabel();
        jTextField_Player6Location = new javax.swing.JTextField();
        jLabel_Player6Name = new javax.swing.JLabel();
        jPanel_Player4 = new javax.swing.JPanel();
        jTextField_Player4Money = new javax.swing.JTextField();
        jLabel_Funds3 = new javax.swing.JLabel();
        jLabel_Location3 = new javax.swing.JLabel();
        jTextField_Player4Location = new javax.swing.JTextField();
        jLabel_Player4Name = new javax.swing.JLabel();
        jPanel_Player2 = new javax.swing.JPanel();
        jTextField_Player2Money = new javax.swing.JTextField();
        jLabel_Funds2 = new javax.swing.JLabel();
        jLabel_Location1 = new javax.swing.JLabel();
        jTextField_Player2Location = new javax.swing.JTextField();
        jLabel_Player2Name = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextField_CurrentPlayer = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField_Round = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu_File = new javax.swing.JMenu();
        jMenuItem_Exit = new javax.swing.JMenuItem();
        jMenu_Game = new javax.swing.JMenu();
        jMenuItem_AddPlayer = new javax.swing.JMenuItem();
        jMenuItem_Start = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1200, 768));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_Player1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/board_Resources/Car.png"))); // NOI18N
        jLabel_Player1.setBounds(650, 660, 50, 20);
        jLayeredPane1.add(jLabel_Player1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel_Player2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/board_Resources/Dog.png"))); // NOI18N
        jLabel_Player2.setBounds(650, 660, 50, 20);
        jLayeredPane1.add(jLabel_Player2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel_Player3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/board_Resources/Hat.png"))); // NOI18N
        jLabel_Player3.setBounds(650, 660, 50, 20);
        jLayeredPane1.add(jLabel_Player3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel_Player4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/board_Resources/Iron.png"))); // NOI18N
        jLabel_Player4.setBounds(650, 660, 50, 20);
        jLayeredPane1.add(jLabel_Player4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel_Player5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/board_Resources/Ship.png"))); // NOI18N
        jLabel_Player5.setBounds(650, 660, 50, 20);
        jLayeredPane1.add(jLabel_Player5, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel_Player6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/board_Resources/Shoe.png"))); // NOI18N
        jLabel_Player6.setBounds(650, 660, 50, 20);
        jLayeredPane1.add(jLabel_Player6, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel_Player7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/board_Resources/Thimble.png"))); // NOI18N
        jLabel_Player7.setBounds(650, 660, 50, 20);
        jLayeredPane1.add(jLabel_Player7, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel_Player8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/board_Resources/WheelBarrow.png"))); // NOI18N
        jLabel_Player8.setBounds(650, 660, 50, 20);
        jLayeredPane1.add(jLabel_Player8, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton_Rail1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/board_Resources/Rail.png"))); // NOI18N
        jButton_Rail1.setAlignmentY(0.0F);
        jButton_Rail1.setBorderPainted(false);
        jButton_Rail1.setMaximumSize(new java.awt.Dimension(60, 90));
        jButton_Rail1.setMinimumSize(new java.awt.Dimension(60, 90));
        jButton_Rail1.setOpaque(false);
        jButton_Rail1.setPreferredSize(new java.awt.Dimension(60, 90));
        jButton_Rail1.setBounds(330, 630, 60, 90);
        jLayeredPane1.add(jButton_Rail1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton_Rail2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/board_Resources/RailL.png"))); // NOI18N
        jButton_Rail2.setAlignmentY(0.0F);
        jButton_Rail2.setBorderPainted(false);
        jButton_Rail2.setMaximumSize(new java.awt.Dimension(100, 67));
        jButton_Rail2.setMinimumSize(new java.awt.Dimension(100, 67));
        jButton_Rail2.setOpaque(false);
        jButton_Rail2.setPreferredSize(new java.awt.Dimension(100, 67));
        jButton_Rail2.setBounds(0, 330, 90, 60);
        jLayeredPane1.add(jButton_Rail2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton_Rail3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/board_Resources/Rail.png"))); // NOI18N
        jButton_Rail3.setAlignmentY(0.0F);
        jButton_Rail3.setBorderPainted(false);
        jButton_Rail3.setMaximumSize(new java.awt.Dimension(60, 90));
        jButton_Rail3.setMinimumSize(new java.awt.Dimension(60, 90));
        jButton_Rail3.setOpaque(false);
        jButton_Rail3.setPreferredSize(new java.awt.Dimension(60, 90));
        jButton_Rail3.setBounds(330, 0, 60, 90);
        jLayeredPane1.add(jButton_Rail3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton_Rail4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/board_Resources/RailR.png"))); // NOI18N
        jButton_Rail4.setAlignmentY(0.0F);
        jButton_Rail4.setBorderPainted(false);
        jButton_Rail4.setMaximumSize(new java.awt.Dimension(100, 67));
        jButton_Rail4.setMinimumSize(new java.awt.Dimension(100, 67));
        jButton_Rail4.setOpaque(false);
        jButton_Rail4.setPreferredSize(new java.awt.Dimension(100, 67));
        jButton_Rail4.setBounds(630, 330, 90, 60);
        jLayeredPane1.add(jButton_Rail4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton_Utility_Electric.setIcon(new javax.swing.ImageIcon(getClass().getResource("/board_Resources/Utility_E.png"))); // NOI18N
        jButton_Utility_Electric.setAlignmentY(0.0F);
        jButton_Utility_Electric.setBorderPainted(false);
        jButton_Utility_Electric.setMaximumSize(new java.awt.Dimension(100, 67));
        jButton_Utility_Electric.setMinimumSize(new java.awt.Dimension(100, 67));
        jButton_Utility_Electric.setOpaque(false);
        jButton_Utility_Electric.setPreferredSize(new java.awt.Dimension(100, 67));
        jButton_Utility_Electric.setBounds(0, 510, 90, 60);
        jLayeredPane1.add(jButton_Utility_Electric, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton_Utility_Water.setIcon(new javax.swing.ImageIcon(getClass().getResource("/board_Resources/Utility_W.png"))); // NOI18N
        jButton_Utility_Water.setAlignmentY(0.0F);
        jButton_Utility_Water.setBorderPainted(false);
        jButton_Utility_Water.setMaximumSize(new java.awt.Dimension(60, 90));
        jButton_Utility_Water.setMinimumSize(new java.awt.Dimension(60, 90));
        jButton_Utility_Water.setOpaque(false);
        jButton_Utility_Water.setPreferredSize(new java.awt.Dimension(60, 90));
        jButton_Utility_Water.setBounds(510, 0, 60, 90);
        jLayeredPane1.add(jButton_Utility_Water, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton_Go.setIcon(new javax.swing.ImageIcon(getClass().getResource("/board_Resources/cornergo.png"))); // NOI18N
        jButton_Go.setAlignmentY(0.0F);
        jButton_Go.setBorderPainted(false);
        jButton_Go.setMaximumSize(new java.awt.Dimension(100, 100));
        jButton_Go.setMinimumSize(new java.awt.Dimension(100, 100));
        jButton_Go.setOpaque(false);
        jButton_Go.setPreferredSize(new java.awt.Dimension(100, 100));
        jButton_Go.setBounds(630, 630, 90, 90);
        jLayeredPane1.add(jButton_Go, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton_FreeParking.setIcon(new javax.swing.ImageIcon(getClass().getResource("/board_Resources/cornerfreepark.png"))); // NOI18N
        jButton_FreeParking.setAlignmentY(0.0F);
        jButton_FreeParking.setBorderPainted(false);
        jButton_FreeParking.setMaximumSize(new java.awt.Dimension(100, 100));
        jButton_FreeParking.setMinimumSize(new java.awt.Dimension(100, 100));
        jButton_FreeParking.setOpaque(false);
        jButton_FreeParking.setPreferredSize(new java.awt.Dimension(100, 100));
        jButton_FreeParking.setBounds(0, 0, 90, 90);
        jLayeredPane1.add(jButton_FreeParking, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton_Jail.setIcon(new javax.swing.ImageIcon(getClass().getResource("/board_Resources/cornerinjail.png"))); // NOI18N
        jButton_Jail.setAlignmentY(0.0F);
        jButton_Jail.setBorderPainted(false);
        jButton_Jail.setMaximumSize(new java.awt.Dimension(100, 100));
        jButton_Jail.setMinimumSize(new java.awt.Dimension(100, 100));
        jButton_Jail.setOpaque(false);
        jButton_Jail.setPreferredSize(new java.awt.Dimension(100, 100));
        jButton_Jail.setBounds(0, 630, 90, 90);
        jLayeredPane1.add(jButton_Jail, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton_GoToJail.setIcon(new javax.swing.ImageIcon(getClass().getResource("/board_Resources/cornerjail.png"))); // NOI18N
        jButton_GoToJail.setAlignmentY(0.0F);
        jButton_GoToJail.setBorderPainted(false);
        jButton_GoToJail.setMaximumSize(new java.awt.Dimension(100, 100));
        jButton_GoToJail.setMinimumSize(new java.awt.Dimension(100, 100));
        jButton_GoToJail.setOpaque(false);
        jButton_GoToJail.setPreferredSize(new java.awt.Dimension(100, 100));
        jButton_GoToJail.setBounds(630, 0, 90, 90);
        jLayeredPane1.add(jButton_GoToJail, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton_Tax_Income.setIcon(new javax.swing.ImageIcon(getClass().getResource("/board_Resources/Tax_In.png"))); // NOI18N
        jButton_Tax_Income.setAlignmentY(0.0F);
        jButton_Tax_Income.setBorderPainted(false);
        jButton_Tax_Income.setMaximumSize(new java.awt.Dimension(60, 90));
        jButton_Tax_Income.setMinimumSize(new java.awt.Dimension(60, 90));
        jButton_Tax_Income.setOpaque(false);
        jButton_Tax_Income.setPreferredSize(new java.awt.Dimension(60, 90));
        jButton_Tax_Income.setBounds(390, 630, 60, 90);
        jLayeredPane1.add(jButton_Tax_Income, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton_Tax_Lux.setIcon(new javax.swing.ImageIcon(getClass().getResource("/board_Resources/Tax_Lux.png"))); // NOI18N
        jButton_Tax_Lux.setAlignmentY(0.0F);
        jButton_Tax_Lux.setBorderPainted(false);
        jButton_Tax_Lux.setMaximumSize(new java.awt.Dimension(100, 67));
        jButton_Tax_Lux.setMinimumSize(new java.awt.Dimension(100, 67));
        jButton_Tax_Lux.setOpaque(false);
        jButton_Tax_Lux.setPreferredSize(new java.awt.Dimension(100, 67));
        jButton_Tax_Lux.setBounds(630, 510, 90, 60);
        jLayeredPane1.add(jButton_Tax_Lux, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton_Chest1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/board_Resources/Chest.png"))); // NOI18N
        jButton_Chest1.setAlignmentY(0.0F);
        jButton_Chest1.setBorderPainted(false);
        jButton_Chest1.setMaximumSize(new java.awt.Dimension(60, 90));
        jButton_Chest1.setMinimumSize(new java.awt.Dimension(60, 90));
        jButton_Chest1.setOpaque(false);
        jButton_Chest1.setPreferredSize(new java.awt.Dimension(60, 90));
        jButton_Chest1.setBounds(510, 630, 60, 90);
        jLayeredPane1.add(jButton_Chest1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton_Chest2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/board_Resources/ChestL.png"))); // NOI18N
        jButton_Chest2.setAlignmentY(0.0F);
        jButton_Chest2.setBorderPainted(false);
        jButton_Chest2.setMaximumSize(new java.awt.Dimension(100, 67));
        jButton_Chest2.setMinimumSize(new java.awt.Dimension(100, 67));
        jButton_Chest2.setOpaque(false);
        jButton_Chest2.setPreferredSize(new java.awt.Dimension(100, 67));
        jButton_Chest2.setBounds(0, 210, 90, 60);
        jLayeredPane1.add(jButton_Chest2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton_Chest3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/board_Resources/ChestR.png"))); // NOI18N
        jButton_Chest3.setAlignmentY(0.0F);
        jButton_Chest3.setBorderPainted(false);
        jButton_Chest3.setMaximumSize(new java.awt.Dimension(100, 67));
        jButton_Chest3.setMinimumSize(new java.awt.Dimension(100, 67));
        jButton_Chest3.setOpaque(false);
        jButton_Chest3.setPreferredSize(new java.awt.Dimension(100, 67));
        jButton_Chest3.setBounds(630, 210, 90, 60);
        jLayeredPane1.add(jButton_Chest3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton_Chance1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/board_Resources/Chance.png"))); // NOI18N
        jButton_Chance1.setAlignmentY(0.0F);
        jButton_Chance1.setBorderPainted(false);
        jButton_Chance1.setMaximumSize(new java.awt.Dimension(60, 90));
        jButton_Chance1.setMinimumSize(new java.awt.Dimension(60, 90));
        jButton_Chance1.setOpaque(false);
        jButton_Chance1.setPreferredSize(new java.awt.Dimension(60, 90));
        jButton_Chance1.setBounds(210, 630, 60, 90);
        jLayeredPane1.add(jButton_Chance1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton_Chance2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/board_Resources/Chance.png"))); // NOI18N
        jButton_Chance2.setAlignmentY(0.0F);
        jButton_Chance2.setBorderPainted(false);
        jButton_Chance2.setMaximumSize(new java.awt.Dimension(60, 90));
        jButton_Chance2.setMinimumSize(new java.awt.Dimension(60, 90));
        jButton_Chance2.setOpaque(false);
        jButton_Chance2.setPreferredSize(new java.awt.Dimension(60, 90));
        jButton_Chance2.setBounds(150, 0, 60, 90);
        jLayeredPane1.add(jButton_Chance2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton_Chance3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/board_Resources/ChanceR.png"))); // NOI18N
        jButton_Chance3.setAlignmentY(0.0F);
        jButton_Chance3.setBorderPainted(false);
        jButton_Chance3.setMaximumSize(new java.awt.Dimension(100, 67));
        jButton_Chance3.setMinimumSize(new java.awt.Dimension(100, 67));
        jButton_Chance3.setOpaque(false);
        jButton_Chance3.setPreferredSize(new java.awt.Dimension(100, 67));
        jButton_Chance3.setBounds(630, 390, 90, 60);
        jLayeredPane1.add(jButton_Chance3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton_Purple1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/board_Resources/Purple1_FF.png"))); // NOI18N
        jButton_Purple1.setAlignmentY(0.0F);
        jButton_Purple1.setBorderPainted(false);
        jButton_Purple1.setMaximumSize(new java.awt.Dimension(60, 90));
        jButton_Purple1.setMinimumSize(new java.awt.Dimension(60, 90));
        jButton_Purple1.setOpaque(false);
        jButton_Purple1.setPreferredSize(new java.awt.Dimension(60, 90));
        jButton_Purple1.setBounds(570, 630, 60, 90);
        jLayeredPane1.add(jButton_Purple1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton_Purple2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/board_Resources/Purple2_Pan.png"))); // NOI18N
        jButton_Purple2.setAlignmentY(0.0F);
        jButton_Purple2.setBorderPainted(false);
        jButton_Purple2.setMaximumSize(new java.awt.Dimension(60, 90));
        jButton_Purple2.setMinimumSize(new java.awt.Dimension(60, 90));
        jButton_Purple2.setOpaque(false);
        jButton_Purple2.setPreferredSize(new java.awt.Dimension(60, 90));
        jButton_Purple2.setBounds(450, 630, 60, 90);
        jLayeredPane1.add(jButton_Purple2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton_Teal1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/board_Resources/Teal1_floating.png"))); // NOI18N
        jButton_Teal1.setAlignmentY(0.0F);
        jButton_Teal1.setBorderPainted(false);
        jButton_Teal1.setMaximumSize(new java.awt.Dimension(60, 90));
        jButton_Teal1.setMinimumSize(new java.awt.Dimension(60, 90));
        jButton_Teal1.setOpaque(false);
        jButton_Teal1.setPreferredSize(new java.awt.Dimension(60, 90));
        jButton_Teal1.setBounds(270, 630, 60, 90);
        jLayeredPane1.add(jButton_Teal1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton_Teal2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/board_Resources/Teal2_Crystal.png"))); // NOI18N
        jButton_Teal2.setAlignmentY(0.0F);
        jButton_Teal2.setBorderPainted(false);
        jButton_Teal2.setMaximumSize(new java.awt.Dimension(60, 90));
        jButton_Teal2.setMinimumSize(new java.awt.Dimension(60, 90));
        jButton_Teal2.setOpaque(false);
        jButton_Teal2.setPreferredSize(new java.awt.Dimension(60, 90));
        jButton_Teal2.setBounds(150, 630, 60, 90);
        jLayeredPane1.add(jButton_Teal2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton_Teal3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/board_Resources/Teal3_Baron.png"))); // NOI18N
        jButton_Teal3.setAlignmentY(0.0F);
        jButton_Teal3.setBorderPainted(false);
        jButton_Teal3.setMaximumSize(new java.awt.Dimension(60, 90));
        jButton_Teal3.setMinimumSize(new java.awt.Dimension(60, 90));
        jButton_Teal3.setOpaque(false);
        jButton_Teal3.setPreferredSize(new java.awt.Dimension(60, 90));
        jButton_Teal3.setBounds(90, 630, 60, 90);
        jLayeredPane1.add(jButton_Teal3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton_Pink1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/board_Resources/Pink1_Library.png"))); // NOI18N
        jButton_Pink1.setAlignmentY(0.0F);
        jButton_Pink1.setBorderPainted(false);
        jButton_Pink1.setMaximumSize(new java.awt.Dimension(100, 67));
        jButton_Pink1.setMinimumSize(new java.awt.Dimension(100, 67));
        jButton_Pink1.setOpaque(false);
        jButton_Pink1.setPreferredSize(new java.awt.Dimension(100, 67));
        jButton_Pink1.setBounds(0, 570, 90, 60);
        jLayeredPane1.add(jButton_Pink1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton_Pink2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/board_Resources/Pink2_Exdeath.png"))); // NOI18N
        jButton_Pink2.setAlignmentY(0.0F);
        jButton_Pink2.setBorderPainted(false);
        jButton_Pink2.setMaximumSize(new java.awt.Dimension(100, 67));
        jButton_Pink2.setMinimumSize(new java.awt.Dimension(100, 67));
        jButton_Pink2.setOpaque(false);
        jButton_Pink2.setPreferredSize(new java.awt.Dimension(100, 67));
        jButton_Pink2.setBounds(0, 450, 90, 60);
        jLayeredPane1.add(jButton_Pink2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton_Pink3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/board_Resources/Pink3_Kuza.png"))); // NOI18N
        jButton_Pink3.setAlignmentY(0.0F);
        jButton_Pink3.setBorderPainted(false);
        jButton_Pink3.setMaximumSize(new java.awt.Dimension(100, 67));
        jButton_Pink3.setMinimumSize(new java.awt.Dimension(100, 67));
        jButton_Pink3.setOpaque(false);
        jButton_Pink3.setPreferredSize(new java.awt.Dimension(100, 67));
        jButton_Pink3.setBounds(0, 390, 90, 60);
        jLayeredPane1.add(jButton_Pink3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton_Orange1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/board_Resources/Orange1_Figaro.png"))); // NOI18N
        jButton_Orange1.setAlignmentY(0.0F);
        jButton_Orange1.setBorderPainted(false);
        jButton_Orange1.setMaximumSize(new java.awt.Dimension(100, 67));
        jButton_Orange1.setMinimumSize(new java.awt.Dimension(100, 67));
        jButton_Orange1.setOpaque(false);
        jButton_Orange1.setPreferredSize(new java.awt.Dimension(100, 67));
        jButton_Orange1.setBounds(0, 270, 90, 60);
        jLayeredPane1.add(jButton_Orange1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton_Orange2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/board_Resources/Orange2_Imperial.png"))); // NOI18N
        jButton_Orange2.setAlignmentY(0.0F);
        jButton_Orange2.setBorderPainted(false);
        jButton_Orange2.setMaximumSize(new java.awt.Dimension(100, 67));
        jButton_Orange2.setMinimumSize(new java.awt.Dimension(100, 67));
        jButton_Orange2.setOpaque(false);
        jButton_Orange2.setPreferredSize(new java.awt.Dimension(100, 67));
        jButton_Orange2.setBounds(0, 150, 90, 60);
        jLayeredPane1.add(jButton_Orange2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton_Orange3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/board_Resources/Orange3_Kefka.png"))); // NOI18N
        jButton_Orange3.setAlignmentY(0.0F);
        jButton_Orange3.setBorderPainted(false);
        jButton_Orange3.setMaximumSize(new java.awt.Dimension(100, 67));
        jButton_Orange3.setMinimumSize(new java.awt.Dimension(100, 67));
        jButton_Orange3.setOpaque(false);
        jButton_Orange3.setPreferredSize(new java.awt.Dimension(100, 67));
        jButton_Orange3.setBounds(0, 90, 90, 60);
        jLayeredPane1.add(jButton_Orange3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton_Red1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/board_Resources/Red1_Saucer.png"))); // NOI18N
        jButton_Red1.setAlignmentY(0.0F);
        jButton_Red1.setBorderPainted(false);
        jButton_Red1.setMaximumSize(new java.awt.Dimension(60, 90));
        jButton_Red1.setMinimumSize(new java.awt.Dimension(60, 90));
        jButton_Red1.setOpaque(false);
        jButton_Red1.setPreferredSize(new java.awt.Dimension(60, 90));
        jButton_Red1.setBounds(90, 0, 60, 90);
        jLayeredPane1.add(jButton_Red1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton_Red2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/board_Resources/Red2_Junon.png"))); // NOI18N
        jButton_Red2.setAlignmentY(0.0F);
        jButton_Red2.setBorderPainted(false);
        jButton_Red2.setMaximumSize(new java.awt.Dimension(60, 90));
        jButton_Red2.setMinimumSize(new java.awt.Dimension(60, 90));
        jButton_Red2.setOpaque(false);
        jButton_Red2.setPreferredSize(new java.awt.Dimension(60, 90));
        jButton_Red2.setBounds(210, 0, 60, 90);
        jLayeredPane1.add(jButton_Red2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton_Red3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/board_Resources/Red3_Midgar.png"))); // NOI18N
        jButton_Red3.setAlignmentY(0.0F);
        jButton_Red3.setBorderPainted(false);
        jButton_Red3.setMaximumSize(new java.awt.Dimension(60, 90));
        jButton_Red3.setMinimumSize(new java.awt.Dimension(60, 90));
        jButton_Red3.setOpaque(false);
        jButton_Red3.setPreferredSize(new java.awt.Dimension(60, 90));
        jButton_Red3.setBounds(270, 0, 60, 90);
        jLayeredPane1.add(jButton_Red3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton_Yellow1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/board_Resources/Yellow1_Balamb.png"))); // NOI18N
        jButton_Yellow1.setAlignmentY(0.0F);
        jButton_Yellow1.setBorderPainted(false);
        jButton_Yellow1.setMaximumSize(new java.awt.Dimension(60, 90));
        jButton_Yellow1.setMinimumSize(new java.awt.Dimension(60, 90));
        jButton_Yellow1.setOpaque(false);
        jButton_Yellow1.setPreferredSize(new java.awt.Dimension(60, 90));
        jButton_Yellow1.setBounds(390, 0, 60, 90);
        jLayeredPane1.add(jButton_Yellow1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton_Yellow2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/board_Resources/Yellow2_Esthar.png"))); // NOI18N
        jButton_Yellow2.setAlignmentY(0.0F);
        jButton_Yellow2.setBorderPainted(false);
        jButton_Yellow2.setMaximumSize(new java.awt.Dimension(60, 90));
        jButton_Yellow2.setMinimumSize(new java.awt.Dimension(60, 90));
        jButton_Yellow2.setOpaque(false);
        jButton_Yellow2.setPreferredSize(new java.awt.Dimension(60, 90));
        jButton_Yellow2.setBounds(450, 0, 60, 90);
        jLayeredPane1.add(jButton_Yellow2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton_Yellow3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/board_Resources/Yellow3_Lunatic.png"))); // NOI18N
        jButton_Yellow3.setAlignmentY(0.0F);
        jButton_Yellow3.setBorderPainted(false);
        jButton_Yellow3.setMaximumSize(new java.awt.Dimension(60, 90));
        jButton_Yellow3.setMinimumSize(new java.awt.Dimension(60, 90));
        jButton_Yellow3.setOpaque(false);
        jButton_Yellow3.setPreferredSize(new java.awt.Dimension(60, 90));
        jButton_Yellow3.setBounds(570, 0, 60, 90);
        jLayeredPane1.add(jButton_Yellow3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton_Green1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/board_Resources/Green1_Alexandria.png"))); // NOI18N
        jButton_Green1.setAlignmentY(0.0F);
        jButton_Green1.setBorderPainted(false);
        jButton_Green1.setMaximumSize(new java.awt.Dimension(100, 67));
        jButton_Green1.setMinimumSize(new java.awt.Dimension(100, 67));
        jButton_Green1.setOpaque(false);
        jButton_Green1.setPreferredSize(new java.awt.Dimension(100, 67));
        jButton_Green1.setBounds(630, 90, 90, 60);
        jLayeredPane1.add(jButton_Green1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton_Green2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/board_Resources/Green2_Burmecia.png"))); // NOI18N
        jButton_Green2.setAlignmentY(0.0F);
        jButton_Green2.setBorderPainted(false);
        jButton_Green2.setMaximumSize(new java.awt.Dimension(100, 67));
        jButton_Green2.setMinimumSize(new java.awt.Dimension(100, 67));
        jButton_Green2.setOpaque(false);
        jButton_Green2.setPreferredSize(new java.awt.Dimension(100, 67));
        jButton_Green2.setBounds(630, 150, 90, 60);
        jLayeredPane1.add(jButton_Green2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton_Green3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/board_Resources/Green3_BanBal.png"))); // NOI18N
        jButton_Green3.setAlignmentY(0.0F);
        jButton_Green3.setBorderPainted(false);
        jButton_Green3.setMaximumSize(new java.awt.Dimension(100, 67));
        jButton_Green3.setMinimumSize(new java.awt.Dimension(100, 67));
        jButton_Green3.setOpaque(false);
        jButton_Green3.setPreferredSize(new java.awt.Dimension(100, 67));
        jButton_Green3.setBounds(630, 270, 90, 60);
        jLayeredPane1.add(jButton_Green3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton_Blue1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/board_Resources/Blue1_Besaid.png"))); // NOI18N
        jButton_Blue1.setAlignmentY(0.0F);
        jButton_Blue1.setBorderPainted(false);
        jButton_Blue1.setMaximumSize(new java.awt.Dimension(100, 67));
        jButton_Blue1.setMinimumSize(new java.awt.Dimension(100, 67));
        jButton_Blue1.setOpaque(false);
        jButton_Blue1.setPreferredSize(new java.awt.Dimension(100, 67));
        jButton_Blue1.setBounds(630, 450, 90, 60);
        jLayeredPane1.add(jButton_Blue1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton_Blue2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/board_Resources/Blue2_Zanarkand.png"))); // NOI18N
        jButton_Blue2.setAlignmentY(0.0F);
        jButton_Blue2.setBorderPainted(false);
        jButton_Blue2.setMaximumSize(new java.awt.Dimension(100, 67));
        jButton_Blue2.setMinimumSize(new java.awt.Dimension(100, 67));
        jButton_Blue2.setOpaque(false);
        jButton_Blue2.setPreferredSize(new java.awt.Dimension(100, 67));
        jButton_Blue2.setBounds(630, 570, 90, 60);
        jLayeredPane1.add(jButton_Blue2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        Center.setIcon(new javax.swing.ImageIcon(getClass().getResource("/board_Resources/real1.png"))); // NOI18N
        Center.setBounds(90, 90, 540, 540);
        jLayeredPane1.add(Center, javax.swing.JLayeredPane.DEFAULT_LAYER);

        getContentPane().add(jLayeredPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 721, 720));

        jPanel_Player1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(""), "Player 1"));
        jPanel_Player1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_Funds.setText("Funds:");
        jPanel_Player1.add(jLabel_Funds, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        jTextField_Player1Money.setEditable(false);
        jPanel_Player1.add(jTextField_Player1Money, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 30, 50, -1));

        jTextField_Player1Location.setEditable(false);
        jPanel_Player1.add(jTextField_Player1Location, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 60, 140, -1));

        jLabel_Location.setText("Location:");
        jPanel_Player1.add(jLabel_Location, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));
        jPanel_Player1.add(jLabel_Player1Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, -1, -1));

        getContentPane().add(jPanel_Player1, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 10, 200, 175));

        jPanel_Player3.setBorder(javax.swing.BorderFactory.createTitledBorder("Player 3"));
        jPanel_Player3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField_Player3Money.setEditable(false);
        jPanel_Player3.add(jTextField_Player3Money, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 30, 50, -1));

        jLabel_Funds1.setText("Funds:");
        jPanel_Player3.add(jLabel_Funds1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        jLabel_Location2.setText("Location:");
        jPanel_Player3.add(jLabel_Location2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jTextField_Player3Location.setEditable(false);
        jPanel_Player3.add(jTextField_Player3Location, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 60, 140, -1));
        jPanel_Player3.add(jLabel_Player3Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, -1, -1));

        getContentPane().add(jPanel_Player3, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 190, 200, 175));

        jPanel_Player7.setBorder(javax.swing.BorderFactory.createTitledBorder("Player 7"));
        jPanel_Player7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField_Player7Money.setEditable(false);
        jPanel_Player7.add(jTextField_Player7Money, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 30, 50, -1));

        jLabel_Funds6.setText("Funds:");
        jPanel_Player7.add(jLabel_Funds6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        jLabel_Location6.setText("Location:");
        jPanel_Player7.add(jLabel_Location6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jTextField_Player7Location.setEditable(false);
        jPanel_Player7.add(jTextField_Player7Location, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 60, 140, -1));
        jPanel_Player7.add(jLabel_Player7Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, -1, -1));

        getContentPane().add(jPanel_Player7, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 550, 200, 175));

        jPanel_Player5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(""), "Player 5"));
        jPanel_Player5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField_Player5Money.setEditable(false);
        jPanel_Player5.add(jTextField_Player5Money, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 30, 50, -1));

        jLabel_Funds4.setText("Funds:");
        jPanel_Player5.add(jLabel_Funds4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        jLabel_Location4.setText("Location:");
        jPanel_Player5.add(jLabel_Location4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jTextField_Player5Location.setEditable(false);
        jPanel_Player5.add(jTextField_Player5Location, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 60, 140, -1));
        jPanel_Player5.add(jLabel_Player5Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, -1, -1));

        getContentPane().add(jPanel_Player5, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 370, 200, 175));

        jPanel_Player8.setBorder(javax.swing.BorderFactory.createTitledBorder("Player 8"));
        jPanel_Player8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField_Player8Money.setEditable(false);
        jPanel_Player8.add(jTextField_Player8Money, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 30, 50, -1));

        jLabel_Funds7.setText("Funds:");
        jPanel_Player8.add(jLabel_Funds7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        jLabel_Location7.setText("Location:");
        jPanel_Player8.add(jLabel_Location7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jTextField_Player8Location.setEditable(false);
        jPanel_Player8.add(jTextField_Player8Location, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 60, 140, -1));
        jPanel_Player8.add(jLabel_Player8Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, -1, -1));

        getContentPane().add(jPanel_Player8, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 550, 200, 175));

        jPanel_Player6.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(""), "Player 6"));
        jPanel_Player6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField_Player6Money.setEditable(false);
        jPanel_Player6.add(jTextField_Player6Money, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 30, 50, -1));

        jLabel_Funds5.setText("Funds:");
        jPanel_Player6.add(jLabel_Funds5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        jLabel_Location5.setText("Location:");
        jPanel_Player6.add(jLabel_Location5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jTextField_Player6Location.setEditable(false);
        jPanel_Player6.add(jTextField_Player6Location, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 60, 140, -1));
        jPanel_Player6.add(jLabel_Player6Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, -1, -1));

        getContentPane().add(jPanel_Player6, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 370, 200, 175));

        jPanel_Player4.setBorder(javax.swing.BorderFactory.createTitledBorder("Player 4"));
        jPanel_Player4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField_Player4Money.setEditable(false);
        jPanel_Player4.add(jTextField_Player4Money, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 30, 50, -1));

        jLabel_Funds3.setText("Funds:");
        jPanel_Player4.add(jLabel_Funds3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        jLabel_Location3.setText("Location:");
        jPanel_Player4.add(jLabel_Location3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jTextField_Player4Location.setEditable(false);
        jPanel_Player4.add(jTextField_Player4Location, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 60, 140, -1));
        jPanel_Player4.add(jLabel_Player4Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, -1, -1));

        getContentPane().add(jPanel_Player4, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 190, 200, 175));

        jPanel_Player2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(""), "Player 2"));
        jPanel_Player2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField_Player2Money.setEditable(false);
        jPanel_Player2.add(jTextField_Player2Money, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 30, 50, -1));

        jLabel_Funds2.setText("Funds:");
        jPanel_Player2.add(jLabel_Funds2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        jLabel_Location1.setText("Location:");
        jPanel_Player2.add(jLabel_Location1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jTextField_Player2Location.setEditable(false);
        jPanel_Player2.add(jTextField_Player2Location, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 60, 140, -1));
        jPanel_Player2.add(jLabel_Player2Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, -1, -1));

        getContentPane().add(jPanel_Player2, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 10, 200, 175));

        jLabel1.setText("Current Player:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 720, -1, -1));

        jTextField_CurrentPlayer.setEnabled(false);
        getContentPane().add(jTextField_CurrentPlayer, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 720, 110, -1));

        jLabel2.setText("Current Round:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 720, -1, -1));
        getContentPane().add(jTextField_Round, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 720, 40, -1));

        jMenu_File.setText("File");

        jMenuItem_Exit.setText("Exit");
        jMenuItem_Exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItem_ExitMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuItem_ExitMousePressed(evt);
            }
        });
        jMenu_File.add(jMenuItem_Exit);

        jMenuBar1.add(jMenu_File);

        jMenu_Game.setText("Game");
        jMenu_Game.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenu_GameMousePressed(evt);
            }
        });

        jMenuItem_AddPlayer.setText("Add Player");
        jMenuItem_AddPlayer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItem_AddPlayerMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuItem_AddPlayerMousePressed(evt);
            }
        });
        jMenu_Game.add(jMenuItem_AddPlayer);

        jMenuItem_Start.setText("Start");
        jMenuItem_Start.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuItem_StartMousePressed(evt);
            }
        });
        jMenu_Game.add(jMenuItem_Start);

        jMenuBar1.add(jMenu_Game);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem_AddPlayerMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jMenuItem_AddPlayerMouseClicked
    {//GEN-HEADEREND:event_jMenuItem_AddPlayerMouseClicked
        
    }//GEN-LAST:event_jMenuItem_AddPlayerMouseClicked

    private void jMenuItem_ExitMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jMenuItem_ExitMouseClicked
    {//GEN-HEADEREND:event_jMenuItem_ExitMouseClicked
        
    }//GEN-LAST:event_jMenuItem_ExitMouseClicked

    private void jMenuItem_ExitMousePressed(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jMenuItem_ExitMousePressed
    {//GEN-HEADEREND:event_jMenuItem_ExitMousePressed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem_ExitMousePressed

    private void jMenu_GameMousePressed(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jMenu_GameMousePressed
    {//GEN-HEADEREND:event_jMenu_GameMousePressed
        
    }//GEN-LAST:event_jMenu_GameMousePressed

    private void jMenuItem_AddPlayerMousePressed(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jMenuItem_AddPlayerMousePressed
    {//GEN-HEADEREND:event_jMenuItem_AddPlayerMousePressed
        
        if(Game.addPlayer())
        {
            String name = (String)JOptionPane.showInputDialog(jLayeredPane1,"Enter Name","",JOptionPane.PLAIN_MESSAGE);
            Game.players.get(Game.numPlayers-1).name=name;       
        }
        else
        {
            JOptionPane.showMessageDialog( jLayeredPane1, "Cannot Add Player", "Failure", JOptionPane.PLAIN_MESSAGE );            
        }
    }//GEN-LAST:event_jMenuItem_AddPlayerMousePressed

    private void jMenuItem_StartMousePressed(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jMenuItem_StartMousePressed
    {//GEN-HEADEREND:event_jMenuItem_StartMousePressed
        if(Game.Start())
        {
            for(int i=0;i<Game.players.size();i++)
            {
                playerNames.get( i ).setText(Game.players.get( i ).name );
                playerLabels.get(i).setVisible(true);
                playerLabels.get(i).setLocation(
                    Board.spaces.get(0).XPos,
                    Board.spaces.get(0).YPos+25);
                playerFunds.get(i).setText( 
                        String.valueOf(Game.players.get(i).funds));

                playerLocations.get(i).setText( 
                        Board.spaces.get(Game.players.get(i).location).Name);
            }
            JOptionPane.showMessageDialog( jLayeredPane1, "Game Started", "Success", JOptionPane.PLAIN_MESSAGE );
            while(Game.playRound())
            {
                jTextField_Round.setText(String.valueOf( Game.currentRound) );
                for(int i =0;i<Game.players.size();i++)
                {
                    JOptionPane.showMessageDialog(jLayeredPane1, Game.players.get( i ).name+"'s Turn", "Playing", JOptionPane.PLAIN_MESSAGE );
                    jTextField_CurrentPlayer.setText(Game.players.get( i ).name);
                    Game.players.get(i).takeTurn();
                    
                    playerFunds.get(Game.currentPlayer).setText( 
                            String.valueOf(Game.players.get(Game.currentPlayer).funds));
                    
                    playerLocations.get(Game.currentPlayer).setText( 
                            Board.spaces.get(Game.players.get(Game.currentPlayer).location).Name);
                    
                    playerLabels.get(Game.currentPlayer).setLocation(
                        Board.spaces.get(Game.players.get(Game.currentPlayer).location).XPos,
                        Board.spaces.get(Game.players.get(Game.currentPlayer).location).YPos+25);
                    
                    Game.currentPlayer=(Game.currentPlayer+1)%Game.players.size();
                    
                }

            }
        JOptionPane.showMessageDialog( jLayeredPane1, "Game Over", "Finished", JOptionPane.PLAIN_MESSAGE );
        System.exit( 0);
        }
        else
        {
            JOptionPane.showMessageDialog( jLayeredPane1, "Cannot Start Game", "Failure", JOptionPane.PLAIN_MESSAGE );
        }
        
    }//GEN-LAST:event_jMenuItem_StartMousePressed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Center;
    private javax.swing.JButton jButton_Blue1;
    private javax.swing.JButton jButton_Blue2;
    private javax.swing.JButton jButton_Chance1;
    private javax.swing.JButton jButton_Chance2;
    private javax.swing.JButton jButton_Chance3;
    private javax.swing.JButton jButton_Chest1;
    private javax.swing.JButton jButton_Chest2;
    private javax.swing.JButton jButton_Chest3;
    private javax.swing.JButton jButton_FreeParking;
    private javax.swing.JButton jButton_Go;
    private javax.swing.JButton jButton_GoToJail;
    private javax.swing.JButton jButton_Green1;
    private javax.swing.JButton jButton_Green2;
    private javax.swing.JButton jButton_Green3;
    private javax.swing.JButton jButton_Jail;
    private javax.swing.JButton jButton_Orange1;
    private javax.swing.JButton jButton_Orange2;
    private javax.swing.JButton jButton_Orange3;
    private javax.swing.JButton jButton_Pink1;
    private javax.swing.JButton jButton_Pink2;
    private javax.swing.JButton jButton_Pink3;
    private javax.swing.JButton jButton_Purple1;
    private javax.swing.JButton jButton_Purple2;
    private javax.swing.JButton jButton_Rail1;
    private javax.swing.JButton jButton_Rail2;
    private javax.swing.JButton jButton_Rail3;
    private javax.swing.JButton jButton_Rail4;
    private javax.swing.JButton jButton_Red1;
    private javax.swing.JButton jButton_Red2;
    private javax.swing.JButton jButton_Red3;
    private javax.swing.JButton jButton_Tax_Income;
    private javax.swing.JButton jButton_Tax_Lux;
    private javax.swing.JButton jButton_Teal1;
    private javax.swing.JButton jButton_Teal2;
    private javax.swing.JButton jButton_Teal3;
    private javax.swing.JButton jButton_Utility_Electric;
    private javax.swing.JButton jButton_Utility_Water;
    private javax.swing.JButton jButton_Yellow1;
    private javax.swing.JButton jButton_Yellow2;
    private javax.swing.JButton jButton_Yellow3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel_Funds;
    private javax.swing.JLabel jLabel_Funds1;
    private javax.swing.JLabel jLabel_Funds2;
    private javax.swing.JLabel jLabel_Funds3;
    private javax.swing.JLabel jLabel_Funds4;
    private javax.swing.JLabel jLabel_Funds5;
    private javax.swing.JLabel jLabel_Funds6;
    private javax.swing.JLabel jLabel_Funds7;
    private javax.swing.JLabel jLabel_Location;
    private javax.swing.JLabel jLabel_Location1;
    private javax.swing.JLabel jLabel_Location2;
    private javax.swing.JLabel jLabel_Location3;
    private javax.swing.JLabel jLabel_Location4;
    private javax.swing.JLabel jLabel_Location5;
    private javax.swing.JLabel jLabel_Location6;
    private javax.swing.JLabel jLabel_Location7;
    private javax.swing.JLabel jLabel_Player1;
    private javax.swing.JLabel jLabel_Player1Name;
    private javax.swing.JLabel jLabel_Player2;
    private javax.swing.JLabel jLabel_Player2Name;
    private javax.swing.JLabel jLabel_Player3;
    private javax.swing.JLabel jLabel_Player3Name;
    private javax.swing.JLabel jLabel_Player4;
    private javax.swing.JLabel jLabel_Player4Name;
    private javax.swing.JLabel jLabel_Player5;
    private javax.swing.JLabel jLabel_Player5Name;
    private javax.swing.JLabel jLabel_Player6;
    private javax.swing.JLabel jLabel_Player6Name;
    private javax.swing.JLabel jLabel_Player7;
    private javax.swing.JLabel jLabel_Player7Name;
    private javax.swing.JLabel jLabel_Player8;
    private javax.swing.JLabel jLabel_Player8Name;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem_AddPlayer;
    private javax.swing.JMenuItem jMenuItem_Exit;
    private javax.swing.JMenuItem jMenuItem_Start;
    private javax.swing.JMenu jMenu_File;
    private javax.swing.JMenu jMenu_Game;
    private javax.swing.JPanel jPanel_Player1;
    private javax.swing.JPanel jPanel_Player2;
    private javax.swing.JPanel jPanel_Player3;
    private javax.swing.JPanel jPanel_Player4;
    private javax.swing.JPanel jPanel_Player5;
    private javax.swing.JPanel jPanel_Player6;
    private javax.swing.JPanel jPanel_Player7;
    private javax.swing.JPanel jPanel_Player8;
    private javax.swing.JTextField jTextField_CurrentPlayer;
    private javax.swing.JTextField jTextField_Player1Location;
    private javax.swing.JTextField jTextField_Player1Money;
    private javax.swing.JTextField jTextField_Player2Location;
    private javax.swing.JTextField jTextField_Player2Money;
    private javax.swing.JTextField jTextField_Player3Location;
    private javax.swing.JTextField jTextField_Player3Money;
    private javax.swing.JTextField jTextField_Player4Location;
    private javax.swing.JTextField jTextField_Player4Money;
    private javax.swing.JTextField jTextField_Player5Location;
    private javax.swing.JTextField jTextField_Player5Money;
    private javax.swing.JTextField jTextField_Player6Location;
    private javax.swing.JTextField jTextField_Player6Money;
    private javax.swing.JTextField jTextField_Player7Location;
    private javax.swing.JTextField jTextField_Player7Money;
    private javax.swing.JTextField jTextField_Player8Location;
    private javax.swing.JTextField jTextField_Player8Money;
    private javax.swing.JTextField jTextField_Round;
    // End of variables declaration//GEN-END:variables
}
