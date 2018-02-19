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
public class TestFile {

    public static void main(String[] args) throws IOException {
        // ファイルオープン
        File fp = new File("test.txt");

        // 書き込み
        try ( // FileWriter作成
                FileWriter fw = new FileWriter(fp)) {
            // 書き込み
            fw.write("こんにちは！<br>");
            fw.write("井深です。<br>");
            fw.write("よろしくお願いします。<br>");
            // クローズ
            fw.close();
        }
    }
}
