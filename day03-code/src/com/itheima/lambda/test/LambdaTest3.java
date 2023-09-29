package com.itheima.lambda.test;

import java.util.Random;

public class LambdaTest3 {
    public static void main(String[] args) {
        useRandomNumHandler(new RandomNumHandler() {
            @Override
            public int getNumber() {
//                Random r = new Random();
//                int R =r.nextInt(100)+1;
//                return R;
                return new Random().nextInt(100)+1;
            }
        });

        useRandomNumHandler(()->new Random().nextInt(100)+1);
    }

    public static void useRandomNumHandler(RandomNumHandler randomNumHandler){
        int result=randomNumHandler.getNumber();
        System.out.println(result);
    }

}
interface RandomNumHandler{
    int getNumber();
}