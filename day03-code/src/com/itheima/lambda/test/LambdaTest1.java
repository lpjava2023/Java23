package com.itheima.lambda.test;

public class LambdaTest1 {
    /*
        Lambda的表达式省略写法

                只能用在函数式接口

            1.参数类型可以省略不写
            2.如果只有一个参数，参数类型可以省略，同时()也可以省略
            3.如果lambda表达式的方法体代码只有一行
                可以省略大括号不写，同时要省略分号
                此时，如果这行代码是return语句，必须省略return不写，同时也必须省略";",不写
     */
    public static void main(String[] args) {
        useShowHandler(new ShowHandler() {
            @Override
            public void show() {
                System.out.println("我是匿名内部类，重写后的show方法...");
            }
        });

        useShowHandler(()->System.out.println("我是匿名内部类，重写后的show方法..."));
    }

    public static void useShowHandler(ShowHandler A){
        A.show();

    }
}


interface ShowHandler{
    void show();
}