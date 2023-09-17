package com.itheima.Test;

import java.util.Random;

/*
从数组中随机取出一个数
    根据数组的长度，产生一个随机数，拿着这个随机数，当做缩印去数组中获取元素
 */
public class Test7 {
    public static void main(String[] args) {
        String[] arr = {"米饭","馒头","包子","麻花"};
                        //0      1     2      3
        Random r =new Random();
        int i = r.nextInt(arr.length);      //0 1 2 3
        System.out.println(i);
        System.out.println(arr[i]);

    }

}
