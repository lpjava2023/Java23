package com.itheima.Test;
/*
判断两个数组是否相等
要求：长度，内容，顺序都相等
 */

public class Test3 {
    public static void main(String[] args) {
        int[] arr1={11,22,33};
        int[] arr2={11,22,33};
        boolean lp = xiangdeng(arr1,arr2);//方法输出的是true或者false，所以lp也应该为boolean型
        System.out.println(lp);

    }
    public static boolean xiangdeng(int[] arr1,int[] arr2){
        //1.判断长度是否相等
        if(arr1.length != arr2.length){
            return false;
        }
        //2.判断值是否相等
        for (int i=0;i< arr1.length;i++){
            if(arr1[i] != arr2[i]){    //若此处判断相等只要有一个相等就会输出相等
                return false;
            }
        }
        return true;

    }
}
