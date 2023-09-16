package com.itheima.operator;
/*
短路逻辑运算：
        &&：左边为false，右边不执行
            左边为true，右边执行
        ||:左边为true，右边就不执行
           左边为false，右边执行
 */

public class OperatorDemo4 {
    public static void main(String[] args) {
//        int x = 3;
//        int y = 4;
//        boolean result = ++x >5 & y--<4;
//        System.out.println(x);//4
//        System.out.println(y);//3
//        System.out.println(result);//false

        int x = 3;
        int y = 4;
        boolean result = ++x >5 && y--<4;
        System.out.println(x);//4
        System.out.println(y);//4
        System.out.println(result);//false
    }
}
