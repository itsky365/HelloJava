package com.awifi.toe;
import java.util.Date;

/**
 * Created by zhuxh on 15-10-28.
 */
public class ThreadTest {
    public static void main(String[] args) {
        System.out.println("==sleep start==");
        try {
            Thread.sleep(1000 * 5);
            System.out.println("==sleep end==");
        } catch (Exception e) {
            System.out.println(e);
        }

        try {
            System.out.println(new Date( ) + "\n");
            Thread.sleep(1000*3);   // 休眠3秒
            System.out.println(new Date( ) + "\n");
        } catch (Exception e) {
            System.out.println("Got an exception!");
        }
    }
}
