package com.itheima.operator;

/*
逻辑运算符
        1.用于连接boolean类型的表达式，或者是值
        2.整合多个条件，为一段整体的逻辑
        &逻辑与{范围性判断查询，比如查一个数是否在90~100之间}
        |或{多个条件符合一个即可}
        !非{对一段逻辑体取反操作}
        ^异或
 */
public class OperatorDemo {
    public static void main(String[] args) {
        System.out.println(true & true);
        System.out.println(true & false);
        System.out.println(false & false);

    }

}
