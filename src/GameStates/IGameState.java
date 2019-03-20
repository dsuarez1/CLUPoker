/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GameStates;

import Windows.PokerWindow;
import java.io.Serializable;
import java.util.ArrayList;
import mypoker.Card;

/**
 *
 * @author DannySuarez
 */
public interface IGameState {
    void updateTable(PokerWindow t);
    ArrayList<Card> getTableCards();
    ArrayList<Card> getPlayerCards();
       
    
    
    
    
}
