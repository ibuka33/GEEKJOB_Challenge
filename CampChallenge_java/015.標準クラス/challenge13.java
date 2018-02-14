/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.mypackage.sample;

import java.util.Calendar;

/**
 *
 * @author ibuka kentaro
 */
public class challenge13 {

    public static void main(String[] args) {

        Calendar cal1 = Calendar.getInstance();
        Calendar cal2 = Calendar.getInstance();
        cal1.set(2015, 12, 31, 23, 59, 59);
        cal2.set(2015, 1, 1, 00, 00, 00);

        long diffTime = cal1.getTimeInMillis() - cal2.getTimeInMillis();
        System.out.println("2つの日付の差は：" + diffTime + "秒です。");
    }
}
