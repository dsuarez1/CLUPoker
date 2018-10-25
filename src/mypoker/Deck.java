/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypoker;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author DannySuarez
 */
public class Deck {
    private ArrayList<Card> deck = new ArrayList<>();

    public Deck() {
        this.populate();
    }
    
    private void populate(){
        int value = 2;
        int suit = 1;
        
        
        for(int i = 0; i< 52;i++){
            if(value == 15){
                value = 2;
                suit++;
            }
            
            
            Card c = new Card(suit,value);
            
            deck.add(c);
            
            value++;
        }
    }
    
    public Card dealCard(){
        Random rand = new Random();
        int  n = rand.nextInt(deck.size());
        return deck.remove(n);
    }

    public ArrayList<Card> getDeck() {
        return deck;
    }
    
    
    
    
}

