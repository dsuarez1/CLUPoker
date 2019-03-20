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

//Every method here should be rethought and rechecked especially those like 3kind two pair 
//to make sure we get the highest 2 pair or 3kind
public class HandChecker {

    public static void main(String args[]) {
        ArrayList<Card> cards = new ArrayList<Card>();
//        for(int i = 7;i<14;i++){
//            Card c = new Card(1,i);
//            cards.add(c);
//        }
        //suit, value
        Card c1 = new Card(1,2);
        Card c2 = new Card(1,2);
        Card c3 = new Card(1,2);
        Card c4 = new Card(1,5);
        Card c5 = new Card(1,5);
        Card c6 = new Card(2,13);
        Card c7 = new Card(1,8);
        
        cards.add(c1);
        cards.add(c2);
        cards.add(c3);
        cards.add(c4);
        cards.add(c5);
        cards.add(c6);
        cards.add(c7);

        
        System.out.println(findHand(cards));
        

    }
//at some point we have to consider handling aces COME BACK TO THIS    

    public static Hand findHand(ArrayList<Card> cards) {
        ArrayList<Card> cardsCopy = new ArrayList<Card>();
        for(Card c : cards){
            cardsCopy.add(c);
        }
        Collections.sort(cardsCopy);
        if (checkRoyalFlush(cardsCopy) != null)
        {
            Hand h = checkRoyalFlush(cardsCopy);
            return h;
        }
        if (checkStraightFlush(cardsCopy) != null)
        {
            Hand h = checkStraightFlush(cardsCopy);
            return h;
        }
        if (check4Kind(cardsCopy) != null)
        {
            Hand h = check4Kind(cardsCopy);
            return h;
        }
        if (checkFullHouse(cardsCopy) != null)
        {
            Hand h = checkFullHouse(cardsCopy);
            return h;
        }
        if (checkFlush(cardsCopy) != null)
        {
            Hand h = checkFlush(cardsCopy);
            return h;
        }
        if (checkStraight(cardsCopy) != null)
        {
            Hand h = checkStraight(cardsCopy);
            return h;
        }
        if (check3Kind(cardsCopy) != null)
        {
            Hand h = check3Kind(cardsCopy);
            return h;
        }
        if (checkTwoPair(cardsCopy) != null)
        {
            Hand h = checkTwoPair(cardsCopy);
            return h;
        }
        if (checkPair(cardsCopy) != null)
        {
            Hand h = checkPair(cardsCopy);
            return h;
        }
        
        return checkHighCard(cardsCopy);

    }

    private static ArrayList<Integer> getHighCards(int invalid1, int invalid2, ArrayList<Card> cards) {
        ArrayList<Integer> highCards = new ArrayList<Integer>();
        for (Card c : cards)
        {
           // System.out.println("Value " + c.getValue());
            if (c.getValue() != invalid1 && c.getValue() != invalid2)
            {
                highCards.add(c.getValue());
            }
        }
        return highCards;
    }

    private static Hand checkRoyalFlush(ArrayList<Card> cards) {
        int rank = 1;
        int sum = 60;
        int counter = 0;
        int value = 14;
        if (cards.get(0).getValue() == 14)
        {
            String suit = cards.get(0).getSuitString();
            for (int i = 1; i < cards.size(); i++)
            {
                Card c = cards.get(i);
                if (value == c.getValue() + 1 && suit.equals(c.getSuitString()))
                {
                    value = c.getValue();
                    suit = c.getSuitString();
                    counter++;
                }
            }
        }

        if (counter >= 4)
        {
            Hand hand = new Hand(rank, sum);
            return hand;
        }
        return null;
    }

    private static Hand checkStraightFlush(ArrayList<Card> cards) {
        int rank = 2;
        return null;
    }

    private static Hand check4Kind(ArrayList<Card> cards) {
        int rank = 3;
        int[] counts = new int[15];
        for (Card c : cards)
        {
            counts[c.getValue()]++;
        }

        for (int i = 2; i < counts.length; i++)
        {
            if (counts[i] == 4)
            {
                Hand h = new Hand(rank, i * 4);
                return h;
            }
        }

        return null;
    }

    //Almost working check sum
    private static Hand checkFullHouse(ArrayList<Card> cards) {
        //how do we know which triple is higher
        //maybe keep track of the "key card" in Hand class
        int rank = 4;
        int threeCount = 0;
        int twoCount = 0;
        int[] counts = new int[15];
        for (Card c : cards)
        {
            counts[c.getValue()]++;
        }

        for (int i = 2; i < counts.length; i++)
        {
            if (counts[i] == 3)
            {
                threeCount = i;
            }
            if (counts[i] == 2)
            {
                twoCount = i;
            }
        }
        if (threeCount != 0 && twoCount != 0)
        {
            Hand h = new Hand(rank, threeCount + twoCount);
            return h;
        }
        return null;
    }

    //Working 
    private static Hand checkFlush(ArrayList<Card> cards) {
        int rank = 5;
        ArrayList<ArrayList<Card>> suits = new ArrayList<ArrayList<Card>>();
        for (int i = 0; i < 4; i++)
        {
            suits.add(new ArrayList<Card>());
        }

        for (Card c : cards)
        {
            suits.get(c.getSuitInt()).add(c);
        }
        for (ArrayList<Card> cardLists : suits)
        {
            if (cardLists.size() >= 5)
            {
                Hand h = new Hand(rank, cardLists.get(0).getValue());
                return h;
            }
        }
        return null;
    }

    //finding straight method NOT WORKING 
    private static Hand checkStraight(ArrayList<Card> cards) {
        int rank = 6;
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
        int rank = 7;
        int[] counts = new int[15];
        for (Card c : cards)
        {
            counts[c.getValue()]++;
        }

        for (int i = 2; i < counts.length; i++)
        {
            if (counts[i] == 3)
            {
                ArrayList<Integer> highs = getHighCards(i, 0, cards);
                Hand h = new Hand(rank, highs.get(0) + highs.get(1));
                return h;
            }
        }

        return null;
    }

    private static Hand checkTwoPair(ArrayList<Card> cards) {
        int pairCount = 0;
        int pair1 = 0;
        int pair2 = 0;
        int rank = 8;
        int[] counts = new int[15];
        for (Card c : cards)
        {
            counts[c.getValue()]++;
        }

        for (int i = 14; i > 1; i--)
        {
            if (counts[i] == 2)
            {
                if (pairCount == 0)
                {
                    pair1 = i;
                    pairCount++;
                } else if (pairCount == 1)
                {
                    pair2 = i;
                    pairCount++;
                }
            }
        }

        //this is an absolute hack
        if (pairCount == 2)
        {
            ArrayList<Integer> highs = getHighCards(pair1, pair2, cards);
            Hand h = new Hand(rank, pair1 * 100 + pair2 * 10 + highs.get(0));
            return h;
        }
        return null;
    }

    private static Hand checkPair(ArrayList<Card> cards) {
        //dealing with high cards should be reconsidered
        int rank = 9;
        int[] counts = new int[15];
        for (Card c : cards)
        {
            counts[c.getValue()]++;
        }

        for (int i = 14; i > 1; i--)
        {
            if (counts[i] == 2)
            {
                Hand h = new Hand(rank, i);
                return h;
            }
        }
        return null;
    }
    //Not Working still need to get all high cards 
    private static Hand checkHighCard(ArrayList<Card> cards) {
        int rank = 10;
        ArrayList<Integer> highs = getHighCards(0, 0, cards);
        Hand h = new Hand(rank, highs.get(highs.size()-1));
        return h;
    }
}
