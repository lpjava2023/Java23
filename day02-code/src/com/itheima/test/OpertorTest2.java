package com.itheima.test;

public class OpertorTest2 {
    /*
    看程序说结果
     */
    public static void main(String[] args) {
        int x =10 ;
        int y = x++;
        int z = ++y;
        System.out.println("x="+x);//11
        System.out.println("y="+y);//11
        System.out.println("z="+z);//11

        System.out.println("-------------------------------");

        int a = 3;
                //4+   4   +5*10
        int b = (++a)+(a++)+(a*10);
        System.out.println("a="+a);//5
        System.out.println("b="+b);//58
    }
}
