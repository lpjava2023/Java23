package com.itheima.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateDTest1 {
    /*
        需求:计算你来到这个世界多少天

        分析:
            1.键盘录入用户生日(日期字符串)
            2.创建SimpleDateFormat对象，指定模式，用于将日期对象字符串解析为Date日期对象(birthdayDate)
            3.创建Date日期对象，封装此刻时间(todayDate)
            4.long time = todayDate.getTime() - birthdayDate.getTime();
            5.将毫秒值，转换为天

                    time/1000/60/60/24
     */
    public static void main(String[] args) throws ParseException {

        //键盘输入，录入生日
        Scanner SC = new Scanner(System.in);
        System.out.println("输入生日：xxxx年xx月xx日");
        String birthday = SC.next();
//        String date = "2002年8月30日";

        //创建SimpleDateFormat对象，指定模式，用于将日期字符串解析为Date日期对象(birthdayDate)
        SimpleDateFormat simpleDateFormat= new SimpleDateFormat("yyyy年MM月dd日");

        //生日那一天的日期对象
        Date birthdayDate = simpleDateFormat.parse(birthday);

        //创建Date日期对象，封装此刻时间
        Date todayDate = new Date();

        //计算用户活了多少毫秒
        long time = todayDate.getTime()-birthdayDate.getTime();
        System.out.println(time/1000/60/60/24);
    }
}
