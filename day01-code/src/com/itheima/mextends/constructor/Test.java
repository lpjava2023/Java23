package com.itheima.mextends.constructor;

public class Test {
    /*
        除了Object类，在所有构造方法的第一行代码，都默认隐藏了一句话super();
        通过这句代码，访问父类的空参数构造方法

        细节:java当中的所有类，都直接或者间接的继承到了Object类
    */
    public static void main(String[] args) {

        Zi z1= new Zi();
        Zi z2 = new Zi(10);

        Demo d = new Demo();
        d.hashCode();
    }
}
class Demo{}

class Fu{
    public Fu(){
        //super()
        System.out.println("Fu类的空参构造方法");
    }
    public Fu(int num){
        //super()
        System.out.println("Fu类的带参构造方法");
    }
}
class Zi extends Fu{
    public Zi(){
        //super()
        System.out.println("Zi类的空参构造方法");
    }
    public Zi(int num){
        //super()
        System.out.println("Zi类的带参构造方法");
    }
}