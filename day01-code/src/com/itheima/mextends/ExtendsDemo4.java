package com.itheima.mextends;
/*
Java支持单继承,不支持多继承,但支持多层继承
 */

public class ExtendsDemo4 {
    public static void main(String[] args) {
        C c = new C();
        c.menthodC();
        c.menthodB();
        c.menthodA();
    }
}
class A{
    public void menthodA(){
        System.out.println("A...");
    }
}
class B extends A{
    public void menthodB(){
        System.out.println("B...");
    }
}
class C extends B{
    public void menthodC(){
        System.out.println("C...");
    }
}