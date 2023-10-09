package com.itheima.recursion;

import java.util.Scanner;

public class RecursionDemo1 {
    /*
        递归介绍：方法直接或者间接调用本身
        递归必须要有出口
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数字");
        int num = sc.nextInt();
        System.out.println(jc(num));
    }
    public static int jc(int num){
        if(num==1){
            return 1;//出口
        }else{
            return num*jc(num-1);
        }
    }
}
