package com.itheima.StringBuilder;

public class StringBuilderDemo3_1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        StringBuilder sb1 = sb.append("红色");
        StringBuilder sb2 = sb1.append("白色");
        //代替上面的代码
        /*链式编程：调用的方法，返回的是结果对象(返回的还是原来的类型 )，就可以继续向下调用方法*/
        //例子1
        sb.append("红色").append("白色");
        System.out.println(sb);//红色白色红色白色
        System.out.println(sb2);//红色白色红色白色
        //例子2
        String  s = "itheima";
//        String s1 = s.substring(1);
//        String s2 = s1.substring(2);
        //代替上面的代码
        s.substring(1).substring(2);
    }
}
