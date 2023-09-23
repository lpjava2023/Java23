package com.itheima.this_super;
/*
    this:代表本类对象的引用
    super:代表父类存储空间的标识
    this(),super()都在争夺构造方法的第一行，二者不能共存
 */

public class Test {
    /*
        开闭原则:对功能扩展做开放，对修改代码做关闭
     */
    public static void main(String[] args) {
        A a1 = new A(10,11,12);
        A a2 = new A(12,13,14);

        A a3 = new A(10,11,22,33);

    }
}
/*
    项目Version1.0版本:有3个成员变量
    项目Version2.0版本:新增一个成员变量
 */
class A{
    int a;
    int b;
    int c;
    //新增一个变量
    int d;

    public A() {
    }

    public A(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public A(int a, int b, int c, int d) {
//        this.a = a;
//        this.b = b;
//        this.c = c;

        /*this(),super()都在争夺构造方法的第一行，二者不能共存*/
//        super();
        this(a,b,c);
        this.d = d;
    }
}