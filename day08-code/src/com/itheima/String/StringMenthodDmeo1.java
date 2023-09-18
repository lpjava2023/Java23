package com.itheima.String;
/*
        String类中用于比较的方法：
        public boolean equals(object anobject)将此字符串与指定的对象比较
        public boolean equalsIgnoreCase(String anotherString)将此String与另一个String比较，不考虑大小写
 */

public class StringMenthodDmeo1 {
    public static void main(String[] args) {

        String s1 = "abc";
        String s2 = new String("abc");
        System.out.println(s1==s2);//false
        System.out.println(s1.equals(s2));//true

        System.out.println("---------------------");

        String s3 = "ABC";
        System.out.println(s1.equalsIgnoreCase(s2));//true
    }

}
