package com.itheima.Test;
/*
设计一个方法，查找元素在数组中的索引位置(考虑重复元素)
return只返回一个元素

问题：当一个方法运行结束后，有多个结果需要返回时，怎样处理？
回答：可以将多个结果，存入一个数组中，将数组返回
 */

import java.util.Scanner;

public class Test4_2 {
    public static void main(String[] args) {
        int[] arr={19,20,19,30,40,19};

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数：");
        int n= sc.nextInt();

        int[] lp= find(n,arr);
        if(lp.length==0){
            System.out.println("无查找的元素");
        }else{
            for(int i=0;i< lp.length;i++){
                System.out.println(lp[i]);
            }
        }

    }
    public static int[] find(int n,int[] arr) {
        //1.统计要查找的元素出现的个数
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                count++;
            }
        }
        //2.根据统计的个数，创造出数组
        int[] arr1 = new int[count];
        int index = 0;

        //3.查找元素索引，将找到的索引，存入数组中
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                arr1[index] = i;
                index++;
            }
        }
        //4.返回数组
        return arr1;

    }
}
