package com.itheima.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class CalendarTest2 {
    /*
        需求:键盘录入一个日期字符串，程序输出这个日期是一年中第几天

            1.使用SimpleDateFormat，将日期字符转换为日期对象
            2.将日期对象，转换为Calendar对象
            3.调用get方法，获取一年中的第几天
     */
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入：");
        String dateContent = sc.next();

        //1.使用SimpleDateFormat，将日期字符转换为日期对象
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy年MM月dd日");

        Date date = dateFormat.parse(dateContent);

        //2.将日期对象，转换为Calendar对象
        Calendar c = Calendar.getInstance();
        c.setTime(date);

        //3.调用get方法，获取一年中的第几天
        int dayofYear = c.get(Calendar.DAY_OF_YEAR);
        System.out.println("这是一年中的第"+dayofYear+"天");
    }
}
