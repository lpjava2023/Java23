package com.itheima.operator;
/*
扩展赋值运算符 （自带强转类型转换）
    +=、-=、/=、%=
 */

public class OperatorDemo1 {
    public static void main(String[] args) {
        int num=10;
        num +=10;
        System.out.println(num);//30


        double b = 12.3;
        int a = 10;
        a +=b; //a=(int)(a+b)自带强转效果
        System.out.println(a);
    }
}
