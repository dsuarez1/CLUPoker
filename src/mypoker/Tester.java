/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypoker;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.event.MouseInputListener;

/**
 *
 * @author pclab
 */
public class Tester extends JFrame {

    private JPanel contentPane;
    private GraphicsPanel graphicspanel;
    private ControlPanel controlpanel;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numPlayers = 4;
        Table table1 = new Table(numPlayers);
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try
                {
                    Tester frame = new Tester();
                    frame.setVisible(true);
                } catch (Exception e)
                {
                    e.printStackTrace();
                }
            }
        });
        
        table1.nextHand(); //set up next hand(resets deck,puts players back in, resets pot)
        table1.dealPlayers(); //deal out initial cards
        
        //table1.getBets(notSupported);//place initial bets
        table1.dealFlop();//deal the flop
        //place secondary bets
       table1.dealTurnOrRiver();//deal the turn
        //place third bets
        table1.dealTurnOrRiver();//deal the river
        //place final bets
        //end hand

        for (int i = 0; i < 4; i++)
        {
            System.out.println("PLAYER " + i);
            System.out.println(table1.getPlayers().get(i));
        }

        table1.printTable();
        //System.out.println(table1.getDeck().getDeck().size());
    }

    public Tester() {

        // -- without this attribute closing the window (frame) will not
        //    shut down the application
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);

        // -- to give more flexibility in adding components to the JFrame
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(new BorderLayout(10, 10));
        setContentPane(contentPane);

        graphicspanel = new GraphicsPanel();
        graphicspanel.setVisible(true);
        contentPane.add(graphicspanel, BorderLayout.CENTER);

        controlpanel = new ControlPanel();
        controlpanel.setVisible(true);
        contentPane.add(controlpanel, BorderLayout.EAST);
    }

    // -- Inner class for the graphics panel
    public class GraphicsPanel extends JPanel {

        public GraphicsPanel() {
            // -- associate a mouse listener
            addMouseListener(new MyMouseListener());
            // -- associate a mouse motion listener (dragged an moved)
            addMouseMotionListener(new MyMouseListener());
        }
        public void paint (Graphics g) 
		{
			super.paint(g);
			if (g instanceof Graphics2D) {
				Graphics2D g2d = (Graphics2D)g;
				
				
				
				
				
			}
		}
    }

    // -- Inner class for the MouseListener
    public class MyMouseListener implements MouseInputListener, MouseMotionListener {

        @Override
        public void mouseClicked(MouseEvent arg0) {

        }

        @Override
        public void mouseEntered(MouseEvent arg0) {

        }

        @Override
        public void mouseExited(MouseEvent arg0) {

        }

        @Override
        public void mousePressed(MouseEvent arg0) {

        }

        @Override
        public void mouseReleased(MouseEvent arg0) {

        }

        @Override
        public void mouseDragged(MouseEvent arg0) {

        }

        @Override
        public void mouseMoved(MouseEvent arg0) {

        }

    }

    // -- Inner class for control panel
    public class ControlPanel extends JPanel {

        public ControlPanel() {
            ButtonListener buttonlistener = new ButtonListener();
            this.setLayout(new GridLayout(6, 1, 5, 5));
            JButton betButton = new JButton("Bet");
            JButton raiseButton = new JButton("Raise");
            JButton foldButton = new JButton("Fold");
            JButton checkButton = new JButton("check");
            
            JTextField betAmount = new JTextField("");
            JTextField raiseAmount = new JTextField("");

            betButton.addActionListener(buttonlistener);
            raiseButton.addActionListener(buttonlistener);
            foldButton.addActionListener(buttonlistener);
            checkButton.addActionListener(buttonlistener);
            
            this.add(betButton);
            this.add(betAmount);
            this.add(raiseButton);
            this.add(raiseAmount);
            this.add(checkButton);
            this.add(foldButton);


            

            







        }
    }
    
    
    // -- Inner class for button listener
		public class ButtonListener implements ActionListener
		{

        @Override
        public void actionPerformed(ActionEvent e) {
           
        }
			
		}
}
