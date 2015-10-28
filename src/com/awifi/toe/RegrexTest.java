package com.awifi.toe;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by zhuxh on 15-10-28.
 */

public class RegrexTest {
    public static void main(String[] args) {
        //网址匹配
        //当条件满足时，将返回true，否则返回false
        //Pattern pattern = Pattern.compile("^https?:\\/\\/(([a-zA-Z0-9_-])+(\\.)?)*(:\\d+)?(\\/((\\.)?(\\?)" +
        //        "?=?&?[a-zA-Z0-9_-](\\?)?)*)*$", Pattern.UNICODE_CASE);
        //Matcher matcher = pattern.matcher("https://www.baidu.com/aaa/?a=b&c=d");
        //boolean b= matcher.matches();
        //System.out.println(b);

        //替换第一个符合正则的数据
        //Pattern pattern = Pattern.compile("正则表达式");
        //Matcher matcher = pattern.matcher("正则表达式 Hello World, 正则表达式 Hello World");
        //System.out.println(matcher);
        //System.out.println(matcher.replaceFirst("Java"));
        //System.out.println(matcher.replaceAll("Java"));

        //文字替换（置换字符）
        //Pattern pattern = Pattern.compile("正则表达式");
        //Matcher matcher = pattern.matcher("正则表达式 Hello World, 正则表达式 Hello World");
        //StringBuffer sbr = new StringBuffer();
        //while (matcher.find()) {
        //    matcher.appendReplacement(sbr, "Java");
        //}
        //matcher.appendTail(sbr);
        //System.out.println(sbr);
        //System.out.println(sbr.toString());
    }
}
