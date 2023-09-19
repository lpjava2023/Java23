package com.itheima.test;
/*
    需求：以字符串的形式从键盘接受一个手机号，将中间四位手机号屏蔽
            最终结果：123****1234

    分析：1.键盘录入字符串
         2.截取前三位字符串
         3.截取后四位字符串
         4.前三位+****+后四位
 */

import java.util.Scanner;

public class StringTest3 {
    public static void main(String[] args) {
        //1.键盘录入字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入电话");
        String tel = sc.nextLine();
        //2.截取前三位字符串
        String num1 = tel.substring(0,3);
        // 3.截取后四位字符串
        String num2 = tel.substring(9);
        // 4.前三位+****+后四位
        System.out.println(num1+"****"+num2);

    }
}
