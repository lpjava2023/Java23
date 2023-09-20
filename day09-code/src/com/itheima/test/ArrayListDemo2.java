package com.itheima.test;
/*
    需求:创建一个存储学生对象的集合，存储3个学生对象
            在控制台，展示出年龄低于18岁的学生信息
 */

import java.util.ArrayList;

public class ArrayListDemo2 {
    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<>();

        Student stu1 = new Student("张三",25);
        Student stu2 = new Student("李四",14);
        Student stu3 = new Student("王五",15);

        list.add(stu1);
        list.add(stu2);
        list.add(stu3);

        for(int i=0;i<list.size();i++){
            Student stu = list.get(i);
            if(stu.getAge()<18){
                System.out.println(stu.getName()+"----"+stu.getAge());
            }

        }

    }
}
