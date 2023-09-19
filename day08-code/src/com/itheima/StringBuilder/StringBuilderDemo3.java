package com.itheima.StringBuilder;
/*
      StringBuilder常用成员方法:
      1.pubilc StringBuilder append(任意类型):添加数据，并返回对象自己
 */

public class StringBuilderDemo3 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb1 = sb.append("红色");
        StringBuilder sb2 = sb.append("白色");


        System.out.println(sb);
        System.out.println(sb1);
        System.out.println(sb2);
        //输出结果：红色白色
                 //红色白色
                 //红色白色
        System.out.println(sb==sb1);
        System.out.println(sb2==sb1);
        //输出结果：true
                //true
    }
}
