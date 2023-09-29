package com.itheima.lambda;

public class LambdaDemo2 {

    public static void main(String[] args) {
        useInter(new Inter() {
            @Override
            public void show1() {
                System.out.println("匿名内部类...show1..");
            }

            @Override
            public void show2() {
                System.out.println("匿名内部类...show2..");
            }
        });

        /*
        * lambda表达式，只允许操作函数式编程接口——有，且仅有一个抽象方法的接口
        * */
//        useInter(()->{});
    }

    public static void useInter(Inter A){
        A.show1();
        A.show2();
    }
}
//这个有两个抽象方法不可以用lambda
//@FunctionalInterface——可以判断是不是函数式编程接口
interface Inter{
    void show1();
    void show2();
}