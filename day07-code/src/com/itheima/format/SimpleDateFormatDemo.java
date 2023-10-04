package com.itheima.format;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo {
    /*
        1.构造方法：
            public SimpleDateFormat():创建一个日期格式化对象，使用[默认模式]
            public SimpleDateFormat(String pattern):创建一个日期格式化对象，[手动指定模式]
        2.常用方法:
            public final String format(Date date):将日期对象，转换为字符串
            public

     */
    public static void main(String[] args) {


//        method();


        String today = ""


    }

    private static void method() {
        //创建一个日期格式化对象，使用[默认模式]
        //SimpleDateFormat simpleDateFormat = new SimpleDateFormat();

        //创建一个日期格式化对象，[手动指定模式]
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss E a");

        //创建Date对象，封装此刻的时间
        Date date = new Date();

        //将日期对象，转换为字符串
        String result = simpleDateFormat.format(date);

        System.out.println(result);//2023/10/4 下午10:34//2023年10月04日 23:46:50 周三 下午
    }
}
