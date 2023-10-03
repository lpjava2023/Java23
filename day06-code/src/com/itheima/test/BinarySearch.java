package com.itheima.test;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {11,22,33,44,55,66,77,88,99};

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数字:");
        int num = sc.nextInt();

        int index = binarySearch(arr,num);
        System.out.println(index);



    }

    private static int binarySearch(int[] arr, int num) {
        int start =0;
        int end = arr.length-1;
        while(start<=end){
            int mind=(start+end)/2;
            if(num>arr[mind]){
                start = mind+1;
            }else if(num<arr[mind]){
                end = mind-1;
            }else{
                return mind;
            }
        }
        return -1;
    }
}
