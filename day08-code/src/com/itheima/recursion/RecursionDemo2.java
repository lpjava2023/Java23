package com.itheima.recursion;

import java.util.Scanner;

public class RecursionDemo2 {
    /*
        使用递归求1~n的和
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数字");
        int num = sc.nextInt();
        System.out.println(jc(num));
    }
    public static int jc(int num){
        if(num==1){
            return 1;
        }else{
            return num+jc(num-1);
        }
    }
}
