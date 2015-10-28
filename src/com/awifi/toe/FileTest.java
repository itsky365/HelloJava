package com.awifi.toe;

import java.io.File;

/**
 * Created by zhuxuehuang on 15/10/28.
 */

public class FileTest {
    public static void main(String[] args) {
        try {
            File file = new File("a.txt");
            System.out.println(file.exists());
            if (!file.exists()) {
                file.createNewFile();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
