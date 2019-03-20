/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GameStates;

import Client.UpdateTable;
import Windows.PokerWindow;
import java.io.Serializable;
import java.util.ArrayList;
import mypoker.Card;
import mypoker.Player;
import mypoker.Table;

/**
 *
 * @author DannySuarez
 */
public class JoinedState implements IGameState, Serializable{
    private ArrayList<Card> tableCards;
    private ArrayList<Double> playerBalances;
    private ArrayList<String> playerNames;
    private double potSize;
    public JoinedState(Table t) {
        tableCards = t.getTableCards();
        this.generateBalances(t);
        potSize = t.getPot();
    }
    
    private void generateBalances(Table t){
        this.playerBalances = new ArrayList<Double>();
        for(Player p : t.getPlayers()){
            this.playerBalances.add(p.getBalance());
        }
        
    }

    public ArrayList<Card> getTableCards() {
        return tableCards;
    }

    
    @Override
    public void updateTable(PokerWindow window) {
        window.potAmount.setText(String.valueOf(this.potSize));
        for(int i = 0;i<this.playerBalances.size();i++){
            window.playerLabels.get(i).setText(String.valueOf(this.playerBalances.get(i)));
        }
        UpdateTable.updateTableCards(window, this); 
    }

    @Override
    public ArrayList<Card> getPlayerCards() {
        return null;
    }
    
}
