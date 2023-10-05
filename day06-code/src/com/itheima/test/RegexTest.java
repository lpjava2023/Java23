package com.itheima.test;

public class RegexTest {
    /*
        1. QQ号正则
                不能以0开头
                全部都是数字
                5~12位
        2. 手机号正则
                必须是1开头
                第二位:  3 4 5 6 7 8 9
                全都是数字, 必须是11位
        3. 邮箱正则
                zhangSan@itcast.cn
                zhangsan@163.com
                123456@qq.com
                zhangsan@sina.com
                zhangsan@itcast.qq.com
                zhangsan@xxx.edu
                zhangsan@xxx.org
     */
    public static void main(String[] args) {

        String qq = "[1-9]\\d{4,11}";
        System.out.println("2095842".matches(qq));

        String tel ="[1][3-9]\\d{9}";
        System.out.println("13889214239".matches(tel));

        String email ="\\w+[@][\\w&&[^_]]+(\\.[a-z]{2,3})+";
        System.out.println("zhangSan@itcast.cn".matches(email));
        System.out.println("zhangSan@itcast".matches(email));
        System.out.println("zhangSanitcast.cn".matches(email));
        System.out.println("zhangsan@itcast.qq.com".matches(email));
    }
}