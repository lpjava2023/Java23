package com.itheima.Test;
/*
设计一个方法，查找元素在数组中的索引位置
已知一个数组arr={19,28,37,46,50}；
键盘输入一个数，查找该数据在数组中的索引
并在控制台输出找到的索引值
若没有找得到输出-1；
 */

import java.util.Scanner;

public class Test4_1 {
    public static void main(String[] args) {
        int[] arr={19,28,37,46,50};
        int sort=find(arr);
        System.out.println(sort);
    }
//    public static int find(int[] arr){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入一个数：");
//        int n = sc.nextInt();
//        for (int i=0;i< arr.length;i++){
//        if (arr[i]==n){
//            return i;
//        }
//
//        }
//        return -1;
//    }

    public static int find(int[] arr){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数：");
        int n = sc.nextInt();
        int index = -1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==n){
                index=i;
                break;//此处用break，当找到所要的数时，就会直接返回，不会在执行后面的
            }
        }
        return index;
    }



}
