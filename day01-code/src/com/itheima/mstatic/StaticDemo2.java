package com.itheima.mstatic;

public class StaticDemo2 {

    static int num1 = 10;

    int num2 =20;

    public static void menthod(){
        System.out.println("李鹏");
    }

    public void print(){
        System.out.println("李鹏");
    }

    public static void main(String[] args) {
        //在静态方法中，只能直接访问静态成员
        System.out.println(num1);
        menthod();

//        //报错
//        System.out.println(num2);
//        print();
    }



}
