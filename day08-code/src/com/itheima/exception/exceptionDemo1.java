package com.itheima.exception;

public class exceptionDemo1 {
    /*
        异常介绍
            指的是程序在编译或执行过程中，出现的非正常情况(错误)
            注意：语法错误，不是异常
            从下向上看;

            Throwable：
                Error：严重级别问题，通常跟系统有关
                Exception：异常类，程序常见的错误
                    Exception分类：
                        编译时异常，运行时异常
                        编译时异常：没有继承RuntimeExcpetion的异常,编译阶段就会出错
                        运行时异常：继承自RuntimeExcpetion的异常或子类，编译阶段不报错，运行可能报错


     */
    public static void main(String[] args) {
     int n=5;
        System.out.println(n+=4);
    }
}
