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
public class Card {
    //attributes
    private Suit suit;
    private String suitString;
    private int value;
    
    
    public Card(int s, int v)
    {
        switch(s)
        {
            case 1:
                this.suit = Suit.DIAMONDS;
                this.suitString = "Diamond";
                break;
            case 2:
                this.suit = Suit.SPADES;
                this.suitString = "Spade";
                break;
            case 3:
                this.suit = Suit.CLUBS;
                this.suitString = "Club";
                break;
            case 4:
                this.suit = Suit.HEARTS;
                this.suitString = "Heart";
                break;
        }
        
        this.value = v;
    }

    public String getSuitString() {
        return suitString;
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
    
    
    
    
}
