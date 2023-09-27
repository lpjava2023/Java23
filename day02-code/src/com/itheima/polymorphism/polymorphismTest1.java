package com.itheima.polymorphism;

public class polymorphismTest1 {
    /*
    多态好处：提高了程序的扩展型
    多态的弊端：不能使用子类特有的成员


    多态的前提:
            有继承/实现关系
            有方法重写
            有父类引用指向子类对象
          1.对象多态
                  Animal a = new Dog();
                  Animal b = new Cat();
                  好处：方法的形参定义为父类类型，这个方法就可以接受到父类任意子类对象
          2.行为多态
                    好处：同一个方法，具有多种不同的表现形式，或形态的能力
     */
    public static void main(String[] args) {
        //有父类引用指向子类对象
//        Animal a = new Dog();
//        Animal b = new Cat();


//        useDog(new Dog());
//        useCat(new Cat());
        useAnimal(new Cat());
        useAnimal(new Dog());

    }

    public static void useAnimal(Animal A){         //Animal  a = new Dog();
                  A.eat();                                  //Animal  a = new Cat();

    }

//    public static void useDog(Dog d){
//
//    }
//    public static void useCat(Cat a){
//
//    }






}
abstract class Animal{
    public abstract void eat();
}

class Dog extends Animal{

    @Override
    public void eat() {
        System.out.println("狗吃肉");
    }
}

class Cat extends Animal{

    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }
}