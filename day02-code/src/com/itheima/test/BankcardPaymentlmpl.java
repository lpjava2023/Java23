package com.itheima.test;

public class BankcardPaymentlmpl implements Payment {

    @Override
    public void pay(double money) {
        System.out.println("通过银行网卡支付了:"+money+"元");
    }
}
