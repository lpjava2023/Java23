package com.itheima.recursion;

import java.util.Scanner;

public class RecursionDemo3 {
    /*
        斐波那契数——1,1,2,3,5,8,13,21.......
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数字");
        int num = sc.nextInt();
        System.out.println(get(num));
    }
    public static int get(int num){
        if (num == 1 || num == 2){
            return 1;
        }else{
            return get(num-1)+get(num-2);
        }
    }
}
