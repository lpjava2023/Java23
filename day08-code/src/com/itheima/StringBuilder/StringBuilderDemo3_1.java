package com.itheima.StringBuilder;

public class StringBuilderDemo3_1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        StringBuilder sb1 = sb.append("红色");
        StringBuilder sb2 = sb1.append("白色");
        //代替上面的代码
        sb.append("红色").append("白色");
        System.out.println(sb);//红色白色红色白色
        System.out.println(sb2);//红色白色红色白色
    }
}
