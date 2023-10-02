package com.itheima.integer;

public class IntegerTest {
    /*
        已知字符串String s = "10,50,30,20,40";
        请将该字符串转换为整数并存入数组
        随后将最大值打印在控制台
     */
    public static void main(String[] args) {
        String s = "10,50,30,20,40";

        //1.根据逗号做切割
        String[] sArr = s.split(",");

        //2.准备一个整数值数组
        int[] i = new int[sArr.length];

        //3.遍历字符串数组
        for (int j = 0; j < sArr.length; j++) {
            //sArr[j]:每一个数字字符
            //4.将数字字符转换为整数，并存入整数数组中
            i[j]=Integer.parseInt(sArr[j]);
        }

        //求最大值
        int max = i[0];
        for (int j = 1; j < i.length; j++) {
            if(max<i[j]){
                max=i[j];
            }
        }
        System.out.println(max);
    }
}
