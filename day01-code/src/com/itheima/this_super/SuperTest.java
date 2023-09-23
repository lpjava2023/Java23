package com.itheima.this_super;

public class SuperTest {
    /*
        super 调用父类成员的省略规则:
                super.父类成员变量 | super.父类成员方法()
                -->被调用的变量和方法，在子类中不存在，super.可以直接省略(本质上是this)
     */
    public static void main(String[] args) {
        Zi z = new Zi();
        z.menthod();
    }
}
class Fu{
    int num = 10;
    public void show(){
        System.out.println("Fu...show");
    }
}
class Zi extends Fu{



    public void menthod(){
//        System.out.println(super.num);
        /**子类本身也继承了父类的变量和方法*/
//        System.out.println(this.num);
        System.out.println(num);
//        super.show();
        /**子类本身也继承了父类的变量和方法*/
//        this.show();
        show();
    }
}
