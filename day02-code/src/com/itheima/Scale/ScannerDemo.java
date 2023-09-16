package com.itheima.Scale;

import java.util.Scanner;

public class ScannerDemo {
    /*
    Scanner键盘录入三模式
    1.找符咒
           代码:import java.util.Scanner;
           位置:class的上面
           含义:能够让自己的类ScannerDemo,从代码仓库中，找到Scanner符咒
    2.召唤精灵
           代码:Scanner sc = new Scanner(System.in);
           位置:main方法里面
           含义:从符咒中召唤精灵，名字叫
    3.指挥精灵干活
           代码：
            int age = sc.nextInt();
            double height = sc.nextDouble();
            boolean flag = sc.nextBoolean();
            String name = sc.next();
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age =sc.nextInt();
        System.out.println(age);

    }
}
