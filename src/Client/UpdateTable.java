/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Client;

/**
 *
 * @author DannySuarez
 */
import GameStates.IGameState;
import Windows.PokerWindow;
import java.awt.Image;
import javax.swing.ImageIcon;
import mypoker.Card;
import mypoker.Player;
import mypoker.Table;

/**
 *
 * @author DannySuarez
 */
public abstract class UpdateTable {
    private static ImageIcon[] images = new javax.swing.ImageIcon[60];
    
    public static void generateImageArray(PokerWindow window){
//        String path = "/images/2Diamonds.png";
//        for(int i = 1;i<images.length;i++){
//            images[1] = new javax.swing.ImageIcon(window.getClass().getResource("/images/2Diamonds.png"));
//        }
    images[0] = new javax.swing.ImageIcon(window.getClass().getResource("/images/cardBacking.jpg"));
    images[1] = new javax.swing.ImageIcon(window.getClass().getResource("/images/cardBacking.jpg"));

    images[2] = new javax.swing.ImageIcon(window.getClass().getResource("/images/2Diamonds.png"));
    images[3] = new javax.swing.ImageIcon(window.getClass().getResource("/images/3Diamonds.png"));
    images[4] = new javax.swing.ImageIcon(window.getClass().getResource("/images/4Diamonds.png"));
    images[5] = new javax.swing.ImageIcon(window.getClass().getResource("/images/5Diamonds.png"));
    images[6] = new javax.swing.ImageIcon(window.getClass().getResource("/images/6Diamonds.png"));
    images[7] = new javax.swing.ImageIcon(window.getClass().getResource("/images/7Diamonds.png"));
    images[8] = new javax.swing.ImageIcon(window.getClass().getResource("/images/8Diamonds.png"));
    images[9] = new javax.swing.ImageIcon(window.getClass().getResource("/images/9Diamonds.png"));
    images[10] = new javax.swing.ImageIcon(window.getClass().getResource("/images/10Diamonds.png"));
    images[11] = new javax.swing.ImageIcon(window.getClass().getResource("/images/JackDiamonds.png"));
    images[12] = new javax.swing.ImageIcon(window.getClass().getResource("/images/QueenDiamonds.png"));
    images[13] = new javax.swing.ImageIcon(window.getClass().getResource("/images/KingDiamonds.png"));
    images[14] = new javax.swing.ImageIcon(window.getClass().getResource("/images/AceDiamonds.png"));
    
    images[15] = new javax.swing.ImageIcon(window.getClass().getResource("/images/2Spades.png"));
    images[16] = new javax.swing.ImageIcon(window.getClass().getResource("/images/3Spades.png"));
    images[17] = new javax.swing.ImageIcon(window.getClass().getResource("/images/4Spades.png"));
    images[18] = new javax.swing.ImageIcon(window.getClass().getResource("/images/5Spades.png"));
    images[19] = new javax.swing.ImageIcon(window.getClass().getResource("/images/6Spades.png"));
    images[20] = new javax.swing.ImageIcon(window.getClass().getResource("/images/7Spades.png"));
    images[21] = new javax.swing.ImageIcon(window.getClass().getResource("/images/8Spades.png"));
    images[22] = new javax.swing.ImageIcon(window.getClass().getResource("/images/9Spades.png"));
    images[23] = new javax.swing.ImageIcon(window.getClass().getResource("/images/10Spades.png"));
    images[24] = new javax.swing.ImageIcon(window.getClass().getResource("/images/JackSpades.png"));
    images[25] = new javax.swing.ImageIcon(window.getClass().getResource("/images/QueenSpades.png"));
    images[26] = new javax.swing.ImageIcon(window.getClass().getResource("/images/KingSpades.png"));
    images[27] = new javax.swing.ImageIcon(window.getClass().getResource("/images/AceSpades.png"));
    
    images[28] = new javax.swing.ImageIcon(window.getClass().getResource("/images/2Clubs.png"));
    images[29] = new javax.swing.ImageIcon(window.getClass().getResource("/images/3Clubs.png"));
    images[30] = new javax.swing.ImageIcon(window.getClass().getResource("/images/4Clubs.png"));
    images[31] = new javax.swing.ImageIcon(window.getClass().getResource("/images/5Clubs.png"));
    images[32] = new javax.swing.ImageIcon(window.getClass().getResource("/images/6Clubs.png"));
    images[33] = new javax.swing.ImageIcon(window.getClass().getResource("/images/7Clubs.png"));
    images[34] = new javax.swing.ImageIcon(window.getClass().getResource("/images/8Clubs.png"));
    images[35] = new javax.swing.ImageIcon(window.getClass().getResource("/images/9Clubs.png"));
    images[36] = new javax.swing.ImageIcon(window.getClass().getResource("/images/10Clubs.png"));
    images[37] = new javax.swing.ImageIcon(window.getClass().getResource("/images/JackClubs.png"));
    images[38] = new javax.swing.ImageIcon(window.getClass().getResource("/images/QueenClubs.png"));
    images[39] = new javax.swing.ImageIcon(window.getClass().getResource("/images/KingClubs.png"));
    images[40] = new javax.swing.ImageIcon(window.getClass().getResource("/images/AceClubs.png"));
   
    images[41] = new javax.swing.ImageIcon(window.getClass().getResource("/images/2Hearts.png"));
    images[42] = new javax.swing.ImageIcon(window.getClass().getResource("/images/3Hearts.png"));
    images[43] = new javax.swing.ImageIcon(window.getClass().getResource("/images/4Hearts.png"));
    images[44] = new javax.swing.ImageIcon(window.getClass().getResource("/images/5Hearts.png"));
    images[45] = new javax.swing.ImageIcon(window.getClass().getResource("/images/6Hearts.png"));
    images[46] = new javax.swing.ImageIcon(window.getClass().getResource("/images/7Hearts.png"));
    images[47] = new javax.swing.ImageIcon(window.getClass().getResource("/images/8Hearts.png"));
    images[48] = new javax.swing.ImageIcon(window.getClass().getResource("/images/9Hearts.png"));
    images[49] = new javax.swing.ImageIcon(window.getClass().getResource("/images/10Hearts.png"));
    images[50] = new javax.swing.ImageIcon(window.getClass().getResource("/images/JackHearts.png"));
    images[51] = new javax.swing.ImageIcon(window.getClass().getResource("/images/QueenHearts.png"));
    images[52] = new javax.swing.ImageIcon(window.getClass().getResource("/images/KingHearts.png"));
    images[53] = new javax.swing.ImageIcon(window.getClass().getResource("/images/AceHearts.png"));
}
    

    
    public static void updateTableCards(PokerWindow window,IGameState state){
        for(int i = 0;i < state.getTableCards().size();i++){
            Card c = state.getTableCards().get(i);
            javax.swing.JLabel lbl = window.tableCardLabels.get(i);
            lbl.setIcon(new ImageIcon(images[c.getImageIndex()].getImage().getScaledInstance(75, 100, Image.SCALE_SMOOTH)));
        }  
    }
    
    
    public static void updatePot(PokerWindow window,IGameState state){
    }
    
