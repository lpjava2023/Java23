package com.itheima.Test;

public class Test5 {
    public static void main(String[] args) {
        //交换数据，用第三个变量
        int a=10;
        int b=20;

        int c=a;
        a=b;
        b=c;
        System.out.println(a);//20
        System.out.println(b);//10

    }
}
