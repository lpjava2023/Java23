package com.itheima.date;

import java.util.Date;

public class DateDemo1 {
    /*

        1.构造方法：
            publi Date():将当前时间，封装为Date日期对象
            public Date(long time):把时间毫秒值转换为Date日期对象

        2.常见方法：
            public long getTime():返回从1970年1月1日00:00:00走到此刻的总毫秒数
            public void setTime(long time):设置日期对象的时间为当前时间毫秒值对相应的时间
     */
    public static void main(String[] args) {

        //将当前时间，封装为Date日期对象
        Date d = new Date();
        System.out.println(d);//Wed Oct 04 21:59:10 CST 2023

        //把时间毫秒值转换为Date日期对象
        Date d1 = new Date(0L);
        System.out.println(d1);//Thu Jan 01 08:00:00 CST 1970

        //返回从1970年1月1日00:00:00走到此刻的总毫秒数
        System.out.println(d.getTime());//1696428367488
        System.out.println(d1.getTime());//0

        //设置日期对象的时间为当前时间毫秒值对相应的时间
        Date d2 = new Date();
        d2.setTime(0L);
        System.out.println(d2);
        //Date d4 =new Date(0l);


    }
}
