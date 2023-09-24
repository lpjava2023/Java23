package com.itheima.mabstract;

public class AbstractTest2 {
    /*
        抽象类的注意事项:

            1.抽象类不能实例化
                -如果抽象类允许创造对象，就可以调用内部没有的方法体的，抽象方法了
            2.抽象类存在构造方法
                -交给子类,通过super进行访问,所有的构造方法都有默认的super(),若没有super()访问什么
            3.抽象类可以存在普通方法
                -可以让子类承认到继承使用
            4.抽象类的子类
                1)要么重写抽象类中所有抽象方法
                2)要么是将子类变为抽象类

         abstract 关键字的冲突

         1.final：被abstract修饰的方法，强制要求子类重写，被final修饰的方法子类不能重写
         2.private：被abstract修饰的方法，强制要求子类重写，被private修饰的方法子类不能重写
         3.static：被static修饰的方法可以类名调用，类名调用抽象方法没有意义
     */
    public static void main(String[] args) {
        /*1.抽象类不能实例化*/
//        Fu f = new Fu();
//        f.show();


         /*3.抽象类可以存在普通方法
                可以让子类承认到继承使用*/
        Zi z = new Zi();
        z.mentod();

    }
}
abstract class A{

    public abstract void showA();

}
//3.1要么是将子类变为抽象类
abstract class B extends A{

    @Override
    public void showA() {

    }

    public abstract void showB();

}

class C extends B{

    @Override
    public void showB() {

    }
}





abstract class Fu{
    /* 2.抽象类存在构造方法*/
    public Fu(){

    }

    public abstract void show();
    /*3.抽象类可以存在普通方法
               可以让子类承认到继承使用*/
    public void mentod(){
        System.out.println("menthod---");
    }

}
class Zi extends Fu{

    public Zi(){
        super();
    }

    @Override
    public void show() {

    }
}