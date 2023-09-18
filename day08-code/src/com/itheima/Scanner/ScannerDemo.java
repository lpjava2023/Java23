package com.itheima.Scanner;
/*
        Scanner键盘录入字符串：
            String next(): 遇到空格，或者tab键就不在录入了
            String nextLine():以回车作为录入的结束标志

            弊端:
                1.next():数据可能录入的不完整
                2.nextLine():之前调nextInt(),nextDouble(),nextFloat()...
                                nextLine,就不会干活了

            解决办法:不用解决
                            Scanner：采集用户的信息(只在学习中会用到)

            目前使用方案:
                        需求如果要键盘录入字符串
                                如果所有的数据,都是字符串，直接nextLinevitable();
                                        举例：
                                            键盘录入用户名，键盘录入用户密码
                                 如果数据除了字符串，还有其他类型，需要调next();
                                        举例：
                                            键盘录入用户名，键盘录入用户密码，用户身高



 */

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数：");
        String n = sc.next();
        System.out.println(n);

        System.out.println("请输入一个数：");
        String K = sc.nextLine();
        System.out.println(K);
        //运行结果：
        //请输入一个数：
        //23
        //23
        //请输入一个数：
    }
}
