package com.itheima.domain;
/*
JavaBean:只负责数据的存取
1.成员变量私有化
2.空参，带参构造方法
3.对于私有的成员变量，提供对应的getXxx和setXxx方法
 */

public class Student {
    //1.成员变量私有化
    private String name;
    private int age;

    //2.空参，带参构造方法
    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //3.对于私有的成员变量，提供对应的getXxx和setXxx方法
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
        //return this.name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
        //return this.age;
    }
}




