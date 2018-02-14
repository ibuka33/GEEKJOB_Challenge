/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.mypackage.sample;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author ibuka kentaro
 */
public class challenge12 {

    public static void main(String[] args) throws ParseException {

        String d = "20161104100000";

        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
        Date date = sdf.parse(d);
        System.out.println(date.getTime() / 1000);

        long timestamp = date.getTime();
        Date date1 = new Date(timestamp);
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy年MM月dd日HH時mm分ss秒");
        System.out.println(sdf1.format(date1));
    }
}
