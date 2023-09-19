package com.itheima.String;
/*
 String类用于遍历的方法

        public char[] toCharArry()将此字符转换为一个新的字符数组
        public char CharAt(int index)返回指定索引处的char值
        public int length():返回字符串的长度

 */

public class StringMethodDemo2 {
    public static void main(String[] args) {
        print1();

        print2();


    }
    /**
     * 字符串的第二种遍历
     * */
    //方法起名字Ctrl+Alt+m
    private static void print2() {
        String s ="itheima";
        //此处的s.length()为字符串的一个方法需要括号
        for (int i=0;i<s.length();i++){
            char c = s.charAt(i);
            System.out.println(c);
        }
    }

    /**
     * 字符串的第一种遍历(效率高)
     * */
    private static void print1() {
        String s = "itheima";
        char[] arr=s.toCharArray();
        //此处的arr.length为数组属性不需要带括号
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

}
