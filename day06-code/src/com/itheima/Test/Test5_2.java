package com.itheima.Test;
/*
        交换前int[] arr={11,22,33,44,55}
        交换后int[] arr={55,44,33,22,11}
        1.确定好谁和谁交换
                第一个数和倒数第一个数：arr[0] arr[arr.length-1-0]
                第一个数和倒数第一个数：arr[1] arr[arr.length-1-1]
                第一个数和倒数第一个数：arr[2] arr[arr.length-1-2]
                ............
                arr[i] arr[arr.length-1-i]

                循环次数
                五个数交换二次   i<arr.length/2
                六个数交换三次   i<arr.length/2

        2.定义三方变量，套入公式
 */

public class Test5_2 {
    public static void main(String[] args) {
        int[] arr={11,22,33,44,55};
        reverseArray1(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    private static void reverseArray1(int[] arr) {
        for (int i = 0; i< arr.length/2; i++){
            int temp= arr[i];
            arr[i]= arr[arr.length-1-i];
            arr[arr.length-1-i]=temp;
        }
    }
}
