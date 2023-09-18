package com.itheima.encapsulation;
/*
        1.私有变量(为了保护数据的安全性)

        2.针对私有的成员变量，提供对应的setXxx和getXxx方法
 */

public class Student {
    private int age;

    public void setAge(int age){
        if(age>=0 && age<=120){
            this.age=age;
        }
        else{
            System.out.println("输入错误，请重新输入0-120的数：");
        }
    }
    public int getAge(){
        return this.age;
    }
}
