package com.itheima.mthis;

public class Student {
    String name;
    public void sayHello(String name){
        System.out.println(name);
        System.out.println(this.name);
        this.method();//或者method
    }
    public void method(){
        System.out.println(name);
        System.out.println("method.....");
    }
    public void print(){
        System.out.println("print方法中打印this关键字--->"+this);
    }
}
