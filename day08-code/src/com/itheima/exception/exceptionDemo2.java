package com.itheima.exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class exceptionDemo2 {
    /*
        编译时异常：编译阶段就出现的错误(语法错误不算)
                    ——需要在运行之前，给出解决方案
                    ——编译阶段就出现的错误，主要起到提醒作用

        运行时异常：编译过了，运行期间[可能会出现的错误]-通常都是程序员代码不严谨造成的
     */
                                                    //编译时异常     //编译时异常
    public static void main(String[] args) throws ParseException, FileNotFoundException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年M月d日");
        Date date = sdf.parse("2008年8月8");

        FileReader fr = new FileReader("D:\\BaiduNetdiskDownload\\win.png");
    }
}
