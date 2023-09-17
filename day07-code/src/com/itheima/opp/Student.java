package com.itheima.opp;
/*
前提须知：Java当中想要创建对象。必须先有类的存在

类：一组相关属性和行为的集合，将其看做是对象的设计图纸
对象：是根据设计图(class),创建出来的实体

类和对象的关系：
        1>依赖关系：需要根据类，创建对象
        2>数量关系：根据一个类，可以创建出多个对象

类的组成：
       类的本质：就是对事物进行描述

       属性：在代码中使用成员变量表示，成员变量跟之前定义变量的格式一样，只不过是位置发生了变化，类中方法外

       行为：在代码中使用成员方法表示，成员方法跟之前定义方法一样，只不过需要去除static关键字
 */

public class Student {
    //属性
    String name;
    int age;

    //行为
    public void study(){
        System.out.println("学生学习");
    }
    public void eat(){
        System.out.println("学生吃饭");
    }

}
