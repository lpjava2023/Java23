package com.itheima.test1;

public class Coder extends Employee{
    public Coder() {
    }

    public Coder(String name, int age, double salary) {
        super(name, age, salary);
    }
    public void work(){
        System.out.println("姓名为"+super.getName()+",年龄为"+super.getAge()+",工资为"+super.getSalary()+"的程序员正在编写代码");
    }
}
