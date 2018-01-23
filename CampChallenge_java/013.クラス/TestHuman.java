/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.mypackage.sample;

/**
 *
 * @author ibuka kentaro
 */
public class TestHuman {

    public static void main(String args[]) {

        Human_1 hito= new Human_1();

        hito.birth = 0;

        hito.setHuman("井深", 19890303);

        System.out.println("名前:" +hito.name);
        System.out.println("生年月日:" +hito.birth);
    }

}