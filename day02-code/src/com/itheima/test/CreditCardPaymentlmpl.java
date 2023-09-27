package com.itheima.test;

public class CreditCardPaymentlmpl implements Payment{
    @Override
    public void pay(double money) {
        System.out.println("通过信用卡卡支付了:"+money+"元");
    }
}
