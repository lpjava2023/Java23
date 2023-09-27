package com.itheima.minterface;

import com.itheima.a.Inte;

public class InterfaceTest2 {
    /*
        接口的特点：
                1.成员变量：只能定义常量，因为系统会默认加入三个关键字
                                        public static final-无顺序

                2.成员方法：只能是抽象方法，因为系统会默认加入两个关键字
                                        public abstract


                3.构造方法:没有
     */
    public static void main(String[] args) {
        System.out.println(MyInter.NUM);//被static修饰
//        MyInter.num=20;//添加了final
        System.out.println(Inte.num);
    }
}
interface MyInter{
    //public final static int num =10;
    int NUM = 10;
    //public abstract void show();
    void mentod();

}
