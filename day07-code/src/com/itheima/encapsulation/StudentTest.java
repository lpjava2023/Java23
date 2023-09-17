package com.itheima.encapsulation;
/*
封装的设计规范:合理隐藏，合理暴露
 */

public class StudentTest {
    public static void main(String[] args) {
        Student sc = new Student();
        sc.setAge(600);
        System.out.println("年龄为："+sc.getAge());
    }

}
