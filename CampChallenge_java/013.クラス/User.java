/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.mypackage.sample;

import java.util.ArrayList;
import java.util.Random;

public class User extends Human {

    @Override
    public void setCard(ArrayList<Integer> list) {

        for (int i = 1; i < list.size(); i++) {
            myCards.add(list.get(i));

        }
    }

    @Override
    public boolean checkSum() {

        int total = open();

        if (total <= 21) {
            return true;

        }
        return false;
    }

    @Override
    public int open() {
        int total = 0;
        for (int i : myCards) {
            total += i;
        }
        return total;

    }

}
