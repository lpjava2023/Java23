package com.itheima.String;
/*
        String类的切割方法：
            public String[] split(String regex):根据传入的字符作为规则，切割当前字符

        建议：先正常制定切割规则，后来发现没有得到自己要的效果，就可以尝试在前面加入"\\"
 */

public class StringMenthodDemo5 {
    public static void main(String[] args) {

        extracted();
        extracted1();


    }

    //        String s = "192.12.128";
//        String[] m = s.split(".");
//        System.out.println(m.length);//0
//        for(int i=0;i<m.length;i++){
//            System.out.println(m[i]);//无输出
//        }

    /*因为"."可以代表任意字符，所以要在前面加"\\"*/
    private static void extracted1() {
        String s = "192.12.128";
        String[] m = s.split("\\.");
        System.out.println(m.length);//3
        for(int i=0;i<m.length;i++){
            System.out.println(m[i]);//192   12  128
        }
    }


    private static void extracted() {
        String s = "192,12,128";
        String[] m = s.split(",");
        for(int i=0;i<m.length;i++){
            System.out.println(m[i]);
        }

    }
}
