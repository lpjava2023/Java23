package com.itheima.mif;
/*
if语句：适用于范围性的判断
switch：适用于固定值的匹配

switch注意事项：
        1.case 后面的值不允许重复
        2.case后面的值，只能是字面量，不能是变量
        3.switch()中可以接受的类型
                1>基本数据类型：byte short char int
                2>引用数据类型：jdk5版本开始可以枚举，jdk版本开始可以String字符串
                String num = '1';
                switch(num){
                case '1':
//                System.out.println("星期一");
//                break;
                case '2':
//                 System.out.println("星期二");
//                break;
 */


import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        kind();


    }

    public static void kind() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数字");
        int week = sc.nextInt();
//        switch(week){
//            case 1:
//                System.out.println("星期一");
//                break;
//            case 2:
//                System.out.println("星期二");
//                break;
//            case 3:
//                System.out.println("星期三");
//                break;
//            default:
//                System.out.println("输入错误");
//                break;
//        }




//        switch (week) {
//            case 1, 2, 3, 4, 5:
//                System.out.println("工作");
//                break;
//            case 6, 7:
//                System.out.println("休息");
//                break;
//            default:
//                System.out.println("输入错误");
//                break;
//        }


        switch (week){
            case 1,2,3,4,5->System.out.println("工作");
            case 6,7->System.out.println("休息");
            default ->System.out.println("输入错误");
        }


    }
}
