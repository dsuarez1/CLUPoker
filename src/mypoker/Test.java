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
public class Test {
    public static void main(String args[]){
        ArrayList<Integer> test = new ArrayList<Integer>();
        test.add(0);
        test.add(1);
        test.add(2);
        remove(test);
        for(int x:test){
            System.out.println(x);
        }
    }
    public static void remove(ArrayList<Integer> testList){
        testList.remove(1);
    }
}

