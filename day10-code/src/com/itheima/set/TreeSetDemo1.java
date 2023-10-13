package com.itheima.set;

import java.util.TreeSet;

public class TreeSetDemo1 {
    /*
        TreetSet集合的特点体验：排序，去重
     */
    public static void main(String[] args) {
        TreeSet<String> t = new TreeSet<>();
        t.add("a");
        t.add("b");
        t.add("c");
        t.add("d");
        t.add("a");
        System.out.println(t);//[a, b, c, d]
    }
}
