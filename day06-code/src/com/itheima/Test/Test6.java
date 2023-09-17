package com.itheima.Test;
/*
需求：
    在编程竞赛中，有6个评委为参赛选手打分，分数为0-100的整数分
    选手的最后得分为：去掉一个最高分和最低分，然后算平均值
 */

/*
        注意一点
        double a = 5/2; //输出为2.0，因为5与2都为整数，算出也为整数2，换为double为2.0
        double b =(5*1.0)/2;
        System.out.println(a);//2.0
        System.out.println(b);//2.5
*/


import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {

        /*
        注意此题中输入的数字必须为0-100;若为其他的数字需要报错，然后重新输入
         */

        int[] arr = initData();

        int sum = getSum(arr);

        int max = getMax(arr);

        int min = getMin(arr);

        //求平均分=(总分-最大值-最小值)=4   一般结果为小数
        double avg=((sum-max-min)*1.0)/ (arr.length-2);//此处*1.0因为结果要为小数，ruobu*1.0则结果为整数
        System.out.println("平均分"+avg);

    }
    /**
     * 数组中找最小值*/
    private static int getMin(int[] arr) {
        //4.求最小值
        int min= arr[0];
        for (int i = 1; i < arr.length ; i++) {
            if (arr[i]<min){
                min= arr[i];
            }
        }
        return min;
    }

    /**
     * 求数组中的最大值*/
    private static int getMax(int[] arr) {
        //3.求最大值
        int max= arr[0];
        for (int i = 1; i < arr.length ; i++) {
            if (arr[i]>max){
                max= arr[i];
            }
        }
        return max;
    }

    /**
     * 数组求和
     * */
    private static int getSum(int[] arr) {
        //2.求和
        int sum=0;
        for (int i = 0; i < arr.length ; i++) {
            sum+= arr[i];
        }
        return sum;
    }

    /**
     此方法用来键盘录入6个评委的分数
     */
    private static int[] initData() {
        System.out.println("请六位评委打分：");
        Scanner sc = new Scanner(System.in);
        //1.用数组存入值，方便计算
        //1.1创建数组
        int[] arr=new int[6];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入第"+(i+1)+"个评委的分数:");
            //1.2将键盘输入的数存入数组中
            /*
            此处需要将sc.nextInt赋值给score
            若不赋值继续用sc.nextInt将会需要你输入三次
            错误代码
//          if(sc.nextInt()>=0 && sc.nextInt()<=100){
//          arr[i]=sc.nextInt();*/

            int score = sc.nextInt();
            if(score>=0 && score<=100){
                arr[i]=score;
            }
            else{
                System.out.println("输入错误，请重新输入");
                i--;
            }
        }
        return arr;
    }
}
