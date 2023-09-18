package com.itheima.String;
/*
    String 类型常见的构造方法：

        public String();创建一个空白字符串，里面不含任何字符
        public String(char[] chs):根据传入的字符数组，创建字符对象
        public String(String original):根据传入的字符串，来创建字符串类型

        --------------------------------------------------------------

        1.打印对象名，会看到对象的内存地址，这里打印字符串对象，为啥没有看到地址值
            回答：暂时不解释
            T0D0：面向对象(继承)，方法重写，object类，toString方法
        2.这三个构造方法，创建字符串对象，都没有双引号直接创建来的方便
                String s = "abc";

        ------------------------------------------------------------

        字符串对象，两种创建方式区别：
                1.双引号直接创建
                2.通过构造方法创建

 */

public class StringDemo2 {
    public static void main(String[] args) {
       //public String();创建一个空白字符串，里面不含任何字符
       String s1 = new String();
        System.out.println(s1);//输出啥也没有

        //public String(char[] chs):根据传入的字符数组，创建字符对象
        char[] chs = {'a','b','c'};
        String s2 = new String(chs);
        System.out.println(s2);//输出为abc

        //public String(String original):根据传入的字符串，来创建字符串类型
        String s3 = new String("abc");
        System.out.println(s3);//输出为abc

    }
}
