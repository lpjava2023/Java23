package com.itheima.Test;

import java.util.Random;
import java.util.Scanner;

public class radomDemo {
    public static void main(String[] args) {
        Game();


    }
    public static void Game(){
        Scanner sc = new Scanner(System.in);
        Random r =new Random();
        //使用Random产生一个1-100之间的随机数——randomNumber
        int randomNumber = r.nextInt(100)+1;//输入100表述取值范围为0-99
        while(true){
            //2.录入数据
            System.out.println("请输入:");
            int scNumber = sc.nextInt();
            //3.对比
            if(scNumber>randomNumber){
                System.out.println("猜大了");
            }
            else if(scNumber<randomNumber){
                System.out.println("猜小了");
            }else{
                System.out.println("猜对了");
                break;
            }
        }
        System.out.println("恭喜");
    }

}

