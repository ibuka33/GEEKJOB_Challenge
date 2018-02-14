/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.mypackage.sample;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author ibuka kentaro
 */
public class challenge11 {

    public static void main(String[] args) {

        Date d = new Date();

        SimpleDateFormat d1 = new SimpleDateFormat("yyyy年MM月dd日 HH時mm分ss秒");
        String d2 = d1.format(d);
        System.out.println(d2);
    }
}
