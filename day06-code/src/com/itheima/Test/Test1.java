package com.itheima.Test;
/*
打印1-100中满足逢七过的规则的数据(有七或者七的倍数)
 */

public class Test1 {
    public static void main(String[] args) {
        knockSeven();
    }
    public static void knockSeven(){
        //1.通过循环获取1-100之间的每一个数
        //2.数值拆分，拆分出十位和个位
        //3.用if判断
        //4.打印出想要的数据
        for(int i=1;i<=100;i++){
            int ge = i%10;
            int shi = i/10%10;
            if(ge==7||shi==7||i%7==0){
                System.out.println(i);
            }
        }

    }
}
