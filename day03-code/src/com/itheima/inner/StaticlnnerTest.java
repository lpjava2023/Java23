package com.itheima.inner;

public class StaticlnnerTest {
    /*
        静态内部类：static 修饰的成员的内部类

        创建对象格式：外部类名.内部类名 对象名 = new 外部类名.内部类();

        注意事项：静态只能直接访问静态

     */
    public static void main(String[] args) {

        OuterClass.InnerClass l =new OuterClass.InnerClass();
        l.show();//非静态

        OuterClass.InnerClass.show1();//静态
    }
}
class OuterClass{

    int num1 = 10;
    static int num2 = 20;

    static class InnerClass{

        public void show(){//非静态
            System.out.println("show...");

            OuterClass p = new OuterClass();
            System.out.println(p.num1);//非静态不能直接访问，需要创建对象，才可以调用num1

            System.out.println(num2);//可以直接访问

        }

        public static void show1(){//静态
            System.out.println("show1...");
        }
    }
}