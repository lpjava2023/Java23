package com.itheima.test;
/*
        需求：键盘接收一个字符串，程序判断出该字符串是否是对称字符串（回文字符串），并在控制台打印出是或不是
        对称字符串：    123321 111
        非对称字符串：  123123
        思路：对称的字符串进行反转，反转后的内容，更原数据相同，判断为回文字符串
 */

import java.sql.SQLOutput;
import java.util.Scanner;

public class StringBuilderTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串");
        String l1 = sc.next();
        //将String类型转化为StringBuilder类型，从而使用StringBuilder的reverse();
        StringBuilder sb = new StringBuilder(l1);
        sb.reverse();
        //判断字符是否相等，用equal
        if(l1.equals(sb.toString())){
            System.out.println("输入的字符串为回文字符");
        }else{
            System.out.println("不是回文字符");
        }
    }
}
