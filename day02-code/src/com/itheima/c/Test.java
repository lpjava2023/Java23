package com.itheima.c;//建包语句必须在第一行，一般IDEA工具会帮助创建


import com.itheima.a.Student;
/*
    导包
        相同的包下的类可以直接访问，不同包下的类必须导包，才可以使用！导包格式:import包名.类名;
        假如一个类中需要用到不同类，而至两个类的名称是一样的，那么默认只能导入一个类，另外一个类要带包访问
 */

public class Test {

    public static void main(String[] args) {
        Student stu1 = new Student();
        stu1.eat();

        //使用全类名创建对象：包名+类名
        com.itheima.b.Student stu2 = new com.itheima.b.Student();
        stu2.sleep();
    }
}
