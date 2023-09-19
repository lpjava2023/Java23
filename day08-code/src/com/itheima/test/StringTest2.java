package com.itheima.test;
/*
    需求:键盘输入一个字符串,统计该字符串中的小写字符个数，及数字字符出现的次数(不考虑其他字符)
    例如:Aade&ce*4cs5
    小写字符：7
    大写字符：1
    数字字符：2
 */

import java.util.Scanner;

public class StringTest2 {
    public static void main(String[] args) {
        //1.键盘录入一个字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串：");
        String input = sc.nextLine();
        //2.定义三份计数器变量，用于统计
        int AA = 0;
        int aa = 0;
        int num = 0;
        //3.遍历字符串，获取每一个字符
        char[] arr = input.toCharArray();
        //arr.fori
        for (int i = 0; i < arr.length; i++) {
            //arr[i].var
            char c = arr[i];
            //4.在遍历过程中，加if判断，看字符属于哪一种
            if (c >= 'a' && c <= 'z') {
                //5.对应的计数器变量自增
                aa++;
            } else if (c >= 'A' && c<= 'Z') {
                AA++;
            } else if (c > '0' && c < '9') {
                num++;
            } else {

            }

        }
        //6.在遍历结束后，将统计好的计数器变量，打印在控制台
        System.out.println("大写的字母:" + AA + "小写的字母:" + aa + "数字字符:" + num);
    }
}
