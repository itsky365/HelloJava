package com.awifi.toe;
import java.util.Date;


/**
 * Created by zhuxh on 15-10-28.
 */
public class StringTest {
    public static void main(String[] args) {
        String string = "浙江爱wifi爱人民";
        System.out.println(string.charAt(1));
        System.out.println(string.codePointAt(1));
        System.out.println(string.startsWith("浙江爱"));
        System.out.println(string.startsWith("爱", 7));
        System.out.println(string.substring(3));
        System.out.println(string.substring(3, 7));
        System.out.println(string.compareTo("浙江爱wifi爱人民1"));
        System.out.println(String.format("%s，你好！%n %d岁", "张三", 30));
        System.out.printf("3>7的结果是：%b %n", 3>7);
        System.out.printf("格式参数$的使用：%1$d, %2$s, %1$d %n", 99, "abc");

        Date date = new Date();
        System.out.println(String.format("%tY年 %tm月 %td日 %tH时 %tM分 %tS秒", date, date, date, date, date, date));
        System.out.printf("== %1$tY年 %1$tm月 %1$td日 %1$tH时 %1$tM分 %1$tS秒 %n", date);

        System.out.println("aabbccaaee".replaceAll("a", "AA"));
        System.out.println("aabbccaaee".replaceFirst("a", "AA"));
    }
}
