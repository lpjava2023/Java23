package com.itheima.test1;

public class Test {
    public static void main(String[] args) {
        Coder c= new Coder("张三",23,15000);
        c.work();

        Manager m = new Manager("李四",24,18000,5000);
        m.work();
    }
}
