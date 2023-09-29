package com.itheima.lambda;

public class LambdaDemo1 {
    /*
        lambda表达式：jdk开始后的一种新语法形式

            作用：简化匿名内部类的代码写法
            格式：()->{}
                ():匿名内部类被重写方法的形参列表
                {}:被重写方法的方法代码
     */
    public static void main(String[] args) {

        useInterA(new InterA() {
            @Override
            public void show() {
                System.out.println("匿名...show..");
            }
        });

        useInterA(() ->{System.out.println("lambda...show..");});
    }
    public static void useInterA(InterA a){
        a.show();
    }
}

interface InterA{
    void show();
}