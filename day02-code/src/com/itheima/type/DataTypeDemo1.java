package com.itheima.type;

public class DataTypeDemo1 {
    /*
    数据类型
    1.基本数据类型
        整数               字节(单位)
            byte            1           -128-127
            short           2
            int             4              10位
            long            8
        小数
            float           4
            double          8
        字符
            char            2
        布尔
            boolean         1
    2.引用数据类型
    --------------------------------------------------
    使用思路:
           1.整数类型:首选int,如果发现int装不了，将类型换为long,定义long类型变量需要加入L的标识
           2.小数类型:首选double,非要用float类型，需要加入F标识
     */
    public static void main (String[] args){
        long a = 15000000000L;
        float height = 183.1F;
        char gender = '男';
        boolean flag = true;
        boolean flags = false;
    }
}
