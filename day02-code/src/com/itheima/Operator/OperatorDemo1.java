package com.itheima.Operator;

import java.sql.SQLOutput;

public class OperatorDemo1 {
    /*
    算术运算符：
         +
         -
         *
         /:整数相除，结果只能整数，想要得到带有小数的结果，需要有小数参加运算
         %：取模，作用是用来取余数;目前可以用来判断奇偶数(任意一个数%2==0为偶数，否则为0)
     */
    public static void main(String[] args) {
        System.out.println(5 / 2);
        System.out.println(5.0 / 2);
        System.out.println(5.0 / 2.0);
        System.out.println(5 / 2.0);
        System.out.println("----------------------");
        System.out.println(5 % 2);
        System.out.println(4 % 2);
    }
}
