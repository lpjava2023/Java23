package com.itheima.args;

public class ArgsDemo {
    public static void main(String[] args) {
        System.out.println(getSum(1, 2, 3));
        System.out.println(getSum(1, 2, 3, 4));
    }

    public static int getSum(int a, int... nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return sum;
    }

}
