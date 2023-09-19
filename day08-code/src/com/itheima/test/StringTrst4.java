package com.itheima.test;
/*
    需求：键盘录入一个字符串，如果字符串中包含TMD,则使用***代替
 */

import java.util.Scanner;

public class StringTrst4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入");
        String content = sc.nextLine();
        String out=content.replace("TMD","***");
        System.out.println(out);
    }
}
