/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypoker;

/**
 *
 * @author DannySuarez
 */
public class Hand {
    private int rank;
    private int sum;
    private String hand;

    public Hand(int rank, int sum) {
        this.rank = rank;
        this.sum = sum;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    @Override
    public String toString() {
        return "Hand{" + "rank=" + rank + ", sum=" + sum +'}';
    }
    
    
}
