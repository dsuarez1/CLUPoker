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
public class Tester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numPlayers = 4;
        Table table1 = new Table(numPlayers);
        

            table1.nextHand(); //set up next hand(resets deck,puts players back in, resets pot)
            table1.dealPlayers(); //deal out initial cards
            //table1.getBets(notSupported);//place initial bets
            table1.dealFlop();//deal the flop
            //place secondary bets
            table1.dealTurnOrRiver();//deal the turn
            //place third bets
            table1.dealTurnOrRiver();//deal the river
            //place final bets
            //end hand
        
        
        
        
        for(int i = 0; i<4;i++){
            System.out.println("PLAYER " + i);
            System.out.println(table1.getPlayers().get(i));
        }
        
        table1.printTable();
        //System.out.println(table1.getDeck().getDeck().size());
        
        
        
        
        
        
        
        
        
    }
    
}
