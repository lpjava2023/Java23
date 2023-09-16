package com.itheima.operator;
/*
三元运算符
 */

public class OperatorDemo2 {
    public static void main(String[] args) {
        //就两个数中的最大值
        int num1=12;
        int num2=20;
        //为真执行num1,/为假值行num2
        int max=num1>num2?num1:num2;
        System.out.println(max);

    }
}
