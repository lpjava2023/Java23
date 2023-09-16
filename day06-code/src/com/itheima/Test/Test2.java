package com.itheima.Test;
/*
有这样一个数组，元素是{68,27,95,88,171,996,51,210}
求出该数组中满足要求的元素和
要求是，求和的元素的个位和十位都不是7，并且只能是偶数
 */

public class Test2 {
    public static void main(String[] args) {
        sum();

    }
    public static void sum(){
        int[] arr = {68,27,95,88,171,996,51,210};
        int sum =0;
        int i=0;
        int ge= arr[i] % 10;
        int  shi = arr[i]/10%10;
        for (i=0;i< arr.length;i++){
            if(ge !=7 && shi !=7 && arr[i]%2==0){
                System.out.println(arr[i]);
                sum+=arr[i];
            }
        }
        System.out.println(sum);
    }
}
