package com.itheima.system;

public class SystemDemo {
    /*
        System也是static修饰，是工具类

        常见方法
            1.public static void exit (int status):终止当前运行的Java虚拟机，非零表示异常终止
            2.public static long currentTimeMills():返回当前系统的时间毫秒值形式
                            //返回1970年1月1日0时0分0秒，到现在所经历的毫秒值
                            //——可以用来计算一个代码运行的是时间
            3.public static void arraycopy(Object src,int srcPos,Object dest,int destPos,int length):数组拷贝
                                           1.数据源数组
                                           2.起始索引——从哪里开始拷贝
                                           3.目的地数组
                                           4.起始索引——拷贝方法到哪里
                                           5.拷贝的个数
     */
    public static void main(String[] args) {
        //2.返回当前系统的时间毫秒值形式
                            //返回1970年1月1日0时0分0秒，到现在所经历的毫秒值
                            //——可以用来计算一个代码运行的是时间
        System.out.println(System.currentTimeMillis());

        Time();

        //3.拷贝数组
        int[] arr = new int[]{11,22,33,44};
        int[] arr1 = new int[3];
        System.arraycopy(arr,1,arr1,0,2);
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);//22 33 0
        }

    }

    private static void Time() {
        long start = System.currentTimeMillis();

        String s="";
        for (int i = 0; i <1000 ; i++) {
            s+=i;
        }
        long end = System.currentTimeMillis();

        System.out.println(s);
        System.out.println(end-start);
    }


}
