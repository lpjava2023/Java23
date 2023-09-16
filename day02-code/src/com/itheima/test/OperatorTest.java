package com.itheima.test;

import java.util.Scanner;

public class OperatorTest {
    /*
    键盘录入一个数，拆分为个位，百位，十位，打印出来
        个位:数值%10
        十位:数值/10%10
        百位:数值/10/10%10
        千位:数值/10/10/10%10
        ........
        对于数值的最高位，简化处理
            123:百位              123/100     1
            1234:千位             1234/1000   1
            12345:万位            12345/10000 1
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个三位数");
        int num=sc.nextInt();
        int ge = num%10;
        int shi= num/10%10;
        int bai = num/10/10%10;
        System.out.println(num+"的各位是"+ge);
        System.out.println(num+"的十位是"+shi);
        System.out.println(num+"的百位是"+bai);


        //字符串拼接
        System.out.println("整数"+1+12);//整数112
        System.out.println("整数"+(1+23));//整数24


    }
}
