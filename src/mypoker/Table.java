/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypoker;

import java.util.ArrayList;

/**
 *
 * @author DannySuarez
 */
public class Table {

    private double pot;
    private Deck deck;
    private ArrayList<Player> players;
    private ArrayList<Card> tableCards;

    public Table(int numPlayers) {
        this.pot = 0;
        deck = new Deck();
        this.players = new ArrayList<>();
        for (int i = 0; i < numPlayers; i++)
        {
            players.add(new Player());

        }
        this.tableCards = new ArrayList<>();
    }
    
    public void getBets(){
        
    }

    public void addPlayer(Player p) {
        this.players.add(p);
    }

    public void removePlayer(Player p) {
        this.players.remove(p);
    }

    public void dealPlayers() {
        for (int i = 0; i < players.size(); i++)
        {
            if (players.get(i).isInHand())
            {
                players.get(i).addCardToHand(this.deck.dealCard());
                players.get(i).addCardToHand(this.deck.dealCard());
            }
        }
    }
    
    public void nextHand(){
        for(Player p: players){
            p.setHand_count(0);
            if(p.getBalance()>0){
                p.setInHand(true);
            }
        }
        this.pot = 0;
        this.deck = new Deck();
    }

    public double getPot() {
        return pot;
    }

    public void setPot(double pot) {
        this.pot = pot;
    }

    public Deck getDeck() {
        return deck;
    }

    public void setDeck(Deck deck) {
        this.deck = deck;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }

    public ArrayList<Card> getCards() {
        return tableCards;
    }

    public void setCards(ArrayList<Card> cards) {
        this.tableCards = cards;
    }

    public void dealFlop() {
        for(int i = 0;i<3;i++){
            Card c = this.deck.dealCard();
            this.tableCards.add(c);
        }
        
    }
    
    public void dealTurnOrRiver(){
        Card c = this.deck.dealCard();
        this.tableCards.add(c);
    }

    public void printTable(){
        System.out.println("-------TABLE---------");
        for(Card c: tableCards){
            System.out.println(c);
        }
}
   
    
    

}
