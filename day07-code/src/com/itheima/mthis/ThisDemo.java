package com.itheima.mthis;
/*
    this关键字的作用：
        this可以调用本类成员(变量，方法)

         this.本类成员变量
         this.本类成员变量();

         this.省略规则：
         本类成员方法:没有前提条件，this可以直接省略
         本类成员变量:方法中没有出现重名的变量，this才可以省略
         -----------------------------------------

         this介绍:代表当前类对象的引用(地址)
            --谁来调用我，我就代表谁
            --哪一个对象调用方法，方法中的this，代表的就是那一个对象
          stu1.printf()---->this---->stu1的地址
          stu2.printf()---->this---->stu2的地址
 */

public class ThisDemo {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.name = "钢门吹雪";
        stu.sayHello("西域狂鸭");

        System.out.println(stu);
        stu.print();

    }
}
