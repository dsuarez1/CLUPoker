/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypoker;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author DannySuarez
 */
public class handChecker implements Comparable{
//at some point we have to consider handling aces COME BACK TO THIS    
    

   //finding straight method
private static Hand checkStraight(ArrayList<Card> cards){
    int rank = 5; //??is this 5
    int sum = 0;
    Collections.sort(cards);
    Collections.reverse(cards);
    int holder = 1;
    int firstvalholder = 0;

    for(int i = 0;i<cards.size()-1;i++){
        if (cards.get(i + 1).getValue() == cards.get(i).getValue()-1){
            holder = holder + 1;
            if(holder == 2){
                firstvalholder = i;
            }

              

            if(holder == 5){
                break;
            }
                
        }
        else{
            holder = 1;
        }

        if (holder == 5){
            for(int j = firstvalholder;j < firstvalholder+5;j++){
                sum += cards.get(j).getValue();
            }
            Hand h = new Hand(rank,sum);
            return(h);
        }        
    }
    return null;
}

    @Override
    public int compareTo(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

    
