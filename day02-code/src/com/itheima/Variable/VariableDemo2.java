package com.itheima.Variable;

public class VariableDemo2 {
    /*
    变量的注意事项:
            1.变量名不允许重复定义
            2.一条语句，可以定义出多个变量，中间需要使用逗号分隔
            3.变量在使用之前，必须完成赋值
            4.TODO:变量的作用域
     */
    public static void main(String[] args) {
        int salary = 1200;
       //1.变量名不允许重复定义
        // 2.int salary = 15000;
        System.out.println(salary);

        //2.一条语句，可以定义出多个变量，中间需要使用逗号分隔
        int a =10,b=20,c=30;

        //3.变量在使用之前，必须完成赋值
//         int num;
//        System.out.println(num);
        int num = 10;
        System.out.println(num);
    }
}
