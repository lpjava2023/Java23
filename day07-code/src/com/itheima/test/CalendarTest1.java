package com.itheima.test;

import java.util.Calendar;

public class CalendarTest1 {
    /*
        需求:使用程序判断出2050年3月1日是否为疯狂星期四
     */
    public static void main(String[] args) {

        //1.获取日期对象(此刻对象)
        Calendar c = Calendar.getInstance();

        //2.调用set方法，将时间设置为2050年3月1日
        //因为月份是按0-11算的，所以想要三月，输入得数为2
        c.set(2050,2,1);

        //3.获取星期
        char[] weeks = {' ','日','一','二','三','四','五','六'};
        //               0    1   2    3    4   5    6   7
        int week = c.get(Calendar.DAY_OF_WEEK);
        if(weeks[week]=='四'){
            System.out.println("疯狂星期四，吃个好");
        }else{
            System.out.println("回家吃");
        }
    }
}
