package com.itheima.test;
/*
    需求：创建一个存储字符的集合，内部存储3个字符串元素，使用程序在控制台遍历该集合
            钢门吹雪，西域狂鸭，张三，李四，王五
            使用程序实现在控制台遍历该集合，将四个字的人名打印在控制台

 */

import java.util.ArrayList;

public class ArrayListTest1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("钢门吹雪");
        list.add("西域狂鸭");
        list.add("张三");
        list.add("李四");
        list.add("王五");

        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            if(s.length()==4){
                System.out.println(s);
            }

        }

    }
}
