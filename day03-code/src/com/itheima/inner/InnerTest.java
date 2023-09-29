package com.itheima.inner;

public class InnerTest {
    /*
        内部类：在类中定义类

        创建对象格式：外部类名.内部类名 对象名 = new 外部对象().new 内部对象();

        成员访问细节：
                1.内部类中，访问外部类成员 : 直接访问，包括私有
                2.外部类中，访问内部类成员 : 创建对象访问
     */
    public static void main(String[] args) {
        Outer.Inner s = new Outer().new Inner();
        System.out.println(s.num);
        s.show();

        System.out.println("----------------------------");

        MyOuter.MyInner k = new MyOuter().new MyInner();
        k.menthod();

    }
}

class MyOuter{
    int num =10;

    class MyInner{
        int num = 20;
        public void menthod(){
            int num = 30;
            System.out.println(num);
            System.out.println(this.num);
            System.out.println(MyOuter.this.num);
        }
    }
}






class Outer{

    private void menthod(){//虽然此处是私有类，但是在此类中所以可以调用
        System.out.println("menthod...");

        Inner i =new Inner();//只能在方法里面创建
        System.out.println(i.num);
    }



    class Inner{
        int num = 10;

        public void show(){
            System.out.println("show...");
            menthod();
        }

    }
}