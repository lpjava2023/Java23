package com.itheima.minterface.jdk8;

public class InterfaceTest {
    /*
    JDK8版本接口特性
        1.允许定义非抽象方法，需要加入default关键字
                -作用：解决接口的升级问题
                -注意事项：
                        1.public可以省略，但是default不能省略
                        2.默认方法，实现类是允许重写
                        3.如果实现了多个接口，多个接口中存在相同的默认方法，实现类必须重写默认方法

        2.允许定义静态方法
            -理解：既然接口已经允许方法带有方法体了，干脆也放开静态方法，可以类名调用
            注意事项：
                    1.public可以省略，但是static不能省略
                    2.接口中的静态，只允许接口名进行调用，不允许实现类通过对象调用
     */
    public static void main(String[] args) {
        AInterImpl a = new AInterImpl();
        a.menthod();
//        a.function();//只允许接口名进行调用，不允许实现类通过对象调用
        A.function();
    }
}

interface A{
    default void menthod(){
        System.out.println("A...menthod");
    }
    static void function(){
        System.out.println("A....static...function");
    }
}

interface Inter{
    void show();
    void print();
    default void menthod(){
        System.out.println("Inter...menthod");
    }
}
class AInterImpl implements Inter,A{

    @Override
    public void show() {
        System.out.println("AInterImpl...show");
    }


    @Override
    public void print() {
        System.out.println("AInterImpl...print");
    }


//    @Override
//    public void menthod() {
//        //super.menthod();这里调用的是亲爹object
//        Inter.super.menthod();//此处是干爹（每一个构造方法都会默认调用父类构造方法）
//    }

    @Override
    public void menthod() {
        Inter.super.menthod();
        A.super.menthod();
    }
}

class B implements Inter{

    @Override
    public void show() {
        System.out.println("BInterImpl...show");
    }

    @Override
    public void print() {
        System.out.println("BInterImpl...print");
    }
}