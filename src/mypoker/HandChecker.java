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
public class HandChecker {
//at some point we have to consider handling aces COME BACK TO THIS    

    private static Hand checkRoyalFlush(ArrayList<Card> cards) {
        return null;
    }

    private static Hand checkStraightFlush(ArrayList<Card> cards) {
        return null;
    }

    private static Hand check4Kind(ArrayList<Card> cards) {
        return null;
    }

    private static Hand checkFullHouse(ArrayList<Card> cards) {
        return null;
    }

    private static Hand checkFlush(ArrayList<Card> cards) {
        return null;
    }

    //finding straight method
    private static Hand checkStraight(ArrayList<Card> cards) {
        int rank = 6; //??is this 5
        int sum = 0;
        Collections.sort(cards);
        Collections.reverse(cards);
        int holder = 1;
        int firstvalholder = 0;

        for (int i = 0; i < cards.size() - 1; i++)
        {
            if (cards.get(i + 1).getValue() == cards.get(i).getValue() - 1)
            {
                holder = holder + 1;
                if (holder == 2)
                {
                    firstvalholder = i;
                }

                if (holder == 5)
                {
                    break;
                }

            } else
            {
                holder = 1;
            }

            if (holder == 5)
            {
                for (int j = firstvalholder; j < firstvalholder + 5; j++)
                {
                    sum += cards.get(j).getValue();
                }
                Hand h = new Hand(rank, sum);
                return (h);
            }
        }
        return null;
    }

    private static Hand check3Kind(ArrayList<Card> cards) {
        return null;
    }

    private static Hand checkTwoPair(ArrayList<Card> cards) {
        return null;
    }

    private static Hand checkPair(ArrayList<Card> cards) {
        return null;
    }

    private static Hand checkHighCard(ArrayList<Card> cards) {
        return null;
    }
}
