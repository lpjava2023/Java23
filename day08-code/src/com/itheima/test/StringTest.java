package com.itheima.test;
/*
    需求：模拟用户登录，一共三次机会，登陆之后要给出相应提示
    分析：1.定义两个个字符串类型变量，模拟已经存在的用户名和密码
         2.键盘录入用户输入的用户名，密码
         3.比对
 */

import java.util.Scanner;

public class StringTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //1.定义两个个字符串类型变量，模拟已经存在的用户名和密码
        String uername = "admin";
        String password = "123456";


        for (int i=1;i<=3;i++){

            //2.键盘录入用户输入的用户名，密码
            System.out.println("请输入你的用户名");
            String inputuername=sc.nextLine();

            System.out.println("请输入你的密码");
            String inputpassword=sc.nextLine();

            //3.比对
            if(uername.equals(inputuername) && password.equals(inputpassword)){
                System.out.println("登录成功");
                break;
            }
            else{
                if(i==3){
                    System.out.println("明天再试");
                    break;
                }
                System.out.println("输入错误，您还有"+(3-i)+"次机会");
            }
        }

    }
}
