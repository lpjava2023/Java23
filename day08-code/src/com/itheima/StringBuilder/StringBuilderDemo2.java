package com.itheima.StringBuilder;
/*
       StringBuilder的介绍：
            1.一个可变的字符序列
            2.StringBuilder是字符缓冲区，将其理解为容器，这个容器可以存储任意数据类型，但只要进入这个容器，全部变为字符串。
 */

public class StringBuilderDemo2 {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();
        sb.append(100);
        sb.append(45.6);
        sb.append(false);
        sb.append('中');
        sb.append("遥遥领先");
        System.out.println(sb);
        //输出：10045.6false中遥遥领先


    }
}
