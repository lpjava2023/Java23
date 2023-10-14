package com.itheima.hashset;

import com.itheima.domain.Student;

import java.util.HashSet;

public class HashSetDemo2 {
    /*
        HashSet集合存储自定义对象
     */
    public static void main(String[] args) {
        HashSet<Student> hs = new HashSet<>();
        hs.add(new Student("张三",23));
        hs.add(new Student("李四",23));
        hs.add(new Student("王五",23));
        hs.add(new Student("王五",23));
        System.out.println(hs);

    }
}
