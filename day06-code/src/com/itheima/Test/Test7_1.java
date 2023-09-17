package com.itheima.Test;

import java.util.Random;

/*
   需求:请从26个英文字母(大小写都包含)，以及数字0-9，随机产生一个5位的字符串验证码并打印在控制台
   效果:uYq8i

   注意事项：打印字符类型数组名，不会看到地址值，而是看到数组的内容
 */
public class Test7_1 {
    public static void main(String[] args) {



        char[] arr = getChars();

        String chuan = getString(arr);

        System.out.println("产生的验证码："+chuan);
    }

    private static String getString(char[] arr) {
        Random k = new Random();
        String chuan = "";
        for(int i=0;i<5;i++){
            int ch = k.nextInt(arr.length);
            chuan+= arr[ch];
        }
        return chuan;
    }

    private static char[] getChars() {
        char[] arr=new char[26+26+10];
        int sort = 0;
        for(char c='a';c<='z';c++){
            arr[sort]= c;
            sort++;
        }
        for(char C='A';C<='Z';C++){
            arr[sort]= C;
            sort++;
        }
        //此处i<'10'不可以，ASCII表中没有'10'
        for(char i='0';i<='9';i++){
            arr[sort]= i;
            sort++;
        }
        //System.out.println(sort);62
        System.out.println(arr);
        return arr;
    }
}
