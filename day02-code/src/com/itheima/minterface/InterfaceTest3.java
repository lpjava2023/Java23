package com.itheima.minterface;

public class InterfaceTest3 {
    /*
        接口和类之间的各种关系:
            1.类和类之间:继承关系，只支持单继承，不支持多继承，但是可以多层继承
            2.类和接口之间:实现关系,可以单实现，也可以多实现，甚至可以在继承一个类的同时实现多个接口
            3.接口和接口的关系:继承关系,可以单继承，也可多继承
     */
    public static void main(String[] args) {
        AB c = new AB();
        c.menthod();
    }
}

class Fu{
    public void menthod(){
        System.out.println("Fu...menthod");
    }
}

interface A{
//    void showA();
    void  menthod();
}

interface B{
//    void showB();
    void menthod();
}
/*2.类和接口之间:实现关系,可以单实现，也可以多实现*/
class AB implements A,B{

//    @Override
//    public void showA() {
//
//    }

    @Override
    public void menthod() {
        System.out.println("好好学习");
    }

//    @Override
//    public void showB() {
//
//    }
}

/* 2.甚至可以在继承一个类的同时实现多个接口*/
class Zi extends Fu implements A,B{
    //已经将Fu已经将A，Bmenthod()重写
//    public void menthod(){
//        System.out.println("Fu...menthod");
//    }
}

/*3.接口和接口的关系:继承关系,可以单继承，也可多继承*/
interface a{
    void show();
}

interface b{
    void show();
}

interface c extends a,b{
    void show();
}
class d implements c {

    //不冲突，都是抽象方法，没有逻辑何来冲突
    @Override
    public void show() {

    }

}

