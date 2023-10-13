package com.itheima.set;

import com.itheima.domain.Student;

import java.util.TreeSet;

public class TreeSetDemo2 {
    /*
            TreeSet集合存储Student学生对象

            compareTO:
            0:集合中只有第一个；
            1：正序排序
            2.倒序排序
     */
    public static void main(String[] args) {
        TreeSet<Student> sc = new TreeSet<>();

        sc.add(new Student("王五",25));
        sc.add(new Student("王五",25));
        sc.add(new Student("王五",25));
        sc.add(new Student("王五",25));

        System.out.println(sc);
    }
}
