package com.itheima.Test;


import com.itheima.mif.Switch;

import java.util.Scanner;

public class ControllDemo {
    public static void main(String[] args) {
        intMenu();


    }

    public static void intMenu() {
        Scanner sc = new Scanner(System.in);

        lo:
        while (true) {

            System.out.println("请输入一个数: 1.添加学生 2.删除学生 3.退出");
            int input = sc.nextInt();
            switch (input) {
                case 1:
                    System.out.println("添加学生");
                    break;
                case 2:
                    System.out.println("删除学生");
                    break;
                case 3:
                    System.out.println("退出");
                    break lo;
                default:
                    System.out.println("输出错误");
                    break;
            }
        }


    }


}
