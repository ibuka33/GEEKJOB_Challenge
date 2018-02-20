/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.mypackage.sample;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author ibuka kentaro
 */
public class challenge18 {

    public static void main(String[] args) throws IOException {

        String word = "Cha  lle  nge";
        System.out.println(word.replace(" ", ""));

        File fp = new File("test.txt");

        FileReader fr = new FileReader(fp);

        try (
                BufferedReader br1 = new BufferedReader(fr)) {

            System.out.println(br1.readLine());
        }
    }
}

