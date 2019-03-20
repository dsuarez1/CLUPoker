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
public class Player {
    private double balance;
    private Card[] hand;
    private int hand_count;
    private boolean inHand;
    private boolean turn;
    private boolean hasBet;
    private Hand handRank;
    private int playerNumber;
    private String userName;
    
    public Player()
    {
        this.balance = 5000;
        this.hand = new Card[2];
        this.hand_count = 0; // track the amount of cards added to hand
        this.inHand = false; 
        this.turn = false; 
        this.hasBet = false; //checks if the player has bet in the current round
        this.handRank = null;
    }
    
    public Player(String name,int num,int balance)
    {
        super();
        this.userName=name;
        this.playerNumber = num;
    }

    public void setHandRank(Hand handRank) {
        this.handRank = handRank;
    }

    public Hand getHandRank() {
        return handRank;
    }

    public int getNumber() {
        return playerNumber;
    }

    public void setNumber(int number) {
        this.playerNumber = number;
    }

    public String getName() {
        return userName;
    }

    public void setName(String name) {
        this.userName = name;
    }

    
    
    public boolean isHasBet() {
        return hasBet;
    }

    public void setHasBet(boolean hasBet) {
        this.hasBet = hasBet;
    }

    
    
    public boolean isTurn() {
        return turn;
    }

    public void setTurn(boolean isTurn) {
        this.turn = isTurn;
    }

    
    
    public int getHand_count() {
        return hand_count;
    }

    public void setHand_count(int hand_count) {
        this.hand_count = hand_count;
    }
    
    public void fold(){
        this.inHand = false;
    }
    
    public double bet(double amount){
        if(this.balance >= amount){
            this.balance = this.balance - amount;
        }
        return amount; 
    }

    public void incBalance(double amount) {
        this.balance += amount;
    }
    
    public void decBalance(double amount) {
        this.balance -= amount;
    }
    
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public boolean isInHand() {
        return inHand;
    }

    public void setInHand(boolean inHand) {
        this.inHand = inHand;
    }
    

  
    
    // add cards to the player's hand
    public void addCardToHand(Card card)
    {
        if(hand_count < 3) // can only add a max of 2 cards to the hand
        {
            this.hand[this.hand_count] = card;
            this.hand_count++;
        }
        
    }
    
    public Card[] getHand()
    {
        return this.hand;
    }

    @Override
    public String toString() {
        return "Player - " + "balance=" + balance + "\n" + hand[0] +  "  and " + hand[1];
    }
    
    
}