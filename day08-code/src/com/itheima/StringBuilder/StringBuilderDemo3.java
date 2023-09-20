package com.itheima.StringBuilder;
/*
      StringBuilder常用成员方法:
      1.pubilc StringBuilder append(任意类型):添加数据，并返回对象自己
      2.public StringBuilder reverse():将缓冲区的内容，进行反转
      3.public int length(): 返回长度
      4.public String toString():将缓冲区的内容，以String字符串类型返回
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

//2
        sb.reverse();
        System.out.println(sb);

//3
        sb.length();
        System.out.println(sb.length());
//4
        //情况:数据在StringBuilder中，当我要调用，StringBuilder中没有，但是String中有
        //解决办法：转化为String，再调用
        String s =sb.toString();
        System.out.println(s);
    }
}
