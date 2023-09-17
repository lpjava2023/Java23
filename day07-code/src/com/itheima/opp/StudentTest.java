package com.itheima.opp;
/*
创建Student类的对象进行使用

        1.创建对象的格式:
        类名 对象名 = new 类名();

        2.使用对象成员变量的格式：
        对象名.成员变量

        3.使用对象成员方法的格式
        对象.成员方法();
        ----------------------------------
注意细节：
        1>
        打印对象名，可以看到对象的内存地址
        com.itheima.opp.Student@2f4d3709
        全类名：包名+类名
        
        
        
        2>


 */

public class StudentTest {
    public static void main(String[] args) {
        Student stu1 = new Student();
        stu1.age=26;
        stu1.name="张三";

        System.out.println(stu1);

        System.out.println(stu1.age);
        System.out.println(stu1.name);

        stu1.eat();
        stu1.study();
        System.out.println("----------------------------");

        Student stud2 = new Student();
        stud2.age=15;
        stud2.name="李四";

        System.out.println(stud2);

        System.out.println(stud2.age);
        System.out.println(stud2.name);

        stud2.eat();
        stud2.study();
        
    }
}
