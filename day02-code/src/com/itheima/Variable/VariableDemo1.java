package com.itheima.Variable;

public class VariableDemo1 {
    /*
    变量介绍:内存中的存储空间，空间中记录着经常发生改变的数据
    变量的定义格式:
                数据类型 变量名 = 数据值;
                数据类型 : 整数 : int

     */
    public static void main(String[] args) {
        //从右向左看
        int salary =12000;
        //int salary =12000.1;
        System.out.println(salary);
        salary = 15000;
        System.out.println(salary);

        int age =18;
        System.out.println(age);

    }
}
