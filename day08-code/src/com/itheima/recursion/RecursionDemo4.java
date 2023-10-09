package com.itheima.recursion;

import java.util.Scanner;

public class RecursionDemo4 {
    /*
        猴子吃桃
        day10:1；
        day9:(1+1)*2;
        day8:(4+1)*2;
        day7:(10+1)*2;
        (后一天桃子数量+1)*2
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数字");
        int num = sc.nextInt();
        System.out.println(monkey(num));
    }
    public static int monkey(int num){
        if(num == 10){
            return 1;
        }else{
//            return monkey(day10桃子数量+ 1)*2;
//            ——num=9
            return ((monkey(num+1)) + 1) * 2;
        }
    }
}
