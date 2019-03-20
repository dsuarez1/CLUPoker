/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package images;

import Windows.PokerWindow;
import javax.swing.ImageIcon;

/**
 *
 * @author DannySuarez
 */
public class ImageList {
    private ImageIcon[] images = new javax.swing.ImageIcon[60];
    
    public void ImageList(PokerWindow window){
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

    public ImageIcon[] getImages() {
        return images;
    }
    
    
}
