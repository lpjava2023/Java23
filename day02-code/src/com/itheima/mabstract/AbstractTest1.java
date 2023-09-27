package com.itheima.mabstract;

public class AbstractTest1 {
    /*
        抽象类:特殊的父类
        继承了抽象类，必须重写抽象类中的方法
        如果一个类中存在抽象方法，那么该类就必须声明为抽象类

        问题:特殊在哪里呢
        回答：内部允许编写抽象方法

        问题:什么是抽象方法？
        回答:当我们将共性的方法,抽取到父类之后,发现这个方法在父类中无法给出具体明确(描述不清了)
                而且这个方法,还是子类必须要有的方法，就可以设计为抽象方法

     */
}
 abstract class  Animal{
    public abstract  void eat();
    //{
//        System.out.println();//描述不清是谁要吃,给方法加抽象，方法为抽象，抽象方法必须在抽象类中，所以类也为抽象方法
    //}
}

//继承了抽象类，必须重写抽象类中的方法
class Cat extends Animal{
    @Override
    public void eat() {
        System.out.println("猫吃鱼");

    }
}

class Dog extends Animal{

    @Override
    public void eat() {
        System.out.println("狗吃肉");
    }
}