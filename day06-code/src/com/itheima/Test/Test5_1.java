package com.itheima.Test;
/*
异或：
1.相同为false，不同为true
2.一个数字，被另一个数字异或两次，该数本身不变
10^5=15
0000 1010
0000 0101
-----------
0000 1111
 */




public class Test5_1 {
    public static void main(String[] args) {
        System.out.println(10^5);
        System.out.println(10^5^5);
        System.out.println(10^5^10);

        /*
        实现两个数的数据交换，不允许用第三个变量
         */
        int a=20;
        int b=10;
        a=a^b;//    a=10^20
        b=a^b;//    b=10^20^10  b=10
        a=a^b;//    a=10^20^10  a=20
        System.out.println("a="+a);
        System.out.println("b="+b);


    }

}
