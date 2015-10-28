package com.awifi.toe;

import java.util.HashMap;

/**
 * Created by zhuxh on 15-10-28.
 */

public class MapTest {
    public String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        hashMap.put("a", "aaaa");
        hashMap.put("b", "bbbb");

        System.out.println(hashMap.size());
        System.out.println(hashMap.values());
        System.out.println(hashMap.keySet());
        System.out.println(hashMap.get("a"));
        System.out.println(hashMap.containsKey("a"));
        System.out.println(hashMap.containsValue("aaaa"));
    }
}
