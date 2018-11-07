/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypoker;

import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author DannySuarez
 */
public class PokerWindow extends javax.swing.JFrame {

    public static int numPlayers = 4;
    public static int currentPlayer = 0;
    public static Table table1;
    public static boolean betPhase = false;
    public ArrayList<javax.swing.JLabel> cardLabels = new ArrayList<>();

    /**
     * Creates new form NewJFrame
     */
    public PokerWindow() {
        this.addLabels();
        initComponents();

        table1 = new Table(numPlayers);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        betButton = new javax.swing.JButton();
        this.betButton.setEnabled(false);
        raiseButton = new javax.swing.JButton();
        this.raiseButton.setEnabled(false);
        checkButton = new javax.swing.JButton();
        this.checkButton.setEnabled(false);
        foldButton = new javax.swing.JButton();
        this.foldButton.setEnabled(false);
        betAmount = new javax.swing.JTextField();
        raiseAmount = new javax.swing.JTextField();
        startButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        P1Card1 = new javax.swing.JLabel();
        P4Card2 = new javax.swing.JLabel();
        P4Card1 = new javax.swing.JLabel();
        P2Card1 = new javax.swing.JLabel();
        P2Card2 = new javax.swing.JLabel();
        P1Card2 = new javax.swing.JLabel();
        P3Card2 = new javax.swing.JLabel();
        TableCard1 = new javax.swing.JLabel();
        P3Card1 = new javax.swing.JLabel();
        TableCard3 = new javax.swing.JLabel();
        TableCard4 = new javax.swing.JLabel();
        TableCard5 = new javax.swing.JLabel();
        TableCard2 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        P1Balance = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        P2Balance = new javax.swing.JLabel();
        P3Balance = new javax.swing.JLabel();
        P4Balance = new javax.swing.JLabel();
        potAmount = new javax.swing.JLabel();
        callButton = new javax.swing.JButton();
        this.callButton.setEnabled(false);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        betButton.setText("Bet");
        betButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                betButtonActionPerformed(evt);
            }
        });

        raiseButton.setText("Raise");

        checkButton.setText("Check");

        foldButton.setText("Fold");
        foldButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                foldActionPerformed(evt);
            }
        });

        betAmount.setText("Amount");

        raiseAmount.setText("Amount");

        startButton.setText("Start Hand");
        startButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startGame(evt);
            }
        });

        P1Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/blackBackground.jpg"))); // NOI18N

        P4Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/blackBackground.jpg"))); // NOI18N

        P4Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/blackBackground.jpg"))); // NOI18N

        P2Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/blackBackground.jpg"))); // NOI18N

        P2Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/blackBackground.jpg"))); // NOI18N

        P1Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/blackBackground.jpg"))); // NOI18N

        P3Card2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/blackBackground.jpg"))); // NOI18N

        TableCard1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/blackBackground.jpg"))); // NOI18N

        P3Card1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/blackBackground.jpg"))); // NOI18N

        TableCard3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/blackBackground.jpg"))); // NOI18N

        TableCard4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/blackBackground.jpg"))); // NOI18N

        TableCard5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/blackBackground.jpg"))); // NOI18N

        TableCard2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/blackBackground.jpg"))); // NOI18N

        jLabel2.setText("Balance :  $");

        P1Balance.setText("0");

        jLabel3.setText("Balance :  $");

        jLabel4.setText("Balance :  $");

        jLabel5.setText("Balance :  $");

        P2Balance.setText("0");

        P3Balance.setText("0");

        P4Balance.setText("0");

        potAmount.setText("0");

        callButton.setText("Call");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(betButton, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(betAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addComponent(raiseButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(raiseAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addComponent(foldButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addComponent(checkButton, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(171, 171, 171)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(P3Card1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel1)
                                                .addGap(122, 122, 122)
                                                .addComponent(P1Card1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel4))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(P1Balance)
                                                    .addComponent(P3Card2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(P3Balance))
                                                .addGap(0, 0, Short.MAX_VALUE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(P1Card2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(startButton))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(P2Card1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(P2Card2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(46, 46, 46)
                                        .addComponent(TableCard1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(TableCard2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(5, 5, 5)
                                        .addComponent(TableCard3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(TableCard4, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(TableCard5, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 55, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(P2Balance)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(P4Balance))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(P4Card1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(P4Card2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(callButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                .addGap(352, 352, 352)
                .addComponent(potAmount)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(betButton)
                            .addComponent(betAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(raiseButton)
                            .addComponent(raiseAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(foldButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(callButton)
                                .addGap(88, 88, 88)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(P4Card2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(P4Card1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(P2Card1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(P2Card2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3)
                                .addComponent(P2Balance))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel5)
                                .addComponent(P4Balance)))
                        .addGap(75, 75, 75))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(TableCard5, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(133, 133, 133)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(startButton)))
                .addGap(74, 74, 74))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(P3Balance))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(P3Card2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(P3Card1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(69, 69, 69)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(TableCard1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(TableCard2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TableCard3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(TableCard4, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28)
                .addComponent(potAmount)
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(P1Card1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P1Card2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(P1Balance))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void betButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_betButtonActionPerformed
        int amount = Integer.valueOf(this.betAmount.getText());
        table1.incPot(amount);
        this.potAmount.setText(Double.toString(table1.getPot()));
        table1.getPlayers().get(currentPlayer).decBalance(amount);
        this.betButton.setEnabled(false);
        this.checkButton.setEnabled(false);
        this.betAmount.setText("");

        //handle button enabling COME BACK TO THIS
        choosePlayer();

    }//GEN-LAST:event_betButtonActionPerformed


    private void startGame(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startGame

        table1.dealPlayers();
        TableDrawer.generateImageArray(this);
        TableDrawer.startHand(table1, this);
        this.betButton.setEnabled(true);
        this.checkButton.setEnabled(true);
        this.foldButton.setEnabled(true);
        table1.getPlayers().get(currentPlayer).setIsTurn(true);

        //call Game Loop Method
//        for(Player p : table1.getPlayers()){
//            
//        }
    }//GEN-LAST:event_startGame

    private void foldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_foldActionPerformed
        //remove player from list 
        //choose newPlayer
        table1.getPlayers().get(currentPlayer).setInHand(false);
        currentPlayer = choosePlayer();
        table1.getPlayers().get(currentPlayer).setIsTurn(true);
    }//GEN-LAST:event_foldActionPerformed

    public int choosePlayer() {
        table1.getPlayers().get(currentPlayer).setIsTurn(false);
        for (int i = currentPlayer; i < table1.getPlayers().size(); i++)
        {
            if (table1.getPlayers().get(i).isInHand())
            {
                return i;
            }

        }
        for (int j = 0; j < currentPlayer; j++)
        {
            if (table1.getPlayers().get(j).isInHand())
            {
                
                return j;
            }
        }

        
        return 0;
    }

    public void gameLoop() {
        while (true)
        {
            if (this.betButton.isEnabled())
            {

            }
        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                new PokerWindow().setVisible(true);

            }
        });

    }

    public boolean isBetPhase() {
        return betPhase;
    }

    public void setBetPhase(boolean b) {
        betPhase = b;
    }

    public void addLabels() {
        this.cardLabels.add(P1Card1);
        this.cardLabels.add(P1Card2);
        this.cardLabels.add(P2Card1);
        this.cardLabels.add(P2Card2);
        this.cardLabels.add(P3Card1);
        this.cardLabels.add(P3Card2);
        this.cardLabels.add(P4Card1);
        this.cardLabels.add(P4Card2);

        this.cardLabels.add(TableCard1);
        this.cardLabels.add(TableCard2);
        this.cardLabels.add(TableCard3);
        this.cardLabels.add(TableCard4);
        this.cardLabels.add(TableCard5);

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel P1Balance;
    public javax.swing.JLabel P1Card1;
    public javax.swing.JLabel P1Card2;
    public javax.swing.JLabel P2Balance;
    public javax.swing.JLabel P2Card1;
    public javax.swing.JLabel P2Card2;
    public javax.swing.JLabel P3Balance;
    public javax.swing.JLabel P3Card1;
    public javax.swing.JLabel P3Card2;
    public javax.swing.JLabel P4Balance;
    public javax.swing.JLabel P4Card1;
    public javax.swing.JLabel P4Card2;
    public javax.swing.JLabel TableCard1;
    public javax.swing.JLabel TableCard2;
    public javax.swing.JLabel TableCard3;
    public javax.swing.JLabel TableCard4;
    public javax.swing.JLabel TableCard5;
    private javax.swing.JTextField betAmount;
    private javax.swing.JButton betButton;
    private javax.swing.JButton callButton;
    private javax.swing.JButton checkButton;
    private javax.swing.JButton foldButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel potAmount;
    private javax.swing.JTextField raiseAmount;
    private javax.swing.JButton raiseButton;
    private javax.swing.JButton startButton;
    // End of variables declaration//GEN-END:variables

}
