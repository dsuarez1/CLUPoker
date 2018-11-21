/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypoker;



/**
 *
 * @author pclab
 */
public class Card implements Comparable{
    //attributes
    private Suit suit;
    private String suitString;
    private int imageIndex;
    private int value;
    
    
    public Card(int s, int v)
    {
        this.value = v;
        this.imageIndex = value;
        switch(s)
        {
            case 1:
                this.suit = Suit.DIAMONDS;
                this.suitString = "Diamond";
                break;
            case 2:
                this.suit = Suit.SPADES;
                this.imageIndex = imageIndex + 13;
                this.suitString = "Spade";
                break;
            case 3:
                this.suit = Suit.CLUBS;
                this.imageIndex = imageIndex + 26;
                this.suitString = "Club";
                break;
            case 4:
                this.suit = Suit.HEARTS;
                this.imageIndex = imageIndex + 39;
                this.suitString = "Heart";
                break;
        }
        
        
    }

    public String getSuitString() {
        return suitString;
    }

    public int getImageIndex() {
        return imageIndex;
    }
    
    
    
    public Suit getSuit()
    {
        return this.suit;
    }
    
    public int getValue()
    {
        return this.value;
    }

    @Override
    public String toString() {
        return "Card{" + value + " Of " + suit + '}';
    }

    @Override
    public int compareTo(Object card) {
        int compareValue= ((Card) card).getValue();
        return compareValue - this.value;
    }
    
    
    
    
}
