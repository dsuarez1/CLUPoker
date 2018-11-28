/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypoker;

import java.awt.Color;
import java.util.ArrayList;

/**
 *
 * @author DannySuarez
 */
public class PokerWindow extends javax.swing.JFrame {

    public static int numPlayers = 4;
    public static int currentPlayer = 0;
    public static int betAmount = 0;
    public static Table table1;
    public static int phase = 0;  //the phase represents what part of the hand we are in 0 = preflop, 1=flop,2=turn,3=river
    public ArrayList<javax.swing.JLabel> cardLabels = new ArrayList<>();
    //public javax.swing.JLabel[] playerLabels;
    public ArrayList<javax.swing.JLabel> playerLabels = new ArrayList<>();

    /**
     * Creates new form NewJFrame
     */
    public PokerWindow() {
        initComponents();
        this.addLabels();
        TableDrawer.generateImageArray(this);
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
        p1Lbl = new javax.swing.JLabel();
        P1Balance = new javax.swing.JLabel();
        p2Lbl = new javax.swing.JLabel();
        p3Lbl = new javax.swing.JLabel();
        p4Lbl = new javax.swing.JLabel();
        P2Balance = new javax.swing.JLabel();
        P3Balance = new javax.swing.JLabel();
        P4Balance = new javax.swing.JLabel();
        potAmount = new javax.swing.JLabel();
        callButton = new javax.swing.JButton();
        this.callButton.setEnabled(false);
        betSlider = new javax.swing.JSlider();
        sliderLbl = new javax.swing.JLabel();
        playerTurnLbl = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        betButton.setText("Bet");
        betButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                betButtonActionPerformed(evt);
            }
        });

        raiseButton.setText("Raise");
        raiseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                raiseActionPerformed(evt);
            }
        });

        checkButton.setText("Check");
        checkButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkButtonActionPerformed(evt);
            }
        });

        foldButton.setText("Fold");
        foldButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                foldActionPerformed(evt);
            }
        });

        startButton.setText("Start Hand");
        startButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startHand(evt);
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

        p1Lbl.setText("Balance :  $");

        P1Balance.setText("0");

        p2Lbl.setText("Balance :  $");

        p3Lbl.setText("Balance :  $");

        p4Lbl.setText("Balance :  $");

        P2Balance.setText("0");

        P3Balance.setText("0");

        P4Balance.setText("0");

        potAmount.setText("0");

        callButton.setText("Call");
        callButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                callActionPerformed(evt);
            }
        });

        betSlider.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                sliderMoved(evt);
            }
        });

        sliderLbl.setText("0");

        playerTurnLbl.setText("0");

        jMenu2.setText("New Game");
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newGameActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(betButton, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(raiseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(171, 171, 171)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(P3Card1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(118, 118, 118)
                                        .addComponent(P1Card1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(p1Lbl)
                                    .addComponent(p3Lbl))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(P1Balance)
                                            .addComponent(P3Card2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(P3Balance))
                                        .addGap(0, 296, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(P1Card2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(startButton))))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(P2Card2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(P2Card1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(84, 84, 84)
                                .addComponent(TableCard1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TableCard2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addComponent(TableCard3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TableCard4, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TableCard5, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(p2Lbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(P2Balance)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(potAmount)
                                .addGap(288, 288, 288)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(34, 34, 34)
                                        .addComponent(p4Lbl)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(P4Balance)
                                        .addGap(77, 77, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(callButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(foldButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                                        .addComponent(checkButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(sliderLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(67, 67, 67))))
                                .addGap(81, 81, 81))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(P4Card2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(P4Card1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(playerTurnLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(betSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(betButton)
                    .addComponent(raiseButton))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(betSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(playerTurnLbl))
                .addGap(310, 310, 310)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(P2Card2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(P4Card2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(P4Card1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(15, 15, 15)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(p2Lbl)
                                .addComponent(P2Balance))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(p4Lbl)
                                .addComponent(P4Balance))))
                    .addComponent(P2Card1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(startButton)))
                .addGap(74, 74, 74))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(sliderLbl)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(p3Lbl)
                            .addComponent(P3Balance))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(P3Card2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(P3Card1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(checkButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(foldButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(callButton)
                        .addGap(23, 23, 23)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 150, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TableCard5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(TableCard4, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TableCard1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TableCard2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TableCard3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(potAmount)
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(P1Card1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(P1Card2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(p1Lbl)
                    .addComponent(P1Balance))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //if a player bets or raises everyone elses hasBet flag needs to be set back to true so that they may then raise fold or call 
    private void betButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_betButtonActionPerformed
        this.betOrRaise();
    }//GEN-LAST:event_betButtonActionPerformed


    private void startHand(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startHand
        for (Player p : table1.getPlayers())
        {
            p.setInHand(true);
            p.setHand_count(0);
        }
        this.betSlider.setMinimum(0);

        this.betSlider.setMaximum((int) table1.getPlayers().get(0).getBalance());
        table1.dealPlayers();
        TableDrawer.startHand(table1, this);
        this.betButton.setEnabled(true);
        this.checkButton.setEnabled(true);
        this.foldButton.setEnabled(true);
        this.startButton.setEnabled(false);
        //table1.getPlayers().get(currentPlayer).setTurn(true);
    }//GEN-LAST:event_startHand

    private void foldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_foldActionPerformed
        //table1.getPlayers().get(currentPlayer).setTurn(false);
        table1.getPlayers().get(currentPlayer).setHasBet(true);
        table1.getPlayers().get(currentPlayer).setInHand(false);
        table1.decPlayersInHand();

        //if all but one player has folded the round is over
        if (table1.getPlayersInHand() == 1)
        {
            //the hand is over
            currentPlayer = this.lastPlayer(); //find the last player in hand this is the winner of the hand
            Player p  = table1.getPlayers().get(currentPlayer);
            p.incBalance(table1.getPot());
            playerLabels.get(currentPlayer).setText(String.valueOf(p.getBalance()));
            this.resetTable();
        } else {
            checkPhaseChange();
        }

    }//GEN-LAST:event_foldActionPerformed

    private void checkButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkButtonActionPerformed
        //table1.getPlayers().get(currentPlayer).setTurn(false);
        table1.getPlayers().get(currentPlayer).setHasBet(true);
        System.out.println(currentPlayer);
        checkPhaseChange();
    }//GEN-LAST:event_checkButtonActionPerformed

    private void sliderMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sliderMoved
        this.sliderLbl.setText(String.valueOf(this.betSlider.getValue()));
        //System.out.println("slider moved");
    }//GEN-LAST:event_sliderMoved

    private void raiseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_raiseActionPerformed
        this.betOrRaise();
    }//GEN-LAST:event_raiseActionPerformed

    private void callActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_callActionPerformed
        Player p  = table1.getPlayers().get(currentPlayer);
        p.setHasBet(true);
        p.decBalance(betAmount); //COME BACK TO THIS 
        table1.incPot(betAmount);
        this.potAmount.setText(Double.toString(table1.getPot()));
        playerLabels.get(currentPlayer).setText(String.valueOf(p.getBalance()));
        checkPhaseChange();
    }//GEN-LAST:event_callActionPerformed

    private void newGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newGameActionPerformed
        Table t =  new Table(numPlayers);
        table1 = t;
    }//GEN-LAST:event_newGameActionPerformed

    private void checkPhaseChange(){
        if (playersStillWaiting())
        { //if there are still players waiting to bet
            currentPlayer = choosePlayer();
        } else
        { //if we get here then move to the next phase
            this.nextPhase();
        }
    }
    
    private void changePhase() {
        if(phase == 3){
            phase = 0;
        }
        else{
           phase++; 
        }
        
        currentPlayer = 3;
        this.setBetFlags();
        currentPlayer = choosePlayer();
    }

    public void nextPhase() {
        this.betButton.setEnabled(true);
        this.checkButton.setEnabled(true);
        this.foldButton.setEnabled(true);
        this.raiseButton.setEnabled(false);
        this.callButton.setEnabled(false);
        System.out.println(phase);
        switch(phase){
            case 0 : 
               TableDrawer.dealFlop(table1, this);
               break;
            case 1 : 
               TableDrawer.dealTurn(table1, this);
               break;
            case 2 : 
                TableDrawer.dealRiver(table1, this);
                break;
            case 3 : 
                //checkWinner
                System.out.println("HAND IS OVER");
                break;
        }
        changePhase();
    }

    public void betOrRaise() {
        //table1.getPlayers().get(currentPlayer).setTurn(false);
        Player p = table1.getPlayers().get(currentPlayer);
        p.setHasBet(true);
        int amount = this.betSlider.getValue();
        table1.incPot(amount);
        this.potAmount.setText(Double.toString(table1.getPot()));
        p.decBalance(amount);

        this.betButton.setEnabled(false);
        this.checkButton.setEnabled(false);
        this.callButton.setEnabled(true);
        this.raiseButton.setEnabled(true);
        betAmount = amount;
        resetHasBetFlags(); //since a player just bet this means each player now needs to make another turn
        playerLabels.get(currentPlayer).setText(String.valueOf(p.getBalance()));
        currentPlayer = this.choosePlayer();
        
    }

    public void setBetFlags() {
        for (Player p : table1.getPlayers())
        {
            if (p.isInHand())
            {
                p.setHasBet(false);
            }
        }
    }

    //checks if players in the hand still need to go
    public boolean playersStillWaiting() {
        for (Player p : table1.getPlayers())
        {
            if (p.isInHand() && p.isHasBet() == false)
            {
                return true; //this means at least one player has not gone
            }
        }
        return false;
    }

    public void resetTable() {
        for (Player p : table1.getPlayers())
        {
            //is there more to do here for players???
            //later should check if balance is > 0 or else they shouldnt be in hand
            p.setInHand(true);
            p.setHand_count(0);
        }
        table1.setDeck(new Deck()); //repopulate a new deck
        table1.setPot(0);
        this.betButton.setEnabled(false);
        this.foldButton.setEnabled(false);
        this.raiseButton.setEnabled(false);
        this.checkButton.setEnabled(false);
        this.callButton.setEnabled(false);
        this.startButton.setEnabled(true);
        this.potAmount.setText("0.00");
        currentPlayer = 0; //just assume the same player starts each hand we will implement blinds and what not later
        phase = 0;

    }

    //we need to consider that if the last player to place their bet
    public int choosePlayer() {
        for (int i = currentPlayer + 1; i < table1.getPlayers().size(); i++)
        {
            if (table1.getPlayers().get(i).isInHand() && table1.getPlayers().get(i).isHasBet() == false)
            {
                this.betSlider.setMaximum((int) table1.getPlayers().get(i).getBalance());
                this.playerTurnLbl.setText(String.valueOf(i));
                return i;
            }
        }
        for (int j = 0; j < currentPlayer; j++)
        {
            if (table1.getPlayers().get(j).isInHand() && table1.getPlayers().get(j).isHasBet() == false)
            {
                this.betSlider.setMaximum((int) table1.getPlayers().get(j).getBalance());
                this.playerTurnLbl.setText(String.valueOf(j));
                return j;
            }
        }

        return -1;
    }

    public void resetHasBetFlags() {
        //table1.getPlayers().get(currentPlayer).setTurn(false);
        table1.getPlayers().get(currentPlayer).setHasBet(true);
        for (int i = currentPlayer + 1; i < table1.getPlayers().size(); i++)
        {
            if (table1.getPlayers().get(i).isInHand())
            {
                table1.getPlayers().get(i).setHasBet(false);
            }
        }
        for (int j = 0; j < currentPlayer; j++)
        {
            if (table1.getPlayers().get(j).isInHand())
            {

                table1.getPlayers().get(j).setHasBet(false);
            }
        }
    }

    //once there is only one player in the hand their is a winner that needs to be chosen
    public int lastPlayer() {
        int playerNumber = -1;
        for (int i = 0; i < table1.getPlayers().size(); i++)
        {
            if (table1.getPlayers().get(i).isInHand())
            {
                playerNumber = i;
                break;
            }
        }
        return playerNumber;
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

        this.playerLabels.add(P1Balance);
        this.playerLabels.add(P2Balance);
        this.playerLabels.add(P3Balance);
        this.playerLabels.add(P4Balance);
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
    private javax.swing.JButton betButton;
    private javax.swing.JSlider betSlider;
    private javax.swing.JButton callButton;
    private javax.swing.JButton checkButton;
    private javax.swing.JButton foldButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel p1Lbl;
    private javax.swing.JLabel p2Lbl;
    private javax.swing.JLabel p3Lbl;
    private javax.swing.JLabel p4Lbl;
    private javax.swing.JLabel playerTurnLbl;
    private javax.swing.JLabel potAmount;
    private javax.swing.JButton raiseButton;
    private javax.swing.JLabel sliderLbl;
    private javax.swing.JButton startButton;
    // End of variables declaration//GEN-END:variables

}