    public static void updatePersonalCards(PokerWindow window,IGameState state){

    }
    
    public static void updatePlayerCards(PokerWindow window,IGameState state){

    }
    
    public static void updatePlayerBalance(PokerWindow window,IGameState state){
//        window.P3Balance.setText(String.valueOf(state.getPlayerBalances().get(0)));
//        System.out.println(state.getPlayerBalances().get(0));
    }
    
    public static void startHand(Table t,PokerWindow window){
        int playerNumber = 0;
        
        int count =0 ;
        for(Player p : t.getPlayers()){
            if(playerNumber ==0){
                window.P1Balance.setText(String.valueOf(p.getBalance()));
                window.P1Card1.setIcon(new ImageIcon(images[p.getHand()[0].getImageIndex()].getImage().getScaledInstance(75, 100, Image.SCALE_SMOOTH)));
                window.P1Card2.setIcon(new ImageIcon(images[p.getHand()[1].getImageIndex()].getImage().getScaledInstance(75, 100, Image.SCALE_SMOOTH)));
                
            }
            else if(playerNumber == 1){
                window.P2Balance.setText(String.valueOf(p.getBalance()));
                window.P2Card1.setIcon(new ImageIcon(images[p.getHand()[0].getImageIndex()].getImage().getScaledInstance(75, 100, Image.SCALE_SMOOTH)));
                window.P2Card2.setIcon(new ImageIcon(images[p.getHand()[1].getImageIndex()].getImage().getScaledInstance(75, 100, Image.SCALE_SMOOTH)));
            }
            else if(playerNumber == 2){
                window.P3Balance.setText(String.valueOf(p.getBalance()));
                window.P3Card1.setIcon(new ImageIcon(images[p.getHand()[0].getImageIndex()].getImage().getScaledInstance(75, 100, Image.SCALE_SMOOTH)));
                window.P3Card2.setIcon(new ImageIcon(images[p.getHand()[1].getImageIndex()].getImage().getScaledInstance(75, 100, Image.SCALE_SMOOTH)));
            }
            else if(playerNumber == 3){
                window.P4Balance.setText(String.valueOf(p.getBalance()));
                window.P4Card1.setIcon(new ImageIcon(images[p.getHand()[0].getImageIndex()].getImage().getScaledInstance(75, 100, Image.SCALE_SMOOTH)));
                window.P4Card2.setIcon(new ImageIcon(images[p.getHand()[1].getImageIndex()].getImage().getScaledInstance(75, 100, Image.SCALE_SMOOTH)));
            }
            playerNumber++;
        }
    }
    
        
    public static void dealFlop(Table t,PokerWindow window){
        t.dealFlop();
        window.TableCard1.setIcon(new ImageIcon(images[t.getTableCards().get(0).getImageIndex()].getImage().getScaledInstance(75, 100, Image.SCALE_SMOOTH)));
        window.TableCard2.setIcon(new ImageIcon(images[t.getTableCards().get(1).getImageIndex()].getImage().getScaledInstance(75, 100, Image.SCALE_SMOOTH)));
        window.TableCard3.setIcon(new ImageIcon(images[t.getTableCards().get(2).getImageIndex()].getImage().getScaledInstance(75, 100, Image.SCALE_SMOOTH)));
    }
    
