package com.itheima.Scanner;
//导包
import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //键盘输入名字
        System.out.println("请输入你的名字");
        String name = sc.next();
        //键盘输入年龄
        System.out.println("输入你的年龄");
        int age = sc.nextInt();
        //键盘输入性别
        System.out.println("输入性别");
        String gender = sc.next();
        //键盘输入身高
        System.out.println("输入身高");
        double height = sc.nextDouble();
        //键盘输入婚姻情
        System.out.println("输入婚姻情况");
        boolean flag = sc.nextBoolean();
        System.out.println("注册成功");


    }
}
