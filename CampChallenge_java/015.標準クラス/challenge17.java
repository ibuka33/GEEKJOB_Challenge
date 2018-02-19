/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.mypackage.sample;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author ibuka kentaro
 */
public class challenge17 {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        File fp = new File("test.txt");

        // FileReader作成
        FileReader fr = new FileReader(fp);
        // 1行読み出し
        try ( // BufferedReader作成
                BufferedReader br = new BufferedReader(fr)) {
            // 1行読み出し
            System.out.println(br.readLine());
        }
    }
}
