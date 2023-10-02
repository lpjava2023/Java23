package com.itheima.math;

public class MathDemo {
    /*
        Math是工具类，方法用static修饰，构造方法用private修饰
     */
    public static void main(String[] args) {

        //获取绝对值  整数小数都可以
        System.out.println(Math.abs(-123));     //123
        System.out.println(Math.abs(-12.3));    //12.3

        System.out.println("---------------------");

        //向上取整
        System.out.println(Math.ceil(12.0));    //12
        System.out.println(Math.ceil(12.1));    //13
        System.out.println(Math.ceil(12.2));    //13
        System.out.println(Math.ceil(12.6));    //13

        System.out.println("---------------------");

        //向下取整
        System.out.println(Math.floor(12.0));    //12
        System.out.println(Math.floor(12.1));    //12
        System.out.println(Math.floor(12.2));    //12
        System.out.println(Math.floor(12.6));    //12

        System.out.println("---------------------");

        //四舍五入
        System.out.println(Math.round(3.4));    //3
        System.out.println(Math.round(3.6));    //4

        System.out.println("---------------------");

        //返回最大值
        System.out.println(Math.max(1, 2));     //2

        System.out.println("---------------------");

        //返回最小值
        System.out.println(Math.min(1, 2));     //1

        System.out.println("---------------------");

        //返回a的b次幂——double型
        System.out.println(Math.pow(2, 3));     //8.0

        //返回最大值
        System.out.println(Math.max(1, 2));     //2

        System.out.println("---------------------");

        //返回随机数[0.0-1.0)
        System.out.println(Math.random());
    }
}
