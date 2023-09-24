package com.itheima.minterface;

public class InterfaceTest1 {
    /*
        接口：体现的思想就是声明[规则]

        思路：如果发现一个类，所有的组成，都是抽象方法
                -没有成员变量
                -没有普通方法

                这种类，我们通常会设计为JAVA中的接口，因为现在这个类存在的唯一价值，就只是声明规则了

                -------------------------------------------
          接口的定义格式；
          interface 接口名 {
                抽象方法
          }

          注意：接口不能实例化

          接口与类之间是实现关系，通过implements关键字完成
          class 类名 implement 接口名 { }
          实现类(接口的子类)：
            1.重写所有抽象方法
            或2.将实现类变为抽象类
     */
    public static void main(String[] args) {
        inter1 s = new inter1();
        s.method();
        s.show();
    }
}
interface inter{
    public abstract void show();
    public abstract void method();
}
//1.重写所有抽象方法
class inter1 implements inter{

    @Override
    public void show() {
        System.out.println("show------");
    }

    @Override
    public void method() {
        System.out.println("method---");
    }
}
//2.将实现类变为抽象类
abstract class inter2 implements inter{
    public abstract void show();
    public abstract void method();
}