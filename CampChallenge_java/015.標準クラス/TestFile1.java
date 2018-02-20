/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.mypackage.sample;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author ibuka kentaro
 */
public class TestFile1 {

    public static void main(String[] args) throws IOException {

        File fp = new File("test.txt");

        try (
                FileWriter fw = new FileWriter(fp)) {

            fw.write("2000-01-01 12:00 開始");
            fw.write("2000-04-04 11:00 終了");

            fw.close();
        }
    }
}
