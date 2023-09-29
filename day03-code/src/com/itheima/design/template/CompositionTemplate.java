package com.itheima.design.template;

public abstract class CompositionTemplate {
    public final void write(){
        System.out.println("我的爸爸");

        text();

        System.out.println("这就是我的爸爸");
    }
    public abstract void text();

}
