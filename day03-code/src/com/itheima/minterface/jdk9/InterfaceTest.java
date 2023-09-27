package com.itheima.minterface.jdk9;

public class InterfaceTest {
    public static void main(String[] args) {


    }
}
interface Inter{
    void show();
    void print();

    public default void start(){
        System.out.println("start方法执行..");
//        System.out.println("日志执行");
        log();
    }
    public default void end(){
        System.out.println("end方法执行...");
//        System.out.println("日志执行");
        log();
    }
    private void log(){
        System.out.println("日志执行");
    }
}