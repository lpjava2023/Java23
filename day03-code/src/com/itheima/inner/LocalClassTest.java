package com.itheima.inner;

public class LocalClassTest {
    /*
        局部内部类：放在方法、代码块、构造器中等执行体中
     */
    public static void main(String[] args) {
        A a = new A();
        a.show();
    }
}
class A{
    public void show(){
        class B{
            public void menthod(){
                System.out.println("menthod...");
            }
        }

        B b =new B();
        b.menthod();

    }
}