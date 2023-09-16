package com.itheima.test;

public class TypeConversuinTest {
    /*
    面试题：是否存在错误
    byte b1 = 3;
    byte b2 = 4;
    byte b3 = b1+b2;
    错误原因：byte short char 三种数据在运算时，都会提升为int，再进行运算
    1.int b3 =b1+b2;
    2.byte b3 = (byte)(b1+b2);


     */
    public static void main(String[] args) {
        //Java存在常量优化机制：在编译的时候(javac)就会将3和4这两个字面量进行运算，产生的字节码文件：byte b = 7;
        byte b=3+4;
    }
}
