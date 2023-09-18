package com.itheima.String;
/*
        String类的特点:
            1.Java程序中所有双引号，都是String这个类的对象

                String s = "abc";
                s.toUpperCase(Locale.ROOT);//只有对象才可以调用方法
                System.out.println(s.toUpperCase(Locale.ROOT));//输出为ABC
                System.out.println("abc".toUpperCase(Locale.ROOT));//输出为ABC

            2.字符串一旦被创建，就不可以更改(内容不可更改)
                    如果想改，只能使用新的对象，做替换
                    //在一个地址中存的内容不会被改变，此处只是做了替换
                    String t = "abc";
                    t = "def";
                    System.out.println(t);//输出为def

            3.String对象不可以改变，但是可以被共享
                    String c1 = "aaa";
                    String c2 = "aaa";
                    System.out.println(c1==c2);//返回值为true
 */

import java.util.Locale;

public class StringDemo {
    public static void main(String[] args) {

        String s = "abc";
        s.toUpperCase(Locale.ROOT);
        System.out.println(s.toUpperCase(Locale.ROOT));//输出为ABC
        System.out.println("abc".toUpperCase(Locale.ROOT));//输出为ABC

        String t = "abc";
        t = "def";
        System.out.println(t);//输出为def，此处只是做了替换

        String c1 = "aaa";
        String c2 = "aaa";
        System.out.println(c1==c2);//返回值为true
    }
}
