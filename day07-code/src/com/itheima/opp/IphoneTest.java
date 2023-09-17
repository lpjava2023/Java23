package com.itheima.opp;

public class IphoneTest {
    public static void main(String[] args) {
        iphone l1 = new iphone();
        l1.brand = "小米";
        l1.color = "白色";
        l1.price = 4999;
        System.out.println(l1.price);
        System.out.println(l1.color);
        System.out.println(l1.brand);
        l1.call("张三");
        l1.sendMessage();
        System.out.println("------------------------------------");


        iphone l2 = new iphone();
        l2.brand = "华为";
        l2.color = "黑色";
        l2.price = 6999;
        System.out.println(l2.price);
        System.out.println(l2.color);
        System.out.println(l2.brand);
        l2.call("李四");
        l2.sendMessage();
    }
}
