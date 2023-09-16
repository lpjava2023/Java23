package com.itheima.mif;
/*
for循环 和 while循环先判断再执行
do...while先执行再判断
区别：
for循环中，控制循环的变量，在for循环结束后，就不能再被访问了
while循环中，控制循环的变量，在while循环结束后，该变量还可以继续使用


 */

public class ForDemo {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {

        }
         // System.out.println(i);//这里会报错，因为此处的控制循环的变量，在for循环结束后，就不能再被访问了


        int i = 0;
        while (i < 4) {
            i++;
        }
        System.out.println(i);
    }
}
