package com.itheima.mextends;
/**
创建类的细节:
一个.java文件中可以编写多个class
 1.保证类与类之间是平级关系
 2.只有一个被public修饰一个类前面用public修饰，那么类名和文件名必须一致)
 */
public class ExtendsDemo {
    /*
    *继承:
    *
    *什么时间使用继承：当类与类之间，存在相同(共性)的内容，并产生is a 的关系，就可以考虑，来优化代码
    *
    * 继承:类与类之间产生关系(子父类关系)，子类就可以直接使用父类中的，非私有成员
    *
    * 好处:代码变少了
    *
    * */
    public static void main(String[] args) {
        Coder c= new Coder();
//        c.age=12;
//        c.name="lp";
//        c.salary=12000;
        c.setAge(12);
        c.setName("lp");
        c.setSalary(12000);
        System.out.println(c.getAge()+"----"+c.getSalary()+"-----"+c.getName());
    }
}



class Employee{
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    private double salary;

}


class Coder extends Employee{

}


class Manager extends Employee{

}