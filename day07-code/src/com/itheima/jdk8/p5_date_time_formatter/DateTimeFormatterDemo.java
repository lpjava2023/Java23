package com.itheima.jdk8.p5_date_time_formatter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterDemo {
    public static void main(String[] args) {

        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);//2023-10-05T22:36:45.394081700

        //获取格式化对象
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy年M月d日");

        //格式化
        String result = formatter.format(now);
        System.out.println(result);

        //解析
        String time = "2002年08月30日";//上面的M和d可以解析一位(8月8日)的，也可以解析两位(11月11日)的，但是MM和dd只能解析两位的
        LocalDate parse = LocalDate.parse(time, formatter);
        System.out.println(parse);
    }
}
