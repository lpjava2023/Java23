package com.itheima.Test;
/*
键盘录入三个值，求最大值
 */

import java.util.Scanner;

public class OperatorTest1 {
    public static void main(String[] args) {
        //1.录入三个值
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入三个数");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int temperMax = num1>num2?num1:num2;
        int Max = temperMax>num3?temperMax:num3;
        System.out.println(Max);

        //2.现在两个数之间找出一个最大值，再与另一个数比较，得出最大值
    }
}
