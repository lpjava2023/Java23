package com.itheima.opp;

public class BookTest {
    public static void main(String[] args) {
        book b1 = new book();
        b1.id="001";
        b1.name="三国";
        b1.price=88.88;
        b1.show();

        System.out.println("----------------");

        book b2 = new book();
        b2.id="002";
        b2.name="水浒";
        b2.price=88.88;
        b2.show();

        System.out.println("----------------");

        book b3 = new book();
        b3.id="003";
        b3.name="富婆通讯录";
        b3.price=10000;
        b3.show();
    }
}
