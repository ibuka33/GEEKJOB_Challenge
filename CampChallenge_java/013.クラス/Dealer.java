/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.mypackage.sample;

import java.util.ArrayList;
import java.util.Random;

public class Dealer extends Human {

    ArrayList<Integer> cards = new ArrayList<Integer>();

    public Dealer() {

        for (int number = 1; number <= 13; number++) {
            for (int suit = 1; suit <= 4; suit++) {
                cards.add(number);
            }
            if (number >= 11) {
                cards.add(10);
            } else {
                cards.add(number);
            }

        }
    }

    public ArrayList<Integer> deal() {

        //　返却用のカード
        ArrayList<Integer> list = new ArrayList<Integer>();

        // 乱数生成用
        Random rand = new Random();

        for (int i = 1; i <= 2; i++) {

            // nextInt を使って乱数を生成する
            // index には 0 ～ カードの枚数（ cards.size() -1 ）  の値が入る
            // index で「何番目の」カードを山札から引くかを決める
            int index = rand.nextInt(cards.size());

            // 山札から１枚引いて、一時的に変数に格納しておく
            Integer n = cards.remove(index);

            // 返却用の ArrayList に追加する
            list.add(n);
        }

        // 返却
        return list;

    }

    public ArrayList<Integer> hit() {

        //　返却用のカード
        ArrayList<Integer> list = new ArrayList<>();

        // 乱数生成用
        Random rand = new Random();

        for (int i = 1; i < 2; i++) {

            // nextInt を使って乱数を生成する
            // index には 0 ～ カードの枚数（ cards.size() -1 ）  の値が入る
            // index で「何番目の」カードを山札から引くかを決める
            int index = rand.nextInt(cards.size());

            // 山札から１枚引いて、一時的に変数に格納しておく
            Integer n = cards.remove(index);

            // 返却用の ArrayList に追加する
            list.add(n);
        }

        // 返却
        return list;

    }

    @Override
    public void setCard(ArrayList<Integer> list) {

        for (int i = 1; i < list.size(); i++) {
            myCards.add(list.get(i));

        }
    }

    @Override
    public boolean checkSum() {

        int total = open();

        if (total <= 17) {
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
