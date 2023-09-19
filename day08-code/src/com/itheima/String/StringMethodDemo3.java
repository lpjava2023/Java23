package com.itheima.String;
/*
           public String substring(int beginIndex,int endIndex)截取
           注意点：包头不包尾，包左不包右
           只有返回值才是截取的小串
           public Stringsubstring(int beginIndex) 截取到末尾
 */

public class StringMethodDemo3 {
    public static void main(String[] args) {
        extracted();

        extracted1();

    }

    private static void extracted1() {
        String s = "ithima";
        String result = s.substring(0,2);
        System.out.println(result);//it
    }

    private static void extracted() {
        String s = "ithima";
        String result = s.substring(3);//ima
        System.out.println(result);
    }
}
