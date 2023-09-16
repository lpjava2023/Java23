package com.itheima.arry;
/*
数组动态初始化:
    在初始化时，只需要指定其长度
    格式：
    数据类型[] 数组名 = new 数据类型[长度];

    默认值分类：
    整数：0
    小数： 0.0
    布尔： flase
    ---------------
    字符：‘\u0000’    ---->unicode ---->常见的体现是空字符
    引用数字类型：null
    引用数据类型:数组，类，接口
    String:类

    1.静态初始化：给出具体数字
    2.动态初始化：只明确元素个数

 */

public class ArrayDemo3 {
    public static void main(String[] args) {
        int[] arr= new int[3];
        for (int i=0;i<5;i++){
            System.out.println(arr[i]);
        }
    }
}
