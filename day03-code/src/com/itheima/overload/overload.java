package com.itheima.overload;
/*
特点：
同一个类中，方法名相同，参数不同的方法
参数不同：个数不同、类型不同、顺序不同
注意：只看方法名与参数，与返回值无关
 */

public class overload {
    public static void main(String[] args) {
        //方法重载
        menthod(10,20);
        menthod(20,20,30);

    }
    public static void menthod(int a,int b){

    }
    public static void menthod(int a,int b,int c){

    }
}
