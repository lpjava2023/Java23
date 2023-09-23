package com.itheima.mextends;
/**
 *  在子类中，出现重名的成员变量，会根据就近原则，优先使用子类的,想使用父类的，可以使用super
 *
 *  this:调用本类成员
 *  super:调用父类成员
 *
 *  子父类中，出现了方法声明一模一样的方法(方法名,参数,返回值)
 *          在创建子类对象，调用方法，会优先使用子类的方法逻辑
 *          这虽然是就近原则的现象，但其实是子类的方法，对父类的方法进行了重写
 *
 * 方法重写
 */
public class ExtendsDemo2 {
    public static void main(String[] args) {
        zi num = new zi();
        num.menthod();
        num.show();//zi---show
    }
}
class fu{
    int num = 10;
    public void show(){
        System.out.println("fu---show");
    }
}
class zi extends fu{
    int num = 20;
    public  void  menthod(){
        int num = 30;
        System.out.println(num);//30
        System.out.println(this.num);//20
        System.out.println(super.num);//10
    }
    public void show(){
        System.out.println("zi---show");
    }
}