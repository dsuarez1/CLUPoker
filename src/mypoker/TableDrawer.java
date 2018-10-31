/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypoker;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author DannySuarez
 */
public abstract class TableDrawer {
    
    
    public static void startHand(Table t,PokerWindow window){
        int playerNumber = 0;
        t.nextHand();
        t.dealPlayers();
        //window.testLabel.setIcon(new javax.swing.ImageIcon(window.getClass().getResource("/images/kingOfSpades.png")));
        window.testLabel.setIcon(new ImageIcon(new javax.swing.ImageIcon(window.getClass().getResource("/images/kingOfSpades.png")).getImage().getScaledInstance(50, 100, Image.SCALE_SMOOTH)));
        for(Player p : t.getPlayers()){
            if(playerNumber ==0){
                window.valP1Card1.setText(String.valueOf(p.getHand()[0].getValue()));
                window.SuitP1Card1.setText(String.valueOf(p.getHand()[0].getSuitString()));
                window.valP1Card2.setText(String.valueOf(p.getHand()[1].getValue()));
                window.SuitP1Card2.setText(String.valueOf(p.getHand()[1].getSuitString()));
            }
            else if(playerNumber == 1){
                window.valP2Card1.setText(String.valueOf(p.getHand()[0].getValue()));
                window.SuitP2Card1.setText(String.valueOf(p.getHand()[0].getSuitString()));
                window.valP2Card2.setText(String.valueOf(p.getHand()[1].getValue()));
                window.SuitP2Card2.setText(String.valueOf(p.getHand()[1].getSuitString()));
            }
            else if(playerNumber == 2){
                window.valP3Card1.setText(String.valueOf(p.getHand()[0].getValue()));
                window.SuitP3Card1.setText(String.valueOf(p.getHand()[0].getSuitString()));
                window.valP3Card2.setText(String.valueOf(p.getHand()[1].getValue()));
                window.SuitP3Card2.setText(String.valueOf(p.getHand()[1].getSuitString()));
            }
            else if(playerNumber == 3){
                window.valP4Card1.setText(String.valueOf(p.getHand()[0].getValue()));
                window.SuitP4Card1.setText(String.valueOf(p.getHand()[0].getSuitString()));
                window.valP4Card2.setText(String.valueOf(p.getHand()[1].getValue()));
                window.SuitP4Card2.setText(String.valueOf(p.getHand()[1].getSuitString()));
            }
            playerNumber++;
            
        }
    }
        
    public static void changeCardLabels(PokerWindow window,int PlayerNum,Player p){
        //make method to change window labels  
    }
       
    
}
