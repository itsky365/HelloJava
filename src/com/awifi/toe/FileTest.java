package com.awifi.toe;

import java.io.File;
import java.io.FileOutputStream;

/**
 * Created by zhuxuehuang on 15/10/28.
 */

public class FileTest {
    public static void main(String[] args) {
        File file = new File("a.txt");
        System.out.println(file.getPath());
        System.out.println(file.getName());
        System.out.println(file.isFile());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.exists());

        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch(Exception e){
                System.out.println(e);
            }
        }

        String str = "好好学习 天天向上";
        try {
            FileOutputStream fileout = new FileOutputStream(file);
            fileout.write(str.getBytes());
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("完成操作");
        }


    }
}