    public static void dealTurn(Table t,PokerWindow window){
        t.dealTurnOrRiver();
        window.TableCard4.setIcon(new ImageIcon(images[t.getTableCards().get(3).getImageIndex()].getImage().getScaledInstance(75, 100, Image.SCALE_SMOOTH))); 
    }
    
    public static void dealRiver(Table t,PokerWindow window){
        t.dealTurnOrRiver();
        window.TableCard5.setIcon(new ImageIcon(images[t.getTableCards().get(4).getImageIndex()].getImage().getScaledInstance(75, 100, Image.SCALE_SMOOTH))); 
    }
    
    public static void changeCardLabels(PokerWindow window,int PlayerNum,Player p){
        //make method to change window labels  
    }
    
    public static void resetTable(Table t,PokerWindow window){
        window.TableCard1.setIcon(new ImageIcon(images[0].getImage().getScaledInstance(75, 100, Image.SCALE_SMOOTH)));
        window.TableCard2.setIcon(new ImageIcon(images[0].getImage().getScaledInstance(75, 100, Image.SCALE_SMOOTH)));
        window.TableCard3.setIcon(new ImageIcon(images[0].getImage().getScaledInstance(75, 100, Image.SCALE_SMOOTH)));
        window.TableCard4.setIcon(new ImageIcon(images[0].getImage().getScaledInstance(75, 100, Image.SCALE_SMOOTH)));
        window.TableCard5.setIcon(new ImageIcon(images[0].getImage().getScaledInstance(75, 100, Image.SCALE_SMOOTH)));
    }
       
    
}
