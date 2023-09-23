package com.itheima.mextends;

public class ExtendsDemo3 {
    /*
    方法重载(Overload):在同一个类中，方法名相同，参数不同，与返回值无关
                        参数不同:类型不同，个数不同，顺序不同

    方法重写(Override):在子父类中，出现了方法声明一模一样的方法(方法名，参数，返回值)
                    目标1:能够独立识别出，方法是不是重写的方法
                            -注解:@Override加了这个不报错则是方法重写
                    目标2:方法重写的使用场景
                            -当子类需要父类的方法，但是觉得父类的方法逻辑不好(修改|增强)就可以对父类的方法进行重写
    注意:
    1.私有方法不能重写
    2.子类重写父类方法时，访问权限必须大于等于父类

     */
    public static void main(String[] args) {
        Son son = new Son();
        son.method();

        son.love();
    }
}
class Father{

    public void method(){
        System.out.println("Father...method...");
    }

    public void love(){
        System.out.println("送肉");
        System.out.println("送花");
    }
}
class Son extends Father{

    @Override
    public void method() {
        System.out.println("Son...method...");
    }

    @Override
    public void love() {
        super.love();//保留上一方法
        System.out.println("送口红");
        System.out.println("送包");
    }
}