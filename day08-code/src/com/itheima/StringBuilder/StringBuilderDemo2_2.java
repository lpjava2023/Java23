package com.itheima.StringBuilder;
/*
    StringBuilder构造方法：
    1.public StringBuilder():创建一个空白的字符缓冲区(容器)，其初始容量为16个字符，若超过16个字符会自动扩容。
    2.public StringBuilder():创建一个字符缓冲区(容器),在创建好之后，就会带有参数的内容
 */

public class StringBuilderDemo2_2 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("12356789123456789");
        System.out.println(sb);

        StringBuilder sb1 = new StringBuilder("abcd");
        System.out.println(sb1);



    }
}
