package com.itheima.String;
/*
    String类的替换方法：

        public String replace(CharSequence target, Char Sequence replacement):
                                  参数一：旧值             参数二：新值
                    注意点：返回值才是替换之后的结果
 */

public class StringMenthodDemo4 {
    public static void main(String[] args) {
        String s = "itheima";
        String result = s.replace("heima","baima");
        System.out.println(result);
    }
}
