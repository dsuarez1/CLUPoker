/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypoker;

import java.io.Serializable;



/**
 *
 * @author pclab
 */
public class Card implements Comparable,Serializable{
    //attributes
    private String suitString;
    private int suitInt;
    private int imageIndex;
    private int value;
    
    
    public Card(int suit, int value)
    {
        this.value = value;
        this.imageIndex = value;
        switch(suit)
        {
            case Suits.DIAMONDS:
                this.suitString = "Diamond";
                this.suitInt = 0;
                break;
            case Suits.SPADES:
                this.suitInt = 1;
                this.imageIndex = imageIndex + 13;
                this.suitString = "Spade";
                break;
            case Suits.CLUBS:
                this.suitInt = 2;
                this.imageIndex = imageIndex + 26;
                this.suitString = "Club";
                break;
            case Suits.HEARTS:
                this.suitInt = 3;
                this.imageIndex = imageIndex + 39;
                this.suitString = "Heart";
                break;
        }
        
        
    }

    public int getSuitInt() {
        return suitInt;
    }
    
    

    public String getSuitString() {
        return suitString;
    }

    public int getImageIndex() {
        return imageIndex;
    }
    
    
    public int getValue()
    {
        return this.value;
    }

    @Override
    public String toString() {
        return "Card{" + value + " Of " + suitString + '}';
    }

    @Override
    public int compareTo(Object card) {
        int compareValue= ((Card) card).getValue();
        return compareValue - this.value;
    }
    
    
    
    
}
