package com.itheima.test;

public class PlatformPaymentlmpl implements Payment {
    @Override
    public void pay(double money) {
        System.out.println("通过银行卡网银支付了："+money+"元");
    }
}
