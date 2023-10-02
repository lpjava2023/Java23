package com.itheima.bigdecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalDemo {
    /*
        BigDecimal类：解决小数运算中，出现的不精确问题

        BigDecimal创建对象
        返回的是BigDemcial对象

        public  BigDecimal(double val):不推荐，无法保证小数运算的精度
        -----------------------------------------------
        public  BigDecimal(String val)

        直接调其静态方法
        public  static  BigDecimal valueof(double val)
     */
    public static void main(String[] args) {
        double m1 = 0.1;
        double m2 = 0.2;
        System.out.println(m1+m2);//0.30000000000000004

        BigDecimal t1 = new BigDecimal(0.1);
        BigDecimal t2 = new BigDecimal(0.2);
        //这是两个对象不可以直接相加
        System.out.println(t1.add(t2));//0.3000000000000000166533453693773481063544750213623046875

        BigDecimal t3 = new BigDecimal("0.1");
        BigDecimal t4 = new BigDecimal("0.2");
        System.out.println(t3.add(t4));//0.3

        BigDecimal t5 = BigDecimal.valueOf(0.1);
        BigDecimal t6 = BigDecimal.valueOf(0.2);
        System.out.println(t5.add(t6));//0.3
        System.out.println(t5.subtract(t6));//-0.1
        System.out.println(t5.multiply(t6));//0.02
        System.out.println(t5.divide(t6));//0.5
        System.out.println(t5.add(t6));//0.4

        BigDecimal t7 = BigDecimal.valueOf(10.0);
        BigDecimal t8 = BigDecimal.valueOf(3.0);
//        //注意：如果使用BigDecimal运算，出现除不尽的情况，会出现异常
//        System.out.println(t7.divide(t8));
        System.out.println(t7.divide(t8,2,RoundingMode.DOWN));//向下
        System.out.println(t7.divide(t8,2,RoundingMode.UP));//向上
        System.out.println(t7.divide(t8,2,RoundingMode.HALF_UP));//四舍五入

        BigDecimal div = t7.divide(t8, 2, RoundingMode.HALF_UP);// 返回的是BigDemcial对象
        double v = div.doubleValue();
        Math.abs(v);
    }
}
